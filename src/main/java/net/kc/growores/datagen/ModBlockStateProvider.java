package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.block.custom.OreReedBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GrowOres.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {


        blockWithItem(ModBlocks.GROWING_BLOCK);
        //Add the following to the above *once* after adding new blocks, then move and replace generated block models
        reedBlockWithoutItem(ModBlocks.COAL_REED);
        reedBlockWithoutItem(ModBlocks.IRON_REED);
        reedBlockWithoutItem(ModBlocks.COPPER_REED);
        reedBlockWithoutItem(ModBlocks.GOLD_REED);
        reedBlockWithoutItem(ModBlocks.REDSTONE_REED);
        reedBlockWithoutItem(ModBlocks.LAPIS_REED);
        reedBlockWithoutItem(ModBlocks.DIAMOND_REED);
        reedBlockWithoutItem(ModBlocks.EMERALD_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_COAL_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_IRON_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_COPPER_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_GOLD_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_REDSTONE_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_LAPIS_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_DIAMOND_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_EMERALD_REED);
        reedBlockWithoutItem(ModBlocks.NETHER_QUARTZ_REED);
        reedBlockWithoutItem(ModBlocks.NETHER_GOLD_REED);
        reedBlockWithoutItem(ModBlocks.OBSIDIAN_REED);
        reedBlockWithoutItem(ModBlocks.GLOWSTONE_REED);
        reedBlockWithoutItem(ModBlocks.CLAY_REED);
        reedBlockWithoutItem(ModBlocks.BLAZE_REED);
        reedBlockWithoutItem(ModBlocks.ENDER_REED);
        reedBlockWithoutItem(ModBlocks.AMETHYST_REED);
        reedBlockWithoutItem(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        reedBlockWithoutItem(ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        reedBlockWithoutItem(ModBlocks.SOULIUM_REED);
        reedBlockWithoutItem(ModBlocks.PROSPERITY_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_PROSPERITY_REED);
        reedBlockWithoutItem(ModBlocks.NETHER_PROSPERITY_REED);
        reedBlockWithoutItem(ModBlocks.END_PROSPERITY_REED);
        reedBlockWithoutItem(ModBlocks.INFERIUM_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_INFERIUM_REED);
        reedBlockWithoutItem(ModBlocks.NETHER_INFERIUM_REED);
        reedBlockWithoutItem(ModBlocks.END_INFERIUM_REED);

        //Extreme Reactors
        reedBlockWithoutItem(ModBlocks.ANGLESITE_REED);
        reedBlockWithoutItem(ModBlocks.BENITOITE_REED);
        reedBlockWithoutItem(ModBlocks.YELLORITE_REED);

        //RFTools
        reedBlockWithoutItem(ModBlocks.DIMENSIONALSHARD_REED);
        reedBlockWithoutItem(ModBlocks.NETHER_DIMENSIONALSHARD_REED);
        reedBlockWithoutItem(ModBlocks.END_DIMENSIONALSHARD_REED);

        //Powah! Rearchitected
        reedBlockWithoutItem(ModBlocks.URANINITE_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_URANINITE_REED);

        //Create
        reedBlockWithoutItem(ModBlocks.ZINC_REED);
        reedBlockWithoutItem(ModBlocks.DEEPSLATE_ZINC_REED);
    }


    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockWithoutItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void reedBlockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cross(
                blockRegistryObject.getId().getPath(),
                blockTexture(blockRegistryObject.get())
                ).renderType("cutout")
                );
    }

    private void reedBlockWithoutItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(
                blockRegistryObject.getId().getPath(),
                blockTexture(blockRegistryObject.get())
                ).renderType("cutout")
                );
    }

}
