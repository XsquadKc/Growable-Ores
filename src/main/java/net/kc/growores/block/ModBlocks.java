package net.kc.growores.block;

import net.kc.growores.GrowOres;
import net.kc.growores.block.custom.OreReedBlock;
import net.kc.growores.datagen.ModItemModelProvider;
import net.kc.growores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GrowOres.MOD_ID);


    public static final DeferredBlock<Block> GROWING_BLOCK = registerBlock("growing_block",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));

    //Reeds
    public static final DeferredBlock<Block> COAL_REED = registerBlock("coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE), 5));
    public static final DeferredBlock<Block> IRON_REED = registerBlock("iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE), 4));
    public static final DeferredBlock<Block> COPPER_REED = registerBlock("copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE), 4));
    public static final DeferredBlock<Block> GOLD_REED = registerBlock("gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE), 4));
    public static final DeferredBlock<Block> REDSTONE_REED = registerBlock("redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 3.0F), 5));
    public static final DeferredBlock<Block> LAPIS_REED = registerBlock("lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE), 5));
    public static final DeferredBlock<Block> DIAMOND_REED = registerBlock("diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE), 3));
    public static final DeferredBlock<Block> EMERALD_REED = registerBlock("emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE), 3));
    public static final DeferredBlock<Block> DEEPSLATE_COAL_REED = registerBlock("deepslate_coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE), 4));
    public static final DeferredBlock<Block> DEEPSLATE_IRON_REED = registerBlock("deepslate_iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final DeferredBlock<Block> DEEPSLATE_COPPER_REED = registerBlock("deepslate_copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE), 3));
    public static final DeferredBlock<Block> DEEPSLATE_GOLD_REED = registerBlock("deepslate_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE), 3));
    public static final DeferredBlock<Block> DEEPSLATE_REDSTONE_REED = registerBlock("deepslate_redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final DeferredBlock<Block> DEEPSLATE_LAPIS_REED = registerBlock("deepslate_lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE), 4));
    public static final DeferredBlock<Block> DEEPSLATE_DIAMOND_REED = registerBlock("deepslate_diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE), 2));
    public static final DeferredBlock<Block> DEEPSLATE_EMERALD_REED = registerBlock("deepslate_emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE), 2));
    public static final DeferredBlock<Block>NETHER_QUARTZ_REED = registerBlock("nether_quartz_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final DeferredBlock<Block>NETHER_GOLD_REED = registerBlock("nether_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE), 5));
    public static final DeferredBlock<Block> OBSIDIAN_REED = registerBlock("obsidian_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).pushReaction(PushReaction.BLOCK), 3));
    public static final DeferredBlock<Block> GLOWSTONE_REED = registerBlock("glowstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE), 5));
    public static final DeferredBlock<Block>CLAY_REED = registerBlock("clay_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY), 5));
    public static final DeferredBlock<Block> BLAZE_REED = registerBlock("blaze_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUGAR_CANE), 3));
    public static final DeferredBlock<Block> ENDER_REED = registerBlock("ender_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUGAR_CANE), 3));
    public static final DeferredBlock<Block> AMETHYST_REED = registerBlock("amethyst_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK), 4));
    public static final DeferredBlock<Block> ANCIENT_DEBRIS_REED = registerBlock("ancient_debris_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS), 3));

    //MODS
    //Applied Energistics 2
    public static final DeferredBlock<Block> CERTUS_QUARTZ_REED = registerBlock("certus_quartz_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK), 4));

    //Mystical Agriculture & Mystical Agradditions
    public static final DeferredBlock<Block> SOULIUM_REED = registerBlock("soulium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final DeferredBlock<Block> PROSPERITY_REED = registerBlock("prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE), 4));
    public static final DeferredBlock<Block> DEEPSLATE_PROSPERITY_REED = registerBlock("deepslate_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final DeferredBlock<Block> NETHER_PROSPERITY_REED = registerBlock("nether_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final DeferredBlock<Block> END_PROSPERITY_REED = registerBlock("end_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), 4));
    public static final DeferredBlock<Block> INFERIUM_REED = registerBlock("inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE), 4));
    public static final DeferredBlock<Block> DEEPSLATE_INFERIUM_REED = registerBlock("deepslate_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final DeferredBlock<Block> NETHER_INFERIUM_REED = registerBlock("nether_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final DeferredBlock<Block> END_INFERIUM_REED = registerBlock("end_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), 4));

    //Extreme Reactors
    public static final DeferredBlock<Block> ANGLESITE_REED = registerBlock("anglesite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), 4));
    public static final DeferredBlock<Block> BENITOITE_REED = registerBlock("benitoite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final DeferredBlock<Block> YELLORITE_REED = registerBlock("yellorite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE), 4));

    //RFTools
    public static final DeferredBlock<Block> DIMENSIONALSHARD_REED = registerReedBlock("dimensionalshard_reed", Blocks.IRON_ORE, 4);
    public static final DeferredBlock<Block> NETHER_DIMENSIONALSHARD_REED = registerBlock("nether_dimensionalshard_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE), 5));
    public static final DeferredBlock<Block> END_DIMENSIONALSHARD_REED = registerBlock("end_dimensionalshard_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE), 5));

    //Powah! Rearchitected
    public static final DeferredBlock<Block> URANINITE_REED = registerReedBlock("uraninite_reed", Blocks.IRON_ORE, 4);
    public static final DeferredBlock<Block> DEEPSLATE_URANINITE_REED = registerReedBlock("deepslate_uraninite_reed", Blocks.DEEPSLATE_IRON_ORE, 3);

    //Create
    public static final DeferredBlock<Block> ZINC_REED = registerReedBlock("zinc_reed", Blocks.IRON_ORE, 4);
    public static final DeferredBlock<Block> DEEPSLATE_ZINC_REED = registerReedBlock("deepslate_zinc_reed", Blocks.DEEPSLATE_IRON_ORE, 3);


    private static <T extends Block> DeferredBlock<T> registerReedBlock(String name, Block templateBlock, int maxHeight){
        return (DeferredBlock<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.ofFullCopy(templateBlock), maxHeight));
    }

    private static DeferredBlock<Block> registerBlock(String name, Supplier<? extends Block> block){
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
