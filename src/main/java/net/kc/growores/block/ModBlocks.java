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
    public static final Block COAL_REED = registerReedBlock("coal_reed", Blocks.COAL_ORE, 5);
    public static final Block IRON_REED = registerReedBlock("iron_reed", Blocks.IRON_ORE, 4);
    public static final Block COPPER_REED = registerReedBlock("copper_reed", Blocks.COPPER_ORE, 4);
    public static final Block GOLD_REED = registerReedBlock("gold_reed",Blocks.GOLD_ORE, 4);
    public static final Block REDSTONE_REED = registerReedBlock("redstone_reed", AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F, 3.0F), 5);
    public static final Block LAPIS_REED = registerReedBlock("lapis_reed",Blocks.LAPIS_ORE, 5);
    public static final Block DIAMOND_REED = registerReedBlock("diamond_reed", Blocks.DIAMOND_ORE, 3);
    public static final Block EMERALD_REED = registerReedBlock("emerald_reed", Blocks.EMERALD_ORE, 3);
    public static final Block DEEPSLATE_COAL_REED = registerReedBlock("deepslate_coal_reed", Blocks.DEEPSLATE_COAL_ORE, 4);
    public static final Block DEEPSLATE_IRON_REED = registerReedBlock("deepslate_iron_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final Block DEEPSLATE_COPPER_REED = registerReedBlock("deepslate_copper_reed", Blocks.DEEPSLATE_COPPER_ORE, 3);
    public static final Block DEEPSLATE_GOLD_REED = registerReedBlock("deepslate_gold_reed", Blocks.DEEPSLATE_GOLD_ORE, 3);
    public static final Block DEEPSLATE_REDSTONE_REED = registerReedBlock("deepslate_redstone_reed", AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5F, 3.0F), 4);
    public static final Block DEEPSLATE_LAPIS_REED = registerReedBlock("deepslate_lapis_reed", Blocks.DEEPSLATE_LAPIS_ORE, 4);
    public static final Block DEEPSLATE_DIAMOND_REED = registerReedBlock("deepslate_diamond_reed", Blocks.DEEPSLATE_DIAMOND_ORE, 2);
    public static final Block DEEPSLATE_EMERALD_REED = registerReedBlock("deepslate_emerald_reed", Blocks.DEEPSLATE_EMERALD_ORE, 2);
    public static final Block NETHER_QUARTZ_REED = registerReedBlock("nether_quartz_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final Block NETHER_GOLD_REED = registerReedBlock("nether_gold_reed", Blocks.NETHER_GOLD_ORE, 5);
    public static final Block OBSIDIAN_REED = registerReedBlock("obsidian_reed", AbstractBlock.Settings.copy(Blocks.OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK), 3);
    public static final Block GLOWSTONE_REED = registerReedBlock("glowstone_reed", Blocks.GLOWSTONE, 5);
    public static final Block CLAY_REED = registerReedBlock("clay_reed", Blocks.CLAY, 5);
    public static final Block BLAZE_REED = registerReedBlock("blaze_reed",Blocks.SUGAR_CANE, 3);
    public static final Block ENDER_REED = registerReedBlock("ender_reed", Blocks.SUGAR_CANE, 3);
    public static final Block AMETHYST_REED = registerReedBlock("amethyst_reed", Blocks.AMETHYST_BLOCK, 4);
    public static final Block ANCIENT_DEBRIS_REED = registerReedBlock("ancient_debris_reed", Blocks.ANCIENT_DEBRIS, 3);

    //MODS
    //Applied Energistics 2
    public static final Block CERTUS_QUARTZ_REED = registerReedBlock("certus_quartz_reed", Blocks.AMETHYST_BLOCK, 4);

    //Mystical Agriculture & Mystical Agradditions
    public static final Block SOULIUM_REED = registerReedBlock("soulium_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final Block PROSPERITY_REED = registerReedBlock("prosperity_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_PROSPERITY_REED = registerReedBlock("deepslate_prosperity_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final Block NETHER_PROSPERITY_REED = registerReedBlock("nether_prosperity_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final Block END_PROSPERITY_REED = registerReedBlock("end_prosperity_reed", Blocks.END_STONE, 4);
    public static final Block INFERIUM_REED = registerReedBlock("inferium_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_INFERIUM_REED = registerReedBlock("deepslate_inferium_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final Block NETHER_INFERIUM_REED = registerReedBlock("nether_inferium_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final Block END_INFERIUM_REED = registerReedBlock("end_inferium_reed", Blocks.END_STONE, 4);

    //Extreme Reactors
    public static final Block ANGLESITE_REED = registerReedBlock("anglesite_reed", Blocks.END_STONE, 4);
    public static final Block BENITOITE_REED = registerReedBlock("benitoite_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final Block YELLORITE_REED = registerReedBlock("yellorite_reed", Blocks.DIAMOND_ORE, 4);

    //RFTools
    public static final Block DIMENSIONALSHARD_REED = registerReedBlock("dimensionalshard_reed", Blocks.IRON_ORE, 4);
    public static final Block NETHER_DIMENSIONALSHARD_REED = registerReedBlock("nether_dimensionalshard_reed", Blocks.NETHER_QUARTZ_ORE, 5);
    public static final Block END_DIMENSIONALSHARD_REED = registerReedBlock("end_dimensionalshard_reed", Blocks.END_STONE, 5);

    //Powah! Rearchitected
    public static final Block URANINITE_REED = registerReedBlock("uraninite_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_URANINITE_REED = registerReedBlock("deepslate_uraninite_reed", Blocks.DEEPSLATE_IRON_ORE, 3);

    //Create
    public static final Block ZINC_REED = registerReedBlock("zinc_reed", Blocks.IRON_ORE, 4);
    public static final Block DEEPSLATE_ZINC_REED = registerReedBlock("deepslate_zinc_reed", Blocks.DEEPSLATE_IRON_ORE, 3);


    private static Block registerReedBlock(String name, Block templateBlock, int maxHeight){
        return (Block) Registry.register(Registries.BLOCK, Identifier.of(GrowOres.MOD_ID, name),  new OreReedBlock(AbstractBlock.Settings.copy(templateBlock), maxHeight));
    }

    private static Block registerReedBlock(String name, AbstractBlock.Settings settings, int maxHeight){
        return (Block) Registry.register(Registries.BLOCK, Identifier.of(GrowOres.MOD_ID, name), new OreReedBlock(settings, maxHeight));
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
