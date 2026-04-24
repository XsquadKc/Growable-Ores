package net.kc.growores.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.resources.model.cuboid.ItemModelGenerator;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.Optional;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createTrivialCube(ModBlocks.GROWING_BLOCK);
        
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.COAL_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.IRON_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.COPPER_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.GOLD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.REDSTONE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.LAPIS_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DIAMOND_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.EMERALD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_COAL_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_IRON_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_COPPER_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_GOLD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_REDSTONE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_LAPIS_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_DIAMOND_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_EMERALD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_QUARTZ_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_GOLD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.OBSIDIAN_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.GLOWSTONE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.CLAY_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.BLAZE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ENDER_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.AMETHYST_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.SOULIUM_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.PROSPERITY_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_PROSPERITY_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_PROSPERITY_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_PROSPERITY_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.INFERIUM_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_INFERIUM_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_INFERIUM_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_INFERIUM_REED);

        //Extreme Reactors
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ANGLESITE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.BENITOITE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.YELLORITE_REED);

        //RFTools
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DIMENSIONALSHARD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_DIMENSIONALSHARD_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_DIMENSIONALSHARD_REED);

        //Powah! Rearchitected
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.URANINITE_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_URANINITE_REED);

        //Create
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ZINC_REED);
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_ZINC_REED);
    }


    public void RegisterOreReedBlock(BlockModelGenerators blockStateModelGenerator, Block block){

        blockStateModelGenerator.createCrossBlock(block,BlockModelGenerators.PlantType.TINTED);
    }

//    private void reedBlock(BlockModelGenerators blockStateModelGenerator, Block block) {
//        Identifier modelId = ModelTemplates.CROSS(
//                block,
//                TextureMapping.cross(TextureMapping.getBlockTexture(block)),
//                blockStateModelGenerator.modelOutput,
//                model -> model.add("render_type", "cutout")
//        );
//
//        blockStateModelGenerator.blockStateOutput.accept(
//                BlockStateProvider(block,
//                        MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(modelId))
//                )
//        );
//    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        
        itemModelGenerator.generateFlatItem(ModItems.COAL_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.IRON_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GOLD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.REDSTONE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.LAPIS_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DIAMOND_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.EMERALD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_COAL_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_IRON_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_COPPER_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_GOLD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_REDSTONE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_LAPIS_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_DIAMOND_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_EMERALD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_QUARTZ_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_GOLD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.OBSIDIAN_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GLOWSTONE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CLAY_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BLAZE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ENDER_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ANCIENT_DEBRIS_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //MODS
        //Applied Energistics 2
        itemModelGenerator.generateFlatItem(ModItems.CERTUS_QUARTZ_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //Mystical Agriculture & Mystical Agradditions
        itemModelGenerator.generateFlatItem(ModItems.SOULIUM_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PROSPERITY_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_PROSPERITY_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_PROSPERITY_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INFERIUM_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_INFERIUM_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_INFERIUM_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_INFERIUM_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //Extreme Reactors
        itemModelGenerator.generateFlatItem(ModItems.ANGLESITE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BENITOITE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.YELLORITE_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //RFTools
        itemModelGenerator.generateFlatItem(ModItems.DIMENSIONALSHARD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_DIMENSIONALSHARD_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //Powah! Rearchitected
        itemModelGenerator.generateFlatItem(ModItems.URANITITE_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_URANITITE_REED_ITEM, ModelTemplates.FLAT_ITEM);

        //Create
        itemModelGenerator.generateFlatItem(ModItems.ZINC_REED_ITEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_ZINC_REED_ITEM, ModelTemplates.FLAT_ITEM);
    }

}