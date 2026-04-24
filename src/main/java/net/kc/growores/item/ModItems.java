package net.kc.growores.item;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.block.custom.OreReedBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModItems {

    public static final BlockItem COAL_REED_ITEM = registerBlockItem("coal_reed_item" , ModBlocks.COAL_REED);
    public static final BlockItem IRON_REED_ITEM = registerBlockItem("iron_reed_item" , ModBlocks.IRON_REED);
    public static final BlockItem COPPER_REED_ITEM = registerBlockItem("copper_reed_item" , ModBlocks.COPPER_REED);
    public static final BlockItem GOLD_REED_ITEM = registerBlockItem("gold_reed_item" , ModBlocks.GOLD_REED);
    public static final BlockItem REDSTONE_REED_ITEM = registerBlockItem("redstone_reed_item" , ModBlocks.REDSTONE_REED);
    public static final BlockItem LAPIS_REED_ITEM = registerBlockItem("lapis_reed_item" , ModBlocks.LAPIS_REED);
    public static final BlockItem DIAMOND_REED_ITEM = registerBlockItem("diamond_reed_item" , ModBlocks.DIAMOND_REED);
    public static final BlockItem EMERALD_REED_ITEM = registerBlockItem("emerald_reed_item" , ModBlocks.EMERALD_REED);
    public static final BlockItem DEEPSLATE_COAL_REED_ITEM = registerBlockItem("deepslate_coal_reed_item" , ModBlocks.DEEPSLATE_COAL_REED);
    public static final BlockItem DEEPSLATE_IRON_REED_ITEM = registerBlockItem("deepslate_iron_reed_item" , ModBlocks.DEEPSLATE_IRON_REED);
    public static final BlockItem DEEPSLATE_COPPER_REED_ITEM = registerBlockItem("deepslate_copper_reed_item" , ModBlocks.DEEPSLATE_COPPER_REED);
    public static final BlockItem DEEPSLATE_GOLD_REED_ITEM = registerBlockItem("deepslate_gold_reed_item" , ModBlocks.DEEPSLATE_GOLD_REED);
    public static final BlockItem DEEPSLATE_REDSTONE_REED_ITEM = registerBlockItem("deepslate_redstone_reed_item" , ModBlocks.DEEPSLATE_REDSTONE_REED);
    public static final BlockItem DEEPSLATE_LAPIS_REED_ITEM = registerBlockItem("deepslate_lapis_reed_item" , ModBlocks.DEEPSLATE_LAPIS_REED);
    public static final BlockItem DEEPSLATE_DIAMOND_REED_ITEM = registerBlockItem("deepslate_diamond_reed_item" , ModBlocks.DEEPSLATE_DIAMOND_REED);
    public static final BlockItem DEEPSLATE_EMERALD_REED_ITEM = registerBlockItem("deepslate_emerald_reed_item" , ModBlocks.DEEPSLATE_EMERALD_REED);
    public static final BlockItem NETHER_QUARTZ_REED_ITEM = registerBlockItem("nether_quartz_reed_item" , ModBlocks.NETHER_QUARTZ_REED);
    public static final BlockItem NETHER_GOLD_REED_ITEM = registerBlockItem("nether_gold_reed_item" , ModBlocks.NETHER_GOLD_REED);
    public static final BlockItem OBSIDIAN_REED_ITEM = registerBlockItem("obsidian_reed_item" , ModBlocks.OBSIDIAN_REED);
    public static final BlockItem GLOWSTONE_REED_ITEM = registerBlockItem("glowstone_reed_item" , ModBlocks.GLOWSTONE_REED);
    public static final BlockItem CLAY_REED_ITEM = registerBlockItem("clay_reed_item" , ModBlocks.CLAY_REED);
    public static final BlockItem BLAZE_REED_ITEM = registerBlockItem("blaze_reed_item" , ModBlocks.BLAZE_REED);
    public static final BlockItem ENDER_REED_ITEM = registerBlockItem("ender_reed_item" , ModBlocks.ENDER_REED);
    public static final BlockItem AMETHYST_REED_ITEM = registerBlockItem("amethyst_reed_item" , ModBlocks.AMETHYST_REED);
    public static final BlockItem ANCIENT_DEBRIS_REED_ITEM = registerBlockItem("ancient_debris_reed_item" , ModBlocks.ANCIENT_DEBRIS_REED, new Item.Properties().fireResistant());

    //MODS
    //Applied Energistics 2
    public static final BlockItem CERTUS_QUARTZ_REED_ITEM = registerBlockItem("certus_quartz_reed_item" , ModBlocks.CERTUS_QUARTZ_REED);

    //Mystical Agriculture & Mystical Agradditions
    public static final BlockItem SOULIUM_REED_ITEM = registerBlockItem("soulium_reed_item" , ModBlocks.SOULIUM_REED);
    public static final BlockItem PROSPERITY_REED_ITEM = registerBlockItem("prosperity_reed_item" , ModBlocks.PROSPERITY_REED);
    public static final BlockItem DEEPSLATE_PROSPERITY_REED_ITEM = registerBlockItem("deepslate_prosperity_reed_item" , ModBlocks.DEEPSLATE_PROSPERITY_REED);
    public static final BlockItem NETHER_PROSPERITY_REED_ITEM = registerBlockItem("nether_prosperity_reed_item" , ModBlocks.NETHER_PROSPERITY_REED);
    public static final BlockItem END_PROSPERITY_REED_ITEM = registerBlockItem("end_prosperity_reed_item" , ModBlocks.END_PROSPERITY_REED);
    public static final BlockItem INFERIUM_REED_ITEM = registerBlockItem("inferium_reed_item" , ModBlocks.INFERIUM_REED);
    public static final BlockItem DEEPSLATE_INFERIUM_REED_ITEM = registerBlockItem("deepslate_inferium_reed_item" , ModBlocks.DEEPSLATE_INFERIUM_REED);
    public static final BlockItem NETHER_INFERIUM_REED_ITEM = registerBlockItem("nether_inferium_reed_item" , ModBlocks.NETHER_INFERIUM_REED);
    public static final BlockItem END_INFERIUM_REED_ITEM = registerBlockItem("end_inferium_reed_item" , ModBlocks.END_INFERIUM_REED);

    //Extreme Reactors
    public static final BlockItem ANGLESITE_REED_ITEM = registerBlockItem("anglesite_reed_item" , ModBlocks.ANGLESITE_REED);
    public static final BlockItem BENITOITE_REED_ITEM = registerBlockItem("benitoite_reed_item" , ModBlocks.BENITOITE_REED);
    public static final BlockItem YELLORITE_REED_ITEM = registerBlockItem("yellorite_reed_item" , ModBlocks.YELLORITE_REED);

    //RFTools
    public static final BlockItem DIMENSIONALSHARD_REED_ITEM = registerBlockItem("dimensionalshard_reed_item" , ModBlocks.DIMENSIONALSHARD_REED);
    public static final BlockItem NETHER_DIMENSIONALSHARD_REED_ITEM = registerBlockItem("nether_dimensionalshard_reed_item" , ModBlocks.NETHER_DIMENSIONALSHARD_REED);
    public static final BlockItem END_DIMENSIONALSHARD_REED_ITEM = registerBlockItem("end_dimensionalshard_reed_item" , ModBlocks.END_DIMENSIONALSHARD_REED);

    //Powah! Rearchitected
    public static final BlockItem URANITITE_REED_ITEM = registerBlockItem("uraninite_reed_item" , ModBlocks.URANINITE_REED);
    public static final BlockItem DEEPSLATE_URANITITE_REED_ITEM = registerBlockItem("deepslate_uraninite_reed_item" , ModBlocks.DEEPSLATE_URANINITE_REED);

    //Create
    public static final BlockItem ZINC_REED_ITEM = registerBlockItem("zinc_reed_item" , ModBlocks.ZINC_REED);
    public static final BlockItem DEEPSLATE_ZINC_REED_ITEM = registerBlockItem("deepslate_zinc_reed_item", ModBlocks.DEEPSLATE_ZINC_REED);

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GrowOres.MOD_ID, name), item);
    }

    private static BlockItem registerBlockItem(String name, Block block){
        ResourceKey<Item> itemKey = keyOfItem(name);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
        return Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
    }

    private static BlockItem registerBlockItem(String name, Block block, Item.Properties properties){
        ResourceKey<Item> itemKey = keyOfItem(name);
        BlockItem blockItem = new BlockItem(block, properties.setId(itemKey).useBlockDescriptionPrefix());
        return Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowOres.MOD_ID, name));
    }

    public static void registerModItems(){
        GrowOres.LOGGER.info("Registering Mod Items for " + GrowOres.MOD_ID);
    }


}
