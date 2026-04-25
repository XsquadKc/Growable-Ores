package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, GrowOres.MOD_ID);
    }



    @Override
    protected void registerModels(BlockModelGenerators blockStateModelGenerator, ItemModelGenerators itemModelGenerator) {

        blockStateModelGenerator.createTrivialCube(ModBlocks.GROWING_BLOCK.get());

        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.COAL_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.IRON_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.COPPER_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.GOLD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.REDSTONE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.LAPIS_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DIAMOND_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.EMERALD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_COAL_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_IRON_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_COPPER_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_GOLD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_REDSTONE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_LAPIS_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_DIAMOND_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_EMERALD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_QUARTZ_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_GOLD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.OBSIDIAN_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.GLOWSTONE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.CLAY_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.BLAZE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ENDER_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.AMETHYST_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ANCIENT_DEBRIS_REED.get());

        //MODS
        //Applied Energistics 2
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.CERTUS_QUARTZ_REED.get());

        //Mystical Agriculture & Mystical Agradditions
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.SOULIUM_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.PROSPERITY_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_PROSPERITY_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_PROSPERITY_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_PROSPERITY_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.INFERIUM_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_INFERIUM_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_INFERIUM_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_INFERIUM_REED.get());

        //Extreme Reactors
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ANGLESITE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.BENITOITE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.YELLORITE_REED.get());

        //RFTools
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DIMENSIONALSHARD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.NETHER_DIMENSIONALSHARD_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.END_DIMENSIONALSHARD_REED.get());

        //Powah! Rearchitected
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.URANINITE_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_URANINITE_REED.get());

        //Create
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.ZINC_REED.get());
        RegisterOreReedBlock(blockStateModelGenerator, ModBlocks.DEEPSLATE_ZINC_REED.get());
        
        
        
        // GENERATE ITEMS
        itemModelGenerator.generateFlatItem(ModItems.COAL_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.IRON_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GOLD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.REDSTONE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.LAPIS_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DIAMOND_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.EMERALD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_COAL_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_IRON_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_COPPER_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_GOLD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_REDSTONE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_LAPIS_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_DIAMOND_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_EMERALD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_QUARTZ_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_GOLD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.OBSIDIAN_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GLOWSTONE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CLAY_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BLAZE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ENDER_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ANCIENT_DEBRIS_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //MODS
        //Applied Energistics 2
        itemModelGenerator.generateFlatItem(ModItems.CERTUS_QUARTZ_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //Mystical Agriculture & Mystical Agradditions
        itemModelGenerator.generateFlatItem(ModItems.SOULIUM_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.PROSPERITY_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_PROSPERITY_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_PROSPERITY_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.INFERIUM_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_INFERIUM_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_INFERIUM_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_INFERIUM_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //Extreme Reactors
        itemModelGenerator.generateFlatItem(ModItems.ANGLESITE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BENITOITE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.YELLORITE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //RFTools
        itemModelGenerator.generateFlatItem(ModItems.DIMENSIONALSHARD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.END_DIMENSIONALSHARD_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //Powah! Rearchitected
        itemModelGenerator.generateFlatItem(ModItems.URANITITE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_URANITITE_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);

        //Create
        itemModelGenerator.generateFlatItem(ModItems.ZINC_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DEEPSLATE_ZINC_REED_ITEM.get(), ModelTemplates.FLAT_ITEM);
        
    }
    public void RegisterOreReedBlock(BlockModelGenerators blockStateModelGenerator, Block block){

        blockStateModelGenerator.createCrossBlock(block,BlockModelGenerators.PlantType.TINTED);
    }
    



}