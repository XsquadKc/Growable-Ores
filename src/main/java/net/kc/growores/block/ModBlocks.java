package net.kc.growores.block;

import net.kc.growores.GrowOres;
import net.kc.growores.GrowOresClient;
import net.kc.growores.block.custom.OreReedBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GROWING_BLOCK = registerBlock("growing_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT).sounds(BlockSoundGroup.GRAVEL)));

    //Reeds
    public static final Block COAL_REED = registerBlock("coal_reed",
            new OreReedBlock(AbstractBlock.Settings.copy(Blocks.COAL_ORE), 5));
    public static final Block IRON_REED = registerBlock("iron_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), 4));
    public static final Block COPPER_REED = registerBlock("copper_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE), 4));
    public static final Block GOLD_REED = registerBlock("gold_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE), 4));
    public static final Block REDSTONE_REED = registerBlock("redstone_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F, 3.0F), 5));
    public static final Block LAPIS_REED = registerBlock("lapis_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE), 5));
    public static final Block DIAMOND_REED = registerBlock("diamond_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE), 3));
    public static final Block EMERALD_REED = registerBlock("emerald_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE), 3));
    public static final Block DEEPSLATE_COAL_REED = registerBlock("deepslate_coal_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE), 4));
    public static final Block DEEPSLATE_IRON_REED = registerBlock("deepslate_iron_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final Block DEEPSLATE_COPPER_REED = registerBlock("deepslate_copper_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE), 3));
    public static final Block DEEPSLATE_GOLD_REED = registerBlock("deepslate_gold_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE), 3));
    public static final Block DEEPSLATE_REDSTONE_REED = registerBlock("deepslate_redstone_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final Block DEEPSLATE_LAPIS_REED = registerBlock("deepslate_lapis_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE), 4));
    public static final Block DEEPSLATE_DIAMOND_REED = registerBlock("deepslate_diamond_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE), 2));
    public static final Block DEEPSLATE_EMERALD_REED = registerBlock("deepslate_emerald_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE), 2));
    public static final Block NETHER_QUARTZ_REED = registerBlock("nether_quartz_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final Block NETHER_GOLD_REED = registerBlock("nether_gold_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE), 5));
    public static final Block OBSIDIAN_REED = registerBlock("obsidian_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK), 3));
    public static final Block GLOWSTONE_REED = registerBlock("glowstone_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE), 5));
    public static final Block CLAY_REED = registerBlock("clay_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.CLAY), 5));
    public static final Block BLAZE_REED = registerBlock("blaze_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.SUGAR_CANE), 3));
    public static final Block ENDER_REED = registerBlock("ender_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.SUGAR_CANE), 3));
    public static final Block AMETHYST_REED = registerBlock("amethyst_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), 4));
    public static final Block ANCIENT_DEBRIS_REED = registerBlock("ancient_debris_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS), 3));

    //MODS
    //Applied Energistics 2
    public static final Block CERTUS_QUARTZ_REED = registerBlock("certus_quartz_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), 4));

    //Mystical Agriculture & Mystical Agradditions
    public static final Block SOULIUM_REED = registerBlock("soulium_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final Block PROSPERITY_REED = registerBlock("prosperity_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), 4));
    public static final Block DEEPSLATE_PROSPERITY_REED = registerBlock("deepslate_prosperity_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final Block NETHER_PROSPERITY_REED = registerBlock("nether_prosperity_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final Block END_PROSPERITY_REED = registerBlock("end_prosperity_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), 4));
    public static final Block INFERIUM_REED = registerBlock("inferium_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), 4));
    public static final Block DEEPSLATE_INFERIUM_REED = registerBlock("deepslate_inferium_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final Block NETHER_INFERIUM_REED = registerBlock("nether_inferium_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final Block END_INFERIUM_REED = registerBlock("end_inferium_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), 4));

    //Extreme Reactors
    public static final Block ANGLESITE_REED = registerBlock("anglesite_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), 4));
    public static final Block BENITOITE_REED = registerBlock("benitoite_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final Block YELLORITE_REED = registerBlock("yellorite_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE), 4));

    //RFTools
    public static final Block DIMENSIONALSHARD_REED = registerReedBlock("dimensionalshard_reed", Blocks.IRON_ORE, 4);
    public static final Block NETHER_DIMENSIONALSHARD_REED = registerBlock("nether_dimensionalshard_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE), 5));
    public static final Block END_DIMENSIONALSHARD_REED = registerBlock("end_dimensionalshard_reed",
             new OreReedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE), 5));

    //Powah! Rearchitected
    public static final Block URANINITE_REED = registerReedBlock("uraninite_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_URANINITE_REED = registerReedBlock("deepslate_uraninite_reed", Blocks.DEEPSLATE_IRON_ORE, 3);

    //Create
    public static final Block ZINC_REED = registerReedBlock("zinc_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_ZINC_REED = registerReedBlock("deepslate_zinc_reed", Blocks.DEEPSLATE_IRON_ORE, 3);


    private static Block registerReedBlock(String name, Block templateBlock, int maxHeight){
        return (Block) Registry.register(Registries.BLOCK, Identifier.of(GrowOres.MOD_ID, name),  new OreReedBlock(AbstractBlock.Settings.copy(templateBlock), maxHeight));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GrowOres.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(GrowOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        GrowOres.LOGGER.info("Registering Mod Blocks for " + GrowOres.MOD_ID);
    }

}
