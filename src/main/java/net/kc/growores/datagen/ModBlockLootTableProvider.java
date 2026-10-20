package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kc.growores.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GROWING_BLOCK);
        addDrop(ModBlocks.COAL_REED);
        addDrop(ModBlocks.IRON_REED);
        addDrop(ModBlocks.COPPER_REED);
        addDrop(ModBlocks.GOLD_REED);
        addDrop(ModBlocks.REDSTONE_REED);
        addDrop(ModBlocks.LAPIS_REED);
        addDrop(ModBlocks.DIAMOND_REED);
        addDrop(ModBlocks.EMERALD_REED);
        addDrop(ModBlocks.DEEPSLATE_COAL_REED);
        addDrop(ModBlocks.DEEPSLATE_IRON_REED);
        addDrop(ModBlocks.DEEPSLATE_COPPER_REED);
        addDrop(ModBlocks.DEEPSLATE_GOLD_REED);
        addDrop(ModBlocks.DEEPSLATE_REDSTONE_REED);
        addDrop(ModBlocks.DEEPSLATE_LAPIS_REED);
        addDrop(ModBlocks.DEEPSLATE_DIAMOND_REED);
        addDrop(ModBlocks.DEEPSLATE_EMERALD_REED);
        addDrop(ModBlocks.NETHER_QUARTZ_REED);
        addDrop(ModBlocks.NETHER_GOLD_REED);
        addDrop(ModBlocks.OBSIDIAN_REED);
        addDrop(ModBlocks.GLOWSTONE_REED);
        addDrop(ModBlocks.CLAY_REED);
        addDrop(ModBlocks.BLAZE_REED);
        addDrop(ModBlocks.ENDER_REED);
        addDrop(ModBlocks.AMETHYST_REED);
        addDrop(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        addDrop(ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        addDrop(ModBlocks.SOULIUM_REED);
        addDrop(ModBlocks.PROSPERITY_REED);
        addDrop(ModBlocks.DEEPSLATE_PROSPERITY_REED);
        addDrop(ModBlocks.NETHER_PROSPERITY_REED);
        addDrop(ModBlocks.END_PROSPERITY_REED);
        addDrop(ModBlocks.INFERIUM_REED);
        addDrop(ModBlocks.DEEPSLATE_INFERIUM_REED);
        addDrop(ModBlocks.NETHER_INFERIUM_REED);
        addDrop(ModBlocks.END_INFERIUM_REED);

        //Extreme Reactors
        addDrop(ModBlocks.ANGLESITE_REED);
        addDrop(ModBlocks.BENITOITE_REED);
        addDrop(ModBlocks.YELLORITE_REED);

        //RFTools
        addDrop(ModBlocks.DIMENSIONALSHARD_REED);
        addDrop(ModBlocks.NETHER_DIMENSIONALSHARD_REED);
        addDrop(ModBlocks.END_DIMENSIONALSHARD_REED);

        //Powah! Rearchitected
        addDrop(ModBlocks.URANINITE_REED);
        addDrop(ModBlocks.DEEPSLATE_URANINITE_REED);

        //Create
        addDrop(ModBlocks.ZINC_REED);
        addDrop(ModBlocks.DEEPSLATE_ZINC_REED);



    }

}