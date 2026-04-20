package net.kc.growores.block.custom;

import net.kc.growores.item.ModItems;
import net.kc.growores.util.ModTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.block.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OreReedBlock extends SugarCaneBlock {

    public int maxHeight;
    public OreReedBlock(AbstractBlock.Settings pSettings, int maxHeight) {
        super(pSettings.noCollision().ticksRandomly().pistonBehavior(PistonBehavior.DESTROY));
        this.maxHeight = maxHeight;
    }

    @Override
    public void randomTick(BlockState pState, ServerWorld pWorld, net.minecraft.util.math.BlockPos pPos, Random pRandom) {
        if (pWorld.isAir(pPos.up())) {
            int i;
            for(i = 1; pWorld.getBlockState(pPos.down(i)).isOf(this); ++i) {
            }

            if (i < maxHeight) {
                int j = (Integer) pState.get(AGE);
                if (j == 15) {
                    pWorld.setBlockState(pPos.up(), this.getDefaultState());
                    pWorld.setBlockState(pPos, pState.with(AGE, 0), Block.NO_REDRAW);
                } else {
                    pWorld.setBlockState(pPos, pState.with(AGE, j + 1), Block.NO_REDRAW);
                }

            }
        }

    }

    @Override
    public boolean canPlaceAt(BlockState pState, WorldView pLevel, BlockPos pPos) {
        BlockState blockstate = pLevel.getBlockState(pPos.down());
        if (blockstate.isOf(this)) {
            return true;
        } else {
            return blockstate.isIn(ModTags.Blocks.GROWING_BLOCKS);
        }
    }

}
