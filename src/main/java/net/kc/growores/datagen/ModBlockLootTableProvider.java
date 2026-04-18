package net.kc.growores.datagen;

import net.kc.growores.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.GROWING_BLOCK.get());
        this.dropSelf(ModBlocks.COAL_REED.get());
        this.dropSelf(ModBlocks.IRON_REED.get());
        this.dropSelf(ModBlocks.COPPER_REED.get());
        this.dropSelf(ModBlocks.GOLD_REED.get());
        this.dropSelf(ModBlocks.REDSTONE_REED.get());
        this.dropSelf(ModBlocks.LAPIS_REED.get());
        this.dropSelf(ModBlocks.DIAMOND_REED.get());
        this.dropSelf(ModBlocks.EMERALD_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_REDSTONE_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_REED.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_REED.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_REED.get());
        this.dropSelf(ModBlocks.OBSIDIAN_REED.get());
        this.dropSelf(ModBlocks.GLOWSTONE_REED.get());
        this.dropSelf(ModBlocks.CLAY_REED.get());
        this.dropSelf(ModBlocks.BLAZE_REED.get());
        this.dropSelf(ModBlocks.ENDER_REED.get());
        this.dropSelf(ModBlocks.AMETHYST_REED.get());
        this.dropSelf(ModBlocks.ANCIENT_DEBRIS_REED.get());

        //MODS
        //Applied Energistics 2
        this.dropSelf(ModBlocks.CERTUS_QUARTZ_REED.get());

        //Mystical Agriculture & Mystical Agradditions
        this.dropSelf(ModBlocks.SOULIUM_REED.get());
        this.dropSelf(ModBlocks.PROSPERITY_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_PROSPERITY_REED.get());
        this.dropSelf(ModBlocks.NETHER_PROSPERITY_REED.get());
        this.dropSelf(ModBlocks.END_PROSPERITY_REED.get());
        this.dropSelf(ModBlocks.INFERIUM_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_INFERIUM_REED.get());
        this.dropSelf(ModBlocks.NETHER_INFERIUM_REED.get());
        this.dropSelf(ModBlocks.END_INFERIUM_REED.get());

        //Extreme Reactors
        this.dropSelf(ModBlocks.ANGLESITE_REED.get());
        this.dropSelf(ModBlocks.BENITOITE_REED.get());
        this.dropSelf(ModBlocks.YELLORITE_REED.get());

        //RFTools
        this.dropSelf(ModBlocks.DIMENSIONALSHARD_REED.get());
        this.dropSelf(ModBlocks.NETHER_DIMENSIONALSHARD_REED.get());
        this.dropSelf(ModBlocks.END_DIMENSIONALSHARD_REED.get());

        //Powah! Rearchitected
        this.dropSelf(ModBlocks.URANINITE_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_URANINITE_REED.get());

        //Create
        this.dropSelf(ModBlocks.ZINC_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_ZINC_REED.get());



    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(pBlock,
            this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                    .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}