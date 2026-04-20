package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Optional;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GROWING_BLOCK);
        
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

    public void RegisterOreReedBlock(BlockStateModelGenerator blockStateModelGenerator, Block block){
        Identifier texture = TextureMap.getId(block);

        Identifier modelId = Models.CROSS.upload(
                block,
                TextureMap.cross(texture),
                blockStateModelGenerator.modelCollector
        );

        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block,
                        BlockStateVariant.create().put(VariantSettings.MODEL, modelId)
                )
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        
        itemModelGenerator.register(ModItems.COAL_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_COAL_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_IRON_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_COPPER_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_GOLD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_REDSTONE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_LAPIS_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_DIAMOND_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_EMERALD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_QUARTZ_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_GOLD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWSTONE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLAY_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_DEBRIS_REED_ITEM, Models.GENERATED);

        //MODS
        //Applied Energistics 2
        itemModelGenerator.register(ModItems.CERTUS_QUARTZ_REED_ITEM, Models.GENERATED);

        //Mystical Agriculture & Mystical Agradditions
        itemModelGenerator.register(ModItems.SOULIUM_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROSPERITY_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_PROSPERITY_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_PROSPERITY_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFERIUM_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_INFERIUM_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_INFERIUM_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_INFERIUM_REED_ITEM, Models.GENERATED);

        //Extreme Reactors
        itemModelGenerator.register(ModItems.ANGLESITE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BENITOITE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLORITE_REED_ITEM, Models.GENERATED);

        //RFTools
        itemModelGenerator.register(ModItems.DIMENSIONALSHARD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_DIMENSIONALSHARD_REED_ITEM, Models.GENERATED);

        //Powah! Rearchitected
        itemModelGenerator.register(ModItems.URANITITE_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_URANITITE_REED_ITEM, Models.GENERATED);

        //Create
        itemModelGenerator.register(ModItems.ZINC_REED_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_ZINC_REED_ITEM, Models.GENERATED);
    }

}