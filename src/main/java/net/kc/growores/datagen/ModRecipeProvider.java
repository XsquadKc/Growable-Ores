package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                shapeless(RecipeCategory.MISC, ModBlocks.GROWING_BLOCK, 8)
                        .requires(Items.BONE_MEAL).requires(Items.COAL).requires(Items.DIRT)
                        .requires(Items.SUGAR_CANE).requires(Items.IRON_INGOT).requires(Items.REDSTONE)
                        .requires(Items.DIAMOND).requires(Items.GOLD_INGOT).requires(Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(exporter);

                shaped(RecipeCategory.MISC, ModItems.COAL_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.COAL)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.COAL))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.COAL)
                        .requires(ModItems.COAL_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.COAL_REED_ITEM), has(ModItems.COAL_REED_ITEM))
                        .save(exporter, "coal_from_reed");


                shaped(RecipeCategory.MISC, ModItems.IRON_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_IRON)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_IRON))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_IRON)
                        .requires(ModItems.IRON_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.IRON_REED_ITEM), has(ModItems.IRON_REED_ITEM))
                        .save(exporter,"iron_from_reed");

                shaped(RecipeCategory.MISC, ModItems.COPPER_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_COPPER)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_COPPER))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_COPPER)
                        .requires(ModItems.COPPER_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.COPPER_REED_ITEM), has(ModItems.COPPER_REED_ITEM))
                        .save(exporter,"copper_from_reed");

                shaped(RecipeCategory.MISC, ModItems.GOLD_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_GOLD)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_GOLD))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_GOLD)
                        .requires(ModItems.GOLD_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.GOLD_REED_ITEM), has(ModItems.GOLD_REED_ITEM))
                        .save(exporter,"gold_from_reed");

                shaped(RecipeCategory.MISC, ModItems.REDSTONE_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.REDSTONE)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.REDSTONE))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.REDSTONE)
                        .requires(ModItems.REDSTONE_REED_ITEM, 2)
                        .unlockedBy(getHasName(ModItems.REDSTONE_REED_ITEM), has(ModItems.REDSTONE_REED_ITEM))
                        .save(exporter,"redstone_from_reed");

                shaped(RecipeCategory.MISC, ModItems.LAPIS_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.LAPIS_LAZULI))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                        .requires(ModItems.LAPIS_REED_ITEM, 4)
                        .unlockedBy(getHasName(ModItems.LAPIS_REED_ITEM), has(ModItems.LAPIS_REED_ITEM))
                        .save(exporter,"lapis_from_reed");

                shaped(RecipeCategory.MISC, ModItems.DIAMOND_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.DIAMOND)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.DIAMOND))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.DIAMOND)
                        .requires(ModItems.DIAMOND_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.DIAMOND_REED_ITEM), has(ModItems.DIAMOND_REED_ITEM))
                        .save(exporter,"diamond_from_reed");

                shaped(RecipeCategory.MISC, ModItems.EMERALD_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.EMERALD)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.EMERALD))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.EMERALD)
                        .requires(ModItems.EMERALD_REED_ITEM, 8)
                        .unlockedBy(getHasName(ModItems.EMERALD_REED_ITEM), has(ModItems.EMERALD_REED_ITEM))
                        .save(exporter,"emerald_from_reed");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_COAL_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.COAL)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.COAL))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.COAL)
                        .requires(ModItems.DEEPSLATE_COAL_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_COAL_REED_ITEM), has(ModItems.DEEPSLATE_COAL_REED_ITEM))
                        .save(exporter, "coal_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_IRON_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_IRON)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_IRON))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_IRON)
                        .requires(ModItems.DEEPSLATE_IRON_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_IRON_REED_ITEM), has(ModItems.DEEPSLATE_IRON_REED_ITEM))
                        .save(exporter, "iron_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_COPPER_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_COPPER)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_COPPER))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_COPPER)
                        .requires(ModItems.DEEPSLATE_COPPER_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_COPPER_REED_ITEM), has(ModItems.DEEPSLATE_COPPER_REED_ITEM))
                        .save(exporter, "copper_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_GOLD_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_GOLD)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.RAW_GOLD))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.RAW_GOLD)
                        .requires(ModItems.DEEPSLATE_GOLD_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_GOLD_REED_ITEM), has(ModItems.DEEPSLATE_GOLD_REED_ITEM))
                        .save(exporter, "gold_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_REDSTONE_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.REDSTONE)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.REDSTONE))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.REDSTONE)
                        .requires(ModItems.DEEPSLATE_REDSTONE_REED_ITEM, 1)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_REDSTONE_REED_ITEM), has(ModItems.DEEPSLATE_REDSTONE_REED_ITEM))
                        .save(exporter, "redstone_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_LAPIS_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.LAPIS_LAZULI)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.LAPIS_LAZULI))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                        .requires(ModItems.DEEPSLATE_LAPIS_REED_ITEM, 3)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_LAPIS_REED_ITEM), has(ModItems.DEEPSLATE_LAPIS_REED_ITEM))
                        .save(exporter, "lapis_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_DIAMOND_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.DIAMOND)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.DIAMOND))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.DIAMOND)
                        .requires(ModItems.DEEPSLATE_DIAMOND_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_DIAMOND_REED_ITEM), has(ModItems.DEEPSLATE_DIAMOND_REED_ITEM))
                        .save(exporter, "diamond_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_EMERALD_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.EMERALD)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.EMERALD))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.EMERALD)
                        .requires(ModItems.DEEPSLATE_EMERALD_REED_ITEM, 7)
                        .unlockedBy(getHasName(ModItems.DEEPSLATE_EMERALD_REED_ITEM), has(ModItems.DEEPSLATE_EMERALD_REED_ITEM))
                        .save(exporter, "emerald_from_reed_deepslate");

                shaped(RecipeCategory.MISC, ModItems.NETHER_QUARTZ_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.NETHERRACK).define('X', Items.QUARTZ)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.QUARTZ))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.QUARTZ)
                        .requires(ModItems.NETHER_QUARTZ_REED_ITEM, 4)
                        .unlockedBy(getHasName(ModItems.NETHER_QUARTZ_REED_ITEM), has(ModItems.NETHER_QUARTZ_REED_ITEM))
                        .save(exporter,"quartz_from_reed");

                shaped(RecipeCategory.MISC, ModItems.NETHER_GOLD_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.NETHERRACK).define('X', Items.GOLD_NUGGET)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.GOLD_NUGGET))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.GOLD_NUGGET)
                        .requires(ModItems.NETHER_GOLD_REED_ITEM)
                        .unlockedBy(getHasName(ModItems.NETHER_GOLD_REED_ITEM), has(ModItems.NETHER_GOLD_REED_ITEM))
                        .save(exporter,"gold_nugget_from_reed");

                shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RSR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.OBSIDIAN)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.OBSIDIAN))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.OBSIDIAN)
                        .requires(ModItems.OBSIDIAN_REED_ITEM, 4)
                        .unlockedBy(getHasName(ModItems.OBSIDIAN_REED_ITEM), has(ModItems.OBSIDIAN_REED_ITEM))
                        .save(exporter,"obsidian_from_reed");

                shaped(RecipeCategory.MISC, ModItems.GLOWSTONE_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.GLOWSTONE).define('X', Items.GLOWSTONE_DUST)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Blocks.GLOWSTONE))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.GLOWSTONE_DUST)
                        .requires(ModItems.GLOWSTONE_REED_ITEM)
                        .unlockedBy(getHasName(ModItems.GLOWSTONE_REED_ITEM), has(ModItems.GLOWSTONE_REED_ITEM))
                        .save(exporter,"glowstone_dust_from_reed");

                shaped(RecipeCategory.MISC, ModItems.CLAY_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.CLAY).define('X', Items.CLAY)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.CLAY))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.CLAY)
                        .requires(ModItems.CLAY_REED_ITEM,4)
                        .unlockedBy(getHasName(ModItems.CLAY_REED_ITEM), has(ModItems.CLAY_REED_ITEM))
                        .save(exporter,"clay_from_reed");

                shaped(RecipeCategory.MISC, ModItems.BLAZE_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Items.BLAZE_ROD).define('X', Items.BLAZE_POWDER)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.BLAZE_POWDER))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.BLAZE_ROD)
                        .requires(ModItems.BLAZE_REED_ITEM,4)
                        .unlockedBy(getHasName(ModItems.BLAZE_REED_ITEM), has(ModItems.BLAZE_REED_ITEM))
                        .save(exporter,"blaze_rod_from_reed");

                shaped(RecipeCategory.MISC, ModItems.ENDER_REED_ITEM)
                        .pattern("RXR")
                        .pattern("RXR")
                        .pattern("RXR")
                        .define('R', Items.SUGAR_CANE).define('X', Items.ENDER_PEARL)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.ENDER_PEARL))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.ENDER_PEARL)
                        .requires(ModItems.ENDER_REED_ITEM, 4)
                        .unlockedBy(getHasName(ModItems.ENDER_REED_ITEM), has(ModItems.ENDER_REED_ITEM))
                        .save(exporter,"ender_pearl_from_reed");

                shaped(RecipeCategory.MISC, ModItems.AMETHYST_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.AMETHYST_BLOCK).define('X', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.AMETHYST_BLOCK))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Items.AMETHYST_SHARD)
                        .requires(ModItems.AMETHYST_REED_ITEM)
                        .unlockedBy(getHasName(ModItems.AMETHYST_REED_ITEM), has(ModItems.AMETHYST_REED_ITEM))
                        .save(exporter,"amethyst_shard_from_reed");

                shaped(RecipeCategory.MISC, ModItems.ANCIENT_DEBRIS_REED_ITEM)
                        .pattern("RSR")
                        .pattern("RXR")
                        .pattern("RSR")
                        .define('R', Items.SUGAR_CANE).define('S', Blocks.ANCIENT_DEBRIS).define('X', Items.NETHERITE_SCRAP)
                        .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK), has(Items.ANCIENT_DEBRIS))
                        .save(exporter);
                shapeless(RecipeCategory.MISC, Blocks.ANCIENT_DEBRIS)
                        .requires(ModItems.ANCIENT_DEBRIS_REED_ITEM,8)
                        .unlockedBy(getHasName(ModItems.ANCIENT_DEBRIS_REED_ITEM), has(ModItems.ANCIENT_DEBRIS_REED_ITEM))
                        .save(exporter,"ancient_debris_from_reed");
            }
        };
    }
    


    @Override
    public String getName() {
        return "";
    }
}