package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GROWING_BLOCK.get(), 8)
                .requires(Items.BONE_MEAL).requires(Items.COAL).requires(Items.DIRT)
                .requires(Items.SUGAR_CANE).requires(Items.IRON_INGOT).requires(Items.REDSTONE)
                .requires(Items.DIAMOND).requires(Items.GOLD_INGOT).requires(Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COAL_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.COAL)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.COAL))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COAL)
                .requires(ModItems.COAL_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.COAL_REED_ITEM.get()), has(ModItems.COAL_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_IRON)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_IRON))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_IRON)
                .requires(ModItems.IRON_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.IRON_REED_ITEM.get()), has(ModItems.IRON_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_COPPER)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_COPPER))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_COPPER)
                .requires(ModItems.COPPER_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.COPPER_REED_ITEM.get()), has(ModItems.COPPER_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.RAW_GOLD)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_GOLD))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_GOLD)
                .requires(ModItems.GOLD_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.GOLD_REED_ITEM.get()), has(ModItems.GOLD_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REDSTONE_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.REDSTONE)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.REDSTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.REDSTONE)
                .requires(ModItems.REDSTONE_REED_ITEM.get(), 2)
                .unlockedBy(getHasName(ModItems.REDSTONE_REED_ITEM.get()), has(ModItems.REDSTONE_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LAPIS_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.LAPIS_LAZULI))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI)
                .requires(ModItems.LAPIS_REED_ITEM.get(), 4)
                .unlockedBy(getHasName(ModItems.LAPIS_REED_ITEM.get()), has(ModItems.LAPIS_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.DIAMOND)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.DIAMOND))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND)
                .requires(ModItems.DIAMOND_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.DIAMOND_REED_ITEM.get()), has(ModItems.DIAMOND_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.STONE).define('X', Items.EMERALD)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.EMERALD))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.EMERALD)
                .requires(ModItems.EMERALD_REED_ITEM.get(), 8)
                .unlockedBy(getHasName(ModItems.EMERALD_REED_ITEM.get()), has(ModItems.EMERALD_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_COAL_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.COAL)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.COAL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_IRON_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_IRON)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_IRON))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_COPPER_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_COPPER)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_COPPER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_GOLD_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.RAW_GOLD)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.RAW_GOLD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_REDSTONE_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.REDSTONE)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.REDSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_LAPIS_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.LAPIS_LAZULI))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_DIAMOND_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.DIAMOND)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEPSLATE_EMERALD_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.DEEPSLATE).define('X', Items.EMERALD)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHER_QUARTZ_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.NETHERRACK).define('X', Items.QUARTZ)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.QUARTZ))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.QUARTZ)
                .requires(ModItems.NETHER_QUARTZ_REED_ITEM.get(), 4)
                .unlockedBy(getHasName(ModItems.NETHER_QUARTZ_REED_ITEM.get()), has(ModItems.NETHER_QUARTZ_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHER_GOLD_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.NETHERRACK).define('X', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.GOLD_NUGGET))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GOLD_NUGGET)
                .requires(ModItems.NETHER_GOLD_REED_ITEM.get())
                .unlockedBy(getHasName(ModItems.NETHER_GOLD_REED_ITEM.get()), has(ModItems.NETHER_GOLD_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RSR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.OBSIDIAN))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.OBSIDIAN)
                .requires(ModItems.OBSIDIAN_REED_ITEM.get(), 4)
                .unlockedBy(getHasName(ModItems.OBSIDIAN_REED_ITEM.get()), has(ModItems.OBSIDIAN_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLOWSTONE_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.GLOWSTONE).define('X', Items.GLOWSTONE_DUST)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Blocks.GLOWSTONE))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GLOWSTONE_DUST)
                .requires(ModItems.GLOWSTONE_REED_ITEM.get())
                .unlockedBy(getHasName(ModItems.GLOWSTONE_REED_ITEM.get()), has(ModItems.GLOWSTONE_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CLAY_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.CLAY).define('X', Items.CLAY)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.CLAY))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CLAY)
                .requires(ModItems.CLAY_REED_ITEM.get(),4)
                .unlockedBy(getHasName(ModItems.CLAY_REED_ITEM.get()), has(ModItems.CLAY_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLAZE_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Items.BLAZE_ROD).define('X', Items.BLAZE_POWDER)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.BLAZE_POWDER))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLAZE_ROD)
                .requires(ModItems.BLAZE_REED_ITEM.get(),4)
                .unlockedBy(getHasName(ModItems.BLAZE_REED_ITEM.get()), has(ModItems.BLAZE_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDER_REED_ITEM.get())
                .pattern("RXR")
                .pattern("RXR")
                .pattern("RXR")
                .define('R', Items.SUGAR_CANE).define('X', Items.ENDER_PEARL)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.ENDER_PEARL))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ENDER_PEARL)
                .requires(ModItems.ENDER_REED_ITEM.get(), 4)
                .unlockedBy(getHasName(ModItems.ENDER_REED_ITEM.get()), has(ModItems.ENDER_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.AMETHYST_BLOCK).define('X', Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.AMETHYST_BLOCK))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.AMETHYST_SHARD)
                .requires(ModItems.AMETHYST_REED_ITEM.get())
                .unlockedBy(getHasName(ModItems.AMETHYST_REED_ITEM.get()), has(ModItems.AMETHYST_REED_ITEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANCIENT_DEBRIS_REED_ITEM.get())
                .pattern("RSR")
                .pattern("RXR")
                .pattern("RSR")
                .define('R', Items.SUGAR_CANE).define('S', Blocks.ANCIENT_DEBRIS).define('X', Items.NETHERITE_SCRAP)
                .unlockedBy(getHasName(ModBlocks.GROWING_BLOCK.get()), has(Items.ANCIENT_DEBRIS))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Blocks.ANCIENT_DEBRIS)
                .requires(ModItems.ANCIENT_DEBRIS_REED_ITEM.get(),8)
                .unlockedBy(getHasName(ModItems.ANCIENT_DEBRIS_REED_ITEM.get()), has(ModItems.ANCIENT_DEBRIS_REED_ITEM.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  GrowOres.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}