package net.kc.growores.block.custom;

import net.kc.growores.item.ModItems;
import net.kc.growores.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.IPlantable;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OreReedBlock extends SugarCaneBlock {

    public int maxHeight;
    public OreReedBlock(Properties pProperties, int maxHeight) {
        super(pProperties.noCollision().randomTicks().pushReaction(PushReaction.DESTROY));
        this.maxHeight = maxHeight;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.isEmptyBlock(pPos.above())) {
            int i;
            for(i = 1; pLevel.getBlockState(pPos.below(i)).is(this); ++i) {
            }

            if (i < maxHeight) {
                int j = pState.getValue(AGE);
                if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(pLevel, pPos, pState, true)) {
                    if (j == 15) {
                        pLevel.setBlockAndUpdate(pPos.above(), this.defaultBlockState());
                        net.minecraftforge.common.ForgeHooks.onCropsGrowPost(pLevel, pPos.above(), this.defaultBlockState());
                        pLevel.setBlock(pPos, pState.setValue(AGE, Integer.valueOf(0)), 4);
                    } else {
                        pLevel.setBlock(pPos, pState.setValue(AGE, Integer.valueOf(j + 1)), 4);
                    }
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
