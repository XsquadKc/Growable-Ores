package net.kc.growores.dynamic;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OreReedRecipeGenerator {

    private static final String RECIPE_FOLDER = "data/growores/recipes/generated_reeds";
    private static final String BOTANY_POTS_FOLDER = "data/botanypots/recipes/generated_reeds";

    public static void generateAllRecipes(List<Block> ores) {

        writePackMeta();

        File recipeDir = GeneratedResourcePaths.debugGeneratedResource(RECIPE_FOLDER);
        File botanyPotsDir = GeneratedResourcePaths.debugGeneratedResource(BOTANY_POTS_FOLDER);

        if (!recipeDir.mkdirs() && !recipeDir.isDirectory()) {
            throw new IllegalStateException("Could not create generated recipe directory: " + recipeDir);
        }

        if (!botanyPotsDir.mkdirs() && !botanyPotsDir.isDirectory()) {
            throw new IllegalStateException("Could not create generated Botany Pots directory: " + botanyPotsDir);
        }

        for (Block ore : ores) {

            try {
                generateRecipe(ore, recipeDir);
                generateBotanyPotsRecipe(ore, botanyPotsDir);
            } catch (Exception e) {
                System.err.println("Failed recipe: " + ore);
                e.printStackTrace();
            }
        }
    }

    public static Path generateDataPack() {
        generateAllRecipes(OreDiscovery.getAllOres());
        return GeneratedResourcePaths.generatedPackRoot();
    }

    private static void generateRecipe(Block ore, File dir)
            throws Exception {

        ResourceLocation id =
                ForgeRegistries.BLOCKS.getKey(ore);
        TemplateResolver.BaseType base = TemplateResolver.resolve(ore);


        if (id == null) return;

        if (OreDiscovery.hardcoded(ore)) return;

        ResourceLocation ingredient = OreDropResolver.resolveDrop(ore, id);
        String json = buildRecipeJson(id, ingredient, base);

        File file =
                new File(dir, OreReedData.textureName(id)
                        + "_ore_reed_item.json");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json);
        }

        System.out.println("Generated recipe: " + file.getName());

        String resultJson = buildResultRecipeJson(id, ingredient, base);
        File resultFile = new File(dir, OreReedData.textureName(id) + "_from_ore_reeds.json");

        try (FileWriter writer = new FileWriter(resultFile)) {
            writer.write(resultJson);
        }

        System.out.println("Generated result recipe: " + resultFile.getName());
    }

    private static void generateBotanyPotsRecipe(Block ore, File dir)
            throws Exception {

        ResourceLocation id = ForgeRegistries.BLOCKS.getKey(ore);

        if (id == null) return;

        String json = buildBotanyPotsRecipeJson(id);
        File file = new File(dir, OreReedData.textureName(id) + "_reed_botany_pot.json");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json);
        }

        System.out.println("Generated Botany Pots recipe: " + file.getName());
    }

    private static void writePackMeta() {
        Path packRoot = GeneratedResourcePaths.generatedPackRoot();

        try {
            Files.createDirectories(packRoot);
            Files.writeString(packRoot.resolve("pack.mcmeta"), """
                    {
                      "pack": {
                        "description": {
                          "text": "Growable Ores generated reed recipes"
                        },
                        "pack_format": 15
                      }
                    }
                    """);
        } catch (Exception e) {
            throw new IllegalStateException("Could not write generated_reeds pack metadata", e);
        }
    }

    private static String buildRecipeJson(ResourceLocation oreId, ResourceLocation ingredient, TemplateResolver.BaseType base) {

        String baseBlock = switch (base) {
            case STONE -> "minecraft:stone";
            case DEEPSLATE -> "minecraft:deepslate";
            case NETHERRACK -> "minecraft:netherrack";
            case END_STONE -> "minecraft:end_stone";
            case SOULSTONE -> "mysticalagriculture:soulstone";
        };

        return """
        {
          "type": "minecraft:crafting_shaped",
          "category": "misc",
          "pattern": [
            "RSR",
            "ROR",
            "RSR"
          ],
          "key": {
            "R": {
              "item": "minecraft:sugar_cane"
            },
            "S": {
              "item": "%s"
            },
            "O": {
              "item": "%s"
            }
          },
          "result": {
            "item": "growores:ore_reed_item",
            "count": 1,
            "nbt": "%s"
          }
        }
        """.formatted(baseBlock, ingredient.toString(), recipeNbt(oreId));
    }

    private static String buildResultRecipeJson(ResourceLocation oreId, ResourceLocation result, TemplateResolver.BaseType base) {
        int reedCount = base == TemplateResolver.BaseType.DEEPSLATE ? 7 : 8;
        String ingredients = dynamicReedIngredients(oreId, reedCount);

        return """
        {
          "type": "minecraft:crafting_shapeless",
          "category": "misc",
          "ingredients": [
        %s
          ],
          "result": {
            "item": "%s",
            "count": 1
          }
        }
        """.formatted(ingredients, result.toString());
    }

    private static String dynamicReedIngredients(ResourceLocation oreId, int count) {
        String ingredient = """
            {
              "type": "forge:nbt",
              "item": "growores:ore_reed_item",
              "nbt": "%s"
            }""".formatted(recipeNbt(oreId));

        return (ingredient + ",\n").repeat(count - 1) + ingredient + "\n";
    }

    private static String buildBotanyPotsRecipeJson(ResourceLocation oreId) {
        String nbt = recipeNbt(oreId);

        return """
        {
          "type": "botanypots:crop",
          "categories": "growing_blocks",
          "display": [
            {
              "block": "growores:ore_reed_display"
            },
            {
              "block": "growores:ore_reed_display"
            }
          ],
          "drops": {
            "chance": 1.0,
            "output": {
              "item": "growores:ore_reed_item",
              "nbt": "%s"
            }
          },
          "growthTicks": 1200,
          "seed": {
            "type": "forge:nbt",
            "item": "growores:ore_reed_item",
            "nbt": "%s"
          }
        }
        """.formatted(nbt, nbt);
    }

    private static String recipeNbt(ResourceLocation oreId) {
        String ore = oreId.toString();
        String itemTexture = OreReedData.itemTexture(oreId).toString();
        String blockTexture = OreReedData.blockTexture(oreId).toString();

        return escapeJson("""
                {Ore:"%s",ItemTexture:"%s",BlockTexture:"%s",BlockEntityTag:{Ore:"%s",ItemTexture:"%s",BlockTexture:"%s"}}
                """.formatted(ore, itemTexture, blockTexture, ore, itemTexture, blockTexture).trim());
    }

    private static String escapeJson(String value) {
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"");
    }
}
