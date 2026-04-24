package net.kc.growores.block.custom;

import net.kc.growores.item.ModItems;
import net.kc.growores.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class OreReedBlock extends SugarCaneBlock {

    public int maxHeight;
    public OreReedBlock(BlockBehaviour.Properties pSettings, int maxHeight) {
        super(pSettings.randomTicks().pushReaction(PushReaction.DESTROY));
        this.maxHeight = maxHeight;
        this.registerDefaultState((this.stateDefinition.any()).setValue(AGE, 0));
    }

    public OreReedBlock(final BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((this.stateDefinition.any()).setValue(AGE, 0));
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pWorld, BlockPos pPos, RandomSource pRandom) {
        if (pWorld.isEmptyBlock(pPos.above())) {
            int i;
            for(i = 1; pWorld.getBlockState(pPos.below(i)).is(this); ++i) {
            }

            if (i < maxHeight) {
                int j = (Integer) pState.getValue(AGE);
                if (j == 15) {
                    pWorld.setBlockAndUpdate(pPos.above(), this.defaultBlockState());
                    pWorld.setBlock(pPos, pState.setValue(AGE, 0), 260);
                } else {
                    pWorld.setBlock(pPos, pState.setValue(AGE, j + 1), 260);
                }

            }
        }

    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockState blockstate = pLevel.getBlockState(pPos.below());
        if (blockstate.is(this)) {
            return true;
        } else {
            return blockstate.is(ModTags.Blocks.GROWING_BLOCKS);
        }
    }

}
