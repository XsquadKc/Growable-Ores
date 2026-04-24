package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.kc.growores.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.GROWING_BLOCK);
        dropSelf(ModBlocks.COAL_REED);
        dropSelf(ModBlocks.IRON_REED);
        dropSelf(ModBlocks.COPPER_REED);
        dropSelf(ModBlocks.GOLD_REED);
        dropSelf(ModBlocks.REDSTONE_REED);
        dropSelf(ModBlocks.LAPIS_REED);
        dropSelf(ModBlocks.DIAMOND_REED);
        dropSelf(ModBlocks.EMERALD_REED);
        dropSelf(ModBlocks.DEEPSLATE_COAL_REED);
        dropSelf(ModBlocks.DEEPSLATE_IRON_REED);
        dropSelf(ModBlocks.DEEPSLATE_COPPER_REED);
        dropSelf(ModBlocks.DEEPSLATE_GOLD_REED);
        dropSelf(ModBlocks.DEEPSLATE_REDSTONE_REED);
        dropSelf(ModBlocks.DEEPSLATE_LAPIS_REED);
        dropSelf(ModBlocks.DEEPSLATE_DIAMOND_REED);
        dropSelf(ModBlocks.DEEPSLATE_EMERALD_REED);
        dropSelf(ModBlocks.NETHER_QUARTZ_REED);
        dropSelf(ModBlocks.NETHER_GOLD_REED);
        dropSelf(ModBlocks.OBSIDIAN_REED);
        dropSelf(ModBlocks.GLOWSTONE_REED);
        dropSelf(ModBlocks.CLAY_REED);
        dropSelf(ModBlocks.BLAZE_REED);
        dropSelf(ModBlocks.ENDER_REED);
        dropSelf(ModBlocks.AMETHYST_REED);
        dropSelf(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        dropSelf(ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        dropSelf(ModBlocks.SOULIUM_REED);
        dropSelf(ModBlocks.PROSPERITY_REED);
        dropSelf(ModBlocks.DEEPSLATE_PROSPERITY_REED);
        dropSelf(ModBlocks.NETHER_PROSPERITY_REED);
        dropSelf(ModBlocks.END_PROSPERITY_REED);
        dropSelf(ModBlocks.INFERIUM_REED);
        dropSelf(ModBlocks.DEEPSLATE_INFERIUM_REED);
        dropSelf(ModBlocks.NETHER_INFERIUM_REED);
        dropSelf(ModBlocks.END_INFERIUM_REED);

        //Extreme Reactors
        dropSelf(ModBlocks.ANGLESITE_REED);
        dropSelf(ModBlocks.BENITOITE_REED);
        dropSelf(ModBlocks.YELLORITE_REED);

        //RFTools
        dropSelf(ModBlocks.DIMENSIONALSHARD_REED);
        dropSelf(ModBlocks.NETHER_DIMENSIONALSHARD_REED);
        dropSelf(ModBlocks.END_DIMENSIONALSHARD_REED);

        //Powah! Rearchitected
        dropSelf(ModBlocks.URANINITE_REED);
        dropSelf(ModBlocks.DEEPSLATE_URANINITE_REED);

        //Create
        dropSelf(ModBlocks.ZINC_REED);
        dropSelf(ModBlocks.DEEPSLATE_ZINC_REED);



    }


    public LootTable.Builder createMultipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(drop, this.applyExplosionDecay(drop,  LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops))).apply(ApplyBonusCount
                        .addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

}