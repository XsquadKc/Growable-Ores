package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GrowOres.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {


        blockWithItem(ModBlocks.GROWING_BLOCK);
        //Add the following to the above *once* after adding new blocks, then move and replace generated block models
        reedBlockWithItem(ModBlocks.COAL_REED);
        reedBlockWithItem(ModBlocks.IRON_REED);
        reedBlockWithItem(ModBlocks.COPPER_REED);
        reedBlockWithItem(ModBlocks.GOLD_REED);
        reedBlockWithItem(ModBlocks.REDSTONE_REED);
        reedBlockWithItem(ModBlocks.LAPIS_REED);
        reedBlockWithItem(ModBlocks.DIAMOND_REED);
        reedBlockWithItem(ModBlocks.EMERALD_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_COAL_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_IRON_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_COPPER_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_GOLD_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_REDSTONE_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_LAPIS_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_DIAMOND_REED);
        reedBlockWithItem(ModBlocks.DEEPSLATE_EMERALD_REED);
        reedBlockWithItem(ModBlocks.NETHER_QUARTZ_REED);
        reedBlockWithItem(ModBlocks.NETHER_GOLD_REED);
        reedBlockWithItem(ModBlocks.OBSIDIAN_REED);
        reedBlockWithItem(ModBlocks.GLOWSTONE_REED);
        reedBlockWithItem(ModBlocks.CLAY_REED);
        reedBlockWithItem(ModBlocks.BLAZE_REED);
        reedBlockWithItem(ModBlocks.ENDER_REED);
        reedBlockWithItem(ModBlocks.AMETHYST_REED);
        reedBlockWithItem(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        reedBlockWithItem(ModBlocks.CERTUS_QUARTZ_REED);

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

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockWithoutItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void reedBlockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cross(
                blockRegistryObject.getId().getPath(),
                blockTexture(blockRegistryObject.get())
                ).renderType("cutout")
                );
    }

    private void reedBlockWithoutItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(
                blockRegistryObject.getId().getPath(),
                blockTexture(blockRegistryObject.get())
                ).renderType("cutout")
                );

    }


}
