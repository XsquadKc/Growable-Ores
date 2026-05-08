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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GrowOres.MOD_ID);


    public static final RegistryObject<Block> GROWING_BLOCK = registerBlock("growing_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)));

    //Reeds
    public static final RegistryObject<Block> COAL_REED = registerReedBlock("coal_reed", Blocks.COAL_ORE, 5);
    public static final RegistryObject<Block> IRON_REED = registerReedBlock("iron_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> COPPER_REED = registerReedBlock("copper_reed", Blocks.COPPER_ORE, 4);
    public static final RegistryObject<Block> GOLD_REED = registerReedBlock("gold_reed",Blocks.GOLD_ORE, 4);
    public static final RegistryObject<Block> REDSTONE_REED = registerReedBlock("redstone_reed", BlockBehaviour.Properties.copy(Blocks.STONE).strength(3.0F, 3.0F), 5);
    public static final RegistryObject<Block> LAPIS_REED = registerReedBlock("lapis_reed",Blocks.LAPIS_ORE, 5);
    public static final RegistryObject<Block> DIAMOND_REED = registerReedBlock("diamond_reed", Blocks.DIAMOND_ORE, 3);
    public static final RegistryObject<Block> EMERALD_REED = registerReedBlock("emerald_reed", Blocks.EMERALD_ORE, 3);
    public static final RegistryObject<Block> DEEPSLATE_COAL_REED = registerReedBlock("deepslate_coal_reed", Blocks.DEEPSLATE_COAL_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_IRON_REED = registerReedBlock("deepslate_iron_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final RegistryObject<Block> DEEPSLATE_COPPER_REED = registerReedBlock("deepslate_copper_reed", Blocks.DEEPSLATE_COPPER_ORE, 3);
    public static final RegistryObject<Block> DEEPSLATE_GOLD_REED = registerReedBlock("deepslate_gold_reed", Blocks.DEEPSLATE_GOLD_ORE, 3);
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_REED = registerReedBlock("deepslate_redstone_reed", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(4.5F, 3.0F), 4);
    public static final RegistryObject<Block> DEEPSLATE_LAPIS_REED = registerReedBlock("deepslate_lapis_reed", Blocks.DEEPSLATE_LAPIS_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_DIAMOND_REED = registerReedBlock("deepslate_diamond_reed", Blocks.DEEPSLATE_DIAMOND_ORE, 2);
    public static final RegistryObject<Block> DEEPSLATE_EMERALD_REED = registerReedBlock("deepslate_emerald_reed", Blocks.DEEPSLATE_EMERALD_ORE, 2);
    public static final RegistryObject<Block> NETHER_QUARTZ_REED = registerReedBlock("nether_quartz_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final RegistryObject<Block> NETHER_GOLD_REED = registerReedBlock("nether_gold_reed", Blocks.NETHER_GOLD_ORE, 5);
    public static final RegistryObject<Block> OBSIDIAN_REED = registerReedBlock("obsidian_reed", BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).pushReaction(PushReaction.BLOCK), 3);
    public static final RegistryObject<Block> GLOWSTONE_REED = registerReedBlock("glowstone_reed", Blocks.GLOWSTONE, 5);
    public static final RegistryObject<Block> CLAY_REED = registerReedBlock("clay_reed", Blocks.CLAY, 5);
    public static final RegistryObject<Block> BLAZE_REED = registerReedBlock("blaze_reed",Blocks.SUGAR_CANE, 3);
    public static final RegistryObject<Block> ENDER_REED = registerReedBlock("ender_reed", Blocks.SUGAR_CANE, 3);
    public static final RegistryObject<Block> AMETHYST_REED = registerReedBlock("amethyst_reed", Blocks.AMETHYST_BLOCK, 4);
    public static final RegistryObject<Block> ANCIENT_DEBRIS_REED = registerReedBlock("ancient_debris_reed", Blocks.ANCIENT_DEBRIS, 3);

    //MODS
    //Applied Energistics 2
    public static final RegistryObject<Block> CERTUS_QUARTZ_REED = registerReedBlock("certus_quartz_reed", Blocks.AMETHYST_BLOCK, 4);

    //Mystical Agriculture & Mystical Agradditions
    public static final RegistryObject<Block> SOULIUM_REED = registerReedBlock("soulium_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final RegistryObject<Block> PROSPERITY_REED = registerReedBlock("prosperity_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_PROSPERITY_REED = registerReedBlock("deepslate_prosperity_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final RegistryObject<Block> NETHER_PROSPERITY_REED = registerReedBlock("nether_prosperity_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final RegistryObject<Block> END_PROSPERITY_REED = registerReedBlock("end_prosperity_reed", Blocks.END_STONE, 4);
    public static final RegistryObject<Block> INFERIUM_REED = registerReedBlock("inferium_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_INFERIUM_REED = registerReedBlock("deepslate_inferium_reed", Blocks.DEEPSLATE_IRON_ORE, 3);
    public static final RegistryObject<Block> NETHER_INFERIUM_REED = registerReedBlock("nether_inferium_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final RegistryObject<Block> END_INFERIUM_REED = registerReedBlock("end_inferium_reed", Blocks.END_STONE, 4);

    //Extreme Reactors
    public static final RegistryObject<Block> ANGLESITE_REED = registerReedBlock("anglesite_reed", Blocks.END_STONE, 4);
    public static final RegistryObject<Block> BENITOITE_REED = registerReedBlock("benitoite_reed", Blocks.NETHER_QUARTZ_ORE, 4);
    public static final RegistryObject<Block> YELLORITE_REED = registerReedBlock("yellorite_reed", Blocks.DIAMOND_ORE, 4);

    //RFTools
    public static final RegistryObject<Block> DIMENSIONALSHARD_REED = registerReedBlock("dimensionalshard_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> NETHER_DIMENSIONALSHARD_REED = registerReedBlock("nether_dimensionalshard_reed", Blocks.NETHER_QUARTZ_ORE, 5);
    public static final RegistryObject<Block> END_DIMENSIONALSHARD_REED = registerReedBlock("end_dimensionalshard_reed", Blocks.END_STONE, 5);

    //Powah! Rearchitected
    public static final RegistryObject<Block> URANINITE_REED = registerReedBlock("uraninite_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_URANINITE_REED = registerReedBlock("deepslate_uraninite_reed", Blocks.DEEPSLATE_IRON_ORE, 3);

    //Create
    public static final RegistryObject<Block> ZINC_REED = registerReedBlock("zinc_reed", Blocks.IRON_ORE, 4);
    public static final RegistryObject<Block> DEEPSLATE_ZINC_REED = registerReedBlock("deepslate_zinc_reed", Blocks.DEEPSLATE_IRON_ORE, 3);


    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, Block templateBlock, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(templateBlock), maxHeight));
    }

    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, BlockBehaviour.Properties settings, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(settings, maxHeight));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowOres.MOD_ID);


}
