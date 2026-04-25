package net.kc.growores.item;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GrowOres.MOD_ID);


    public static final DeferredItem<Item> GROWING_BLOCK= registerBlockItem("growing_block", ModBlocks.GROWING_BLOCK, new Item.Properties().useBlockDescriptionPrefix());

    public static final DeferredItem<Item> COAL_REED_ITEM= registerBlockItem("coal_reed_item", ModBlocks.COAL_REED);
    public static final DeferredItem<Item> IRON_REED_ITEM= registerBlockItem("iron_reed_item", ModBlocks.IRON_REED);
    public static final DeferredItem<Item> COPPER_REED_ITEM= registerBlockItem("copper_reed_item", ModBlocks.COPPER_REED);
    public static final DeferredItem<Item> GOLD_REED_ITEM= registerBlockItem("gold_reed_item", ModBlocks.GOLD_REED);
    public static final DeferredItem<Item> REDSTONE_REED_ITEM= registerBlockItem("redstone_reed_item", ModBlocks.REDSTONE_REED);
    public static final DeferredItem<Item> LAPIS_REED_ITEM= registerBlockItem("lapis_reed_item", ModBlocks.LAPIS_REED);
    public static final DeferredItem<Item> DIAMOND_REED_ITEM= registerBlockItem("diamond_reed_item", ModBlocks.DIAMOND_REED);
    public static final DeferredItem<Item> EMERALD_REED_ITEM= registerBlockItem("emerald_reed_item", ModBlocks.EMERALD_REED);
    public static final DeferredItem<Item> DEEPSLATE_COAL_REED_ITEM= registerBlockItem("deepslate_coal_reed_item", ModBlocks.DEEPSLATE_COAL_REED);
    public static final DeferredItem<Item> DEEPSLATE_IRON_REED_ITEM= registerBlockItem("deepslate_iron_reed_item", ModBlocks.DEEPSLATE_IRON_REED);
    public static final DeferredItem<Item> DEEPSLATE_COPPER_REED_ITEM= registerBlockItem("deepslate_copper_reed_item", ModBlocks.DEEPSLATE_COPPER_REED);
    public static final DeferredItem<Item> DEEPSLATE_GOLD_REED_ITEM= registerBlockItem("deepslate_gold_reed_item", ModBlocks.DEEPSLATE_GOLD_REED);
    public static final DeferredItem<Item> DEEPSLATE_REDSTONE_REED_ITEM= registerBlockItem("deepslate_redstone_reed_item", ModBlocks.DEEPSLATE_REDSTONE_REED);
    public static final DeferredItem<Item> DEEPSLATE_LAPIS_REED_ITEM= registerBlockItem("deepslate_lapis_reed_item", ModBlocks.DEEPSLATE_LAPIS_REED);
    public static final DeferredItem<Item> DEEPSLATE_DIAMOND_REED_ITEM= registerBlockItem("deepslate_diamond_reed_item", ModBlocks.DEEPSLATE_DIAMOND_REED);
    public static final DeferredItem<Item> DEEPSLATE_EMERALD_REED_ITEM= registerBlockItem("deepslate_emerald_reed_item", ModBlocks.DEEPSLATE_EMERALD_REED);
    public static final DeferredItem<Item> NETHER_QUARTZ_REED_ITEM= registerBlockItem("nether_quartz_reed_item", ModBlocks.NETHER_QUARTZ_REED);
    public static final DeferredItem<Item> NETHER_GOLD_REED_ITEM= registerBlockItem("nether_gold_reed_item", ModBlocks.NETHER_GOLD_REED);
    public static final DeferredItem<Item> OBSIDIAN_REED_ITEM= registerBlockItem("obsidian_reed_item", ModBlocks.OBSIDIAN_REED);
    public static final DeferredItem<Item> GLOWSTONE_REED_ITEM= registerBlockItem("glowstone_reed_item", ModBlocks.GLOWSTONE_REED);
    public static final DeferredItem<Item> CLAY_REED_ITEM= registerBlockItem("clay_reed_item", ModBlocks.CLAY_REED);
    public static final DeferredItem<Item> BLAZE_REED_ITEM= registerBlockItem("blaze_reed_item", ModBlocks.BLAZE_REED);
    public static final DeferredItem<Item> ENDER_REED_ITEM= registerBlockItem("ender_reed_item", ModBlocks.ENDER_REED);
    public static final DeferredItem<Item> AMETHYST_REED_ITEM= registerBlockItem("amethyst_reed_item", ModBlocks.AMETHYST_REED);
    public static final DeferredItem<Item> ANCIENT_DEBRIS_REED_ITEM= registerBlockItem("ancient_debris_reed_item", ModBlocks.ANCIENT_DEBRIS_REED, new Item.Properties().fireResistant());

    //MODS
    //Applied Energistics 2
    public static final DeferredItem<Item> CERTUS_QUARTZ_REED_ITEM= registerBlockItem("certus_quartz_reed_item", ModBlocks.CERTUS_QUARTZ_REED);

    //Mystical Agriculture & Mystical Agradditions
    public static final DeferredItem<Item> SOULIUM_REED_ITEM= registerBlockItem("soulium_reed_item", ModBlocks.SOULIUM_REED);
    public static final DeferredItem<Item> PROSPERITY_REED_ITEM= registerBlockItem("prosperity_reed_item", ModBlocks.PROSPERITY_REED);
    public static final DeferredItem<Item> DEEPSLATE_PROSPERITY_REED_ITEM= registerBlockItem("deepslate_prosperity_reed_item", ModBlocks.DEEPSLATE_PROSPERITY_REED);
    public static final DeferredItem<Item> NETHER_PROSPERITY_REED_ITEM= registerBlockItem("nether_prosperity_reed_item", ModBlocks.NETHER_PROSPERITY_REED);
    public static final DeferredItem<Item> END_PROSPERITY_REED_ITEM= registerBlockItem("end_prosperity_reed_item", ModBlocks.END_PROSPERITY_REED);
    public static final DeferredItem<Item> INFERIUM_REED_ITEM= registerBlockItem("inferium_reed_item", ModBlocks.INFERIUM_REED);
    public static final DeferredItem<Item> DEEPSLATE_INFERIUM_REED_ITEM= registerBlockItem("deepslate_inferium_reed_item", ModBlocks.DEEPSLATE_INFERIUM_REED);
    public static final DeferredItem<Item> NETHER_INFERIUM_REED_ITEM= registerBlockItem("nether_inferium_reed_item", ModBlocks.NETHER_INFERIUM_REED);
    public static final DeferredItem<Item> END_INFERIUM_REED_ITEM= registerBlockItem("end_inferium_reed_item", ModBlocks.END_INFERIUM_REED);

    //Extreme Reactors
    public static final DeferredItem<Item> ANGLESITE_REED_ITEM= registerBlockItem("anglesite_reed_item", ModBlocks.ANGLESITE_REED);
    public static final DeferredItem<Item> BENITOITE_REED_ITEM= registerBlockItem("benitoite_reed_item", ModBlocks.BENITOITE_REED);
    public static final DeferredItem<Item> YELLORITE_REED_ITEM= registerBlockItem("yellorite_reed_item", ModBlocks.YELLORITE_REED);

    //RFTools
    public static final DeferredItem<Item> DIMENSIONALSHARD_REED_ITEM= registerBlockItem("dimensionalshard_reed_item", ModBlocks.DIMENSIONALSHARD_REED);
    public static final DeferredItem<Item> NETHER_DIMENSIONALSHARD_REED_ITEM= registerBlockItem("nether_dimensionalshard_reed_item", ModBlocks.NETHER_DIMENSIONALSHARD_REED);
    public static final DeferredItem<Item> END_DIMENSIONALSHARD_REED_ITEM= registerBlockItem("end_dimensionalshard_reed_item", ModBlocks.END_DIMENSIONALSHARD_REED);

    //Powah! Rearchitected
    public static final DeferredItem<Item> URANITITE_REED_ITEM= registerBlockItem("uraninite_reed_item", ModBlocks.URANINITE_REED);
    public static final DeferredItem<Item> DEEPSLATE_URANITITE_REED_ITEM= registerBlockItem("deepslate_uraninite_reed_item", ModBlocks.DEEPSLATE_URANINITE_REED);

    //Create
    public static final DeferredItem<Item> ZINC_REED_ITEM= registerBlockItem("zinc_reed_item", ModBlocks.ZINC_REED);
    public static final DeferredItem<Item> DEEPSLATE_ZINC_REED_ITEM= registerBlockItem("deepslate_zinc_reed_item", ModBlocks.DEEPSLATE_ZINC_REED);


    private static DeferredItem<Item> registerBlockItem(String name, DeferredBlock<Block> block){
        ResourceKey<Item> itemKey = keyOfItem(name);
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(itemKey)));
    }

    private static DeferredItem<Item> registerBlockItem(String name, DeferredBlock<Block> block, Item.Properties properties){
        ResourceKey<Item> itemKey = keyOfItem(name);
        return ITEMS.register(name, () -> new BlockItem(block.get(), properties.setId(itemKey)));
    }


    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowOres.MOD_ID, name));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
