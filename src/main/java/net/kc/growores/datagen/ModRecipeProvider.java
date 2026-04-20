package net.kc.growores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GROWING_BLOCK, 8)
                .input(Items.BONE_MEAL).input(Items.COAL).input(Items.DIRT)
                .input(Items.SUGAR_CANE).input(Items.IRON_INGOT).input(Items.REDSTONE)
                .input(Items.DIAMOND).input(Items.GOLD_INGOT).input(Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COAL_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.COAL)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.COAL))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COAL)
                .input(ModItems.COAL_REED_ITEM, 8)
                .criterion(hasItem(ModItems.COAL_REED_ITEM), conditionsFromItem(ModItems.COAL_REED_ITEM))
                .offerTo(exporter, "coal_from_reed");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.RAW_IRON)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_IRON))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_IRON)
                .input(ModItems.IRON_REED_ITEM, 8)
                .criterion(hasItem(ModItems.IRON_REED_ITEM), conditionsFromItem(ModItems.IRON_REED_ITEM))
                .offerTo(exporter,"iron_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.RAW_COPPER)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_COPPER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_COPPER)
                .input(ModItems.COPPER_REED_ITEM, 8)
                .criterion(hasItem(ModItems.COPPER_REED_ITEM), conditionsFromItem(ModItems.COPPER_REED_ITEM))
                .offerTo(exporter,"copper_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.RAW_GOLD)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_GOLD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_GOLD)
                .input(ModItems.GOLD_REED_ITEM, 8)
                .criterion(hasItem(ModItems.GOLD_REED_ITEM), conditionsFromItem(ModItems.GOLD_REED_ITEM))
                .offerTo(exporter,"gold_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REDSTONE_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.REDSTONE)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.REDSTONE)
                .input(ModItems.REDSTONE_REED_ITEM, 2)
                .criterion(hasItem(ModItems.REDSTONE_REED_ITEM), conditionsFromItem(ModItems.REDSTONE_REED_ITEM))
                .offerTo(exporter,"redstone_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAPIS_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.LAPIS_LAZULI)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                .input(ModItems.LAPIS_REED_ITEM, 4)
                .criterion(hasItem(ModItems.LAPIS_REED_ITEM), conditionsFromItem(ModItems.LAPIS_REED_ITEM))
                .offerTo(exporter,"lapis_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.DIAMOND)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND)
                .input(ModItems.DIAMOND_REED_ITEM, 8)
                .criterion(hasItem(ModItems.DIAMOND_REED_ITEM), conditionsFromItem(ModItems.DIAMOND_REED_ITEM))
                .offerTo(exporter,"diamond_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.STONE).input('X', Items.EMERALD)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EMERALD)
                .input(ModItems.EMERALD_REED_ITEM, 8)
                .criterion(hasItem(ModItems.EMERALD_REED_ITEM), conditionsFromItem(ModItems.EMERALD_REED_ITEM))
                .offerTo(exporter,"emerald_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_COAL_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.COAL)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.COAL))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COAL)
                .input(ModItems.DEEPSLATE_COAL_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_COAL_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_COAL_REED_ITEM))
                .offerTo(exporter, "coal_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_IRON_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.RAW_IRON)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_IRON))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_IRON)
                .input(ModItems.DEEPSLATE_IRON_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_IRON_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_IRON_REED_ITEM))
                .offerTo(exporter, "iron_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_COPPER_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.RAW_COPPER)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_COPPER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_COPPER)
                .input(ModItems.DEEPSLATE_COPPER_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_COPPER_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_COPPER_REED_ITEM))
                .offerTo(exporter, "copper_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_GOLD_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.RAW_GOLD)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.RAW_GOLD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RAW_GOLD)
                .input(ModItems.DEEPSLATE_GOLD_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_GOLD_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_GOLD_REED_ITEM))
                .offerTo(exporter, "gold_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_REDSTONE_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.REDSTONE)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.REDSTONE)
                .input(ModItems.DEEPSLATE_REDSTONE_REED_ITEM, 1)
                .criterion(hasItem(ModItems.DEEPSLATE_REDSTONE_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_REDSTONE_REED_ITEM))
                .offerTo(exporter, "redstone_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_LAPIS_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.LAPIS_LAZULI)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                .input(ModItems.DEEPSLATE_LAPIS_REED_ITEM, 3)
                .criterion(hasItem(ModItems.DEEPSLATE_LAPIS_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_LAPIS_REED_ITEM))
                .offerTo(exporter, "lapis_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_DIAMOND_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.DIAMOND)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND)
                .input(ModItems.DEEPSLATE_DIAMOND_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_DIAMOND_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_DIAMOND_REED_ITEM))
                .offerTo(exporter, "diamond_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEEPSLATE_EMERALD_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.DEEPSLATE).input('X', Items.EMERALD)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EMERALD)
                .input(ModItems.DEEPSLATE_EMERALD_REED_ITEM, 7)
                .criterion(hasItem(ModItems.DEEPSLATE_EMERALD_REED_ITEM), conditionsFromItem(ModItems.DEEPSLATE_EMERALD_REED_ITEM))
                .offerTo(exporter, "emerald_from_reed_deepslate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHER_QUARTZ_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.NETHERRACK).input('X', Items.QUARTZ)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.QUARTZ)
                .input(ModItems.NETHER_QUARTZ_REED_ITEM, 4)
                .criterion(hasItem(ModItems.NETHER_QUARTZ_REED_ITEM), conditionsFromItem(ModItems.NETHER_QUARTZ_REED_ITEM))
                .offerTo(exporter,"quartz_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHER_GOLD_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.NETHERRACK).input('X', Items.GOLD_NUGGET)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GOLD_NUGGET)
                .input(ModItems.NETHER_GOLD_REED_ITEM)
                .criterion(hasItem(ModItems.NETHER_GOLD_REED_ITEM), conditionsFromItem(ModItems.NETHER_GOLD_REED_ITEM))
                .offerTo(exporter,"gold_nugget_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_REED_ITEM)
                .pattern("RSR")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.OBSIDIAN)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OBSIDIAN)
                .input(ModItems.OBSIDIAN_REED_ITEM, 4)
                .criterion(hasItem(ModItems.OBSIDIAN_REED_ITEM), conditionsFromItem(ModItems.OBSIDIAN_REED_ITEM))
                .offerTo(exporter,"obsidian_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLOWSTONE_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.GLOWSTONE).input('X', Items.GLOWSTONE_DUST)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Blocks.GLOWSTONE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GLOWSTONE_DUST)
                .input(ModItems.GLOWSTONE_REED_ITEM)
                .criterion(hasItem(ModItems.GLOWSTONE_REED_ITEM), conditionsFromItem(ModItems.GLOWSTONE_REED_ITEM))
                .offerTo(exporter,"glowstone_dust_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLAY_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.CLAY).input('X', Items.CLAY)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.CLAY))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CLAY)
                .input(ModItems.CLAY_REED_ITEM,4)
                .criterion(hasItem(ModItems.CLAY_REED_ITEM), conditionsFromItem(ModItems.CLAY_REED_ITEM))
                .offerTo(exporter,"clay_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZE_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Items.BLAZE_ROD).input('X', Items.BLAZE_POWDER)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLAZE_ROD)
                .input(ModItems.BLAZE_REED_ITEM,4)
                .criterion(hasItem(ModItems.BLAZE_REED_ITEM), conditionsFromItem(ModItems.BLAZE_REED_ITEM))
                .offerTo(exporter,"blaze_rod_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDER_REED_ITEM)
                .pattern("RXR")
                .pattern("RXR")
                .pattern("RXR")
                .input('R', Items.SUGAR_CANE).input('X', Items.ENDER_PEARL)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ENDER_PEARL)
                .input(ModItems.ENDER_REED_ITEM, 4)
                .criterion(hasItem(ModItems.ENDER_REED_ITEM), conditionsFromItem(ModItems.ENDER_REED_ITEM))
                .offerTo(exporter,"ender_pearl_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.AMETHYST_BLOCK).input('X', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.AMETHYST_SHARD)
                .input(ModItems.AMETHYST_REED_ITEM)
                .criterion(hasItem(ModItems.AMETHYST_REED_ITEM), conditionsFromItem(ModItems.AMETHYST_REED_ITEM))
                .offerTo(exporter,"amethyst_shard_from_reed");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANCIENT_DEBRIS_REED_ITEM)
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .input('R', Items.SUGAR_CANE).input('S', Blocks.ANCIENT_DEBRIS).input('X', Items.NETHERITE_SCRAP)
                .criterion(hasItem(ModBlocks.GROWING_BLOCK), conditionsFromItem(Items.ANCIENT_DEBRIS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.ANCIENT_DEBRIS)
                .input(ModItems.ANCIENT_DEBRIS_REED_ITEM,8)
                .criterion(hasItem(ModItems.ANCIENT_DEBRIS_REED_ITEM), conditionsFromItem(ModItems.ANCIENT_DEBRIS_REED_ITEM))
                .offerTo(exporter,"ancient_debris_from_reed");
    }
}