package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.util.ModTags;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookupProvider) {
        super(output, lookupProvider);
    }
    
    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.GROWING_BLOCK)
                .add(ModBlocks.CLAY_REED);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COAL_REED)
                .add(ModBlocks.IRON_REED)
                .add(ModBlocks.COPPER_REED)
                .add(ModBlocks.GOLD_REED)
                .add(ModBlocks.REDSTONE_REED)
                .add(ModBlocks.LAPIS_REED)
                .add(ModBlocks.DIAMOND_REED)
                .add(ModBlocks.EMERALD_REED)
                .add(ModBlocks.DEEPSLATE_COAL_REED)
                .add(ModBlocks.DEEPSLATE_IRON_REED)
                .add(ModBlocks.DEEPSLATE_COPPER_REED)
                .add(ModBlocks.DEEPSLATE_GOLD_REED)
                .add(ModBlocks.DEEPSLATE_REDSTONE_REED)
                .add(ModBlocks.DEEPSLATE_LAPIS_REED)
                .add(ModBlocks.DEEPSLATE_DIAMOND_REED)
                .add(ModBlocks.DEEPSLATE_EMERALD_REED)
                .add(ModBlocks.NETHER_QUARTZ_REED)
                .add(ModBlocks.NETHER_GOLD_REED)
                .add(ModBlocks.OBSIDIAN_REED)
                .add(ModBlocks.GLOWSTONE_REED)
                .add(ModBlocks.BLAZE_REED)
                .add(ModBlocks.ENDER_REED)
                .add(ModBlocks.AMETHYST_REED)
                .add(ModBlocks.ANCIENT_DEBRIS_REED)
                .add(ModBlocks.CERTUS_QUARTZ_REED)
                .add(ModBlocks.SOULIUM_REED)
                .add(ModBlocks.PROSPERITY_REED)
                .add(ModBlocks.DEEPSLATE_PROSPERITY_REED)
                .add(ModBlocks.NETHER_PROSPERITY_REED)
                .add(ModBlocks.END_PROSPERITY_REED)
                .add(ModBlocks.INFERIUM_REED)
                .add(ModBlocks.DEEPSLATE_INFERIUM_REED)
                .add(ModBlocks.NETHER_INFERIUM_REED)
                .add(ModBlocks.END_INFERIUM_REED)
                .add(ModBlocks.ANGLESITE_REED)
                .add(ModBlocks.BENITOITE_REED)
                .add(ModBlocks.YELLORITE_REED)
                .add(ModBlocks.DIMENSIONALSHARD_REED)
                .add(ModBlocks.NETHER_DIMENSIONALSHARD_REED)
                .add(ModBlocks.END_DIMENSIONALSHARD_REED)
                .add(ModBlocks.URANINITE_REED)
                .add(ModBlocks.DEEPSLATE_URANINITE_REED)
                .add(ModBlocks.ZINC_REED)
                .add(ModBlocks.DEEPSLATE_ZINC_REED);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GROWING_BLOCK)
                .add(ModBlocks.COAL_REED)
                .add(ModBlocks.IRON_REED)
                .add(ModBlocks.COPPER_REED);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_REED)
                .add(ModBlocks.REDSTONE_REED)
                .add(ModBlocks.LAPIS_REED)
                .add(ModBlocks.DIAMOND_REED)
                .add(ModBlocks.EMERALD_REED)
                .add(ModBlocks.DEEPSLATE_COAL_REED)
                .add(ModBlocks.DEEPSLATE_IRON_REED)
                .add(ModBlocks.DEEPSLATE_COPPER_REED)
                .add(ModBlocks.DEEPSLATE_GOLD_REED)
                .add(ModBlocks.DEEPSLATE_REDSTONE_REED)
                .add(ModBlocks.DEEPSLATE_LAPIS_REED)
                .add(ModBlocks.DEEPSLATE_DIAMOND_REED)
                .add(ModBlocks.DEEPSLATE_EMERALD_REED)
                .add(ModBlocks.NETHER_QUARTZ_REED)
                .add(ModBlocks.NETHER_GOLD_REED);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_REED)
                .add(ModBlocks.BLAZE_REED)
                .add(ModBlocks.ENDER_REED)
                .add(ModBlocks.ANCIENT_DEBRIS_REED);

        getOrCreateTagBuilder(ModTags.Blocks.GROWING_BLOCKS)
                .add(ModBlocks.GROWING_BLOCK);
    }
}
