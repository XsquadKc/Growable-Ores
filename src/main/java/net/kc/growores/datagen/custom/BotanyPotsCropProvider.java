package net.kc.growores.datagen.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.kc.growores.GrowOres;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class BotanyPotsCropProvider implements DataProvider {

    private final FabricDataOutput output;

    public BotanyPotsCropProvider(FabricDataOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(DataWriter cache) {

        return CompletableFuture.allOf(
                generateCrop(cache, "coal"),
                generateCrop(cache, "iron"),
                generateCrop(cache, "gold"),
                generateCrop(cache, "diamond"),
                generateCrop(cache, "emerald"),
                generateCrop(cache, "redstone"),
                generateCrop(cache, "lapis"),
                generateCrop(cache, "coal"),
                generateCrop(cache, "iron"),
                generateCrop(cache, "copper"),
                generateCrop(cache, "gold"),
                generateCrop(cache, "redstone"),
                generateCrop(cache, "lapis"),
                generateCrop(cache, "diamond"),
                generateCrop(cache, "emerald"),
                generateCrop(cache, "deepslate_coal"),
                generateCrop(cache, "deepslate_iron"),
                generateCrop(cache, "deepslate_copper"),
                generateCrop(cache, "deepslate_gold"),
                generateCrop(cache, "deepslate_redstone"),
                generateCrop(cache, "deepslate_lapis"),
                generateCrop(cache, "deepslate_diamond"),
                generateCrop(cache, "deepslate_emerald"),
                generateCrop(cache, "nether_quartz"),
                generateCrop(cache, "nether_gold"),
                generateCrop(cache, "obsidian"),
                generateCrop(cache, "glowstone"),
                generateCrop(cache, "clay"),
                generateCrop(cache, "blaze"),
                generateCrop(cache, "ender"),
                generateCrop(cache, "amethyst"),
                generateCrop(cache, "ancient_debris"),

                generateCrop(cache, "certus_quartz"),

                generateCrop(cache, "soulium"),
                generateCrop(cache, "prosperity"),
                generateCrop(cache, "deepslate_prosperity"),
                generateCrop(cache, "nether_prosperity"),
                generateCrop(cache, "end_prosperity"),
                generateCrop(cache, "inferium"),
                generateCrop(cache, "deepslate_inferium"),
                generateCrop(cache, "nether_inferium"),
                generateCrop(cache, "end_inferium"),

                generateCrop(cache, "anglesite"),
                generateCrop(cache, "benitoite"),
                generateCrop(cache, "yellorite"),

                generateCrop(cache, "dimensionalshard"),
                generateCrop(cache, "nether_dimensionalshard"),
                generateCrop(cache, "end_dimensionalshard"),

                generateCrop(cache, "uraninite"),
                generateCrop(cache, "deepslate_uraninite"),

                generateCrop(cache, "zinc"),
                generateCrop(cache, "deepslate_zinc")
        );
    }

    private CompletableFuture<?> generateCrop(DataWriter cache, String oreName) {

        String reedBlock = GrowOres.MOD_ID + ":" + oreName + "_reed";
        String reedItem = GrowOres.MOD_ID + ":" + oreName + "_reed_item";

        JsonObject root = new JsonObject();

        /*
         * bookshelf:load_conditions
         */

        JsonArray loadConditions = new JsonArray();

        JsonObject condition = new JsonObject();
        condition.addProperty("type", "bookshelf:block_exists");

        JsonArray values = new JsonArray();
        values.add(reedBlock);

        condition.add("values", values);

        loadConditions.add(condition);

        root.add("bookshelf:load_conditions", loadConditions);

        /*
         * type
         */

        root.addProperty("type", "botanypots:block_derived_crop");

        /*
         * block
         */

        root.addProperty("block", reedBlock);

        /*
         * input
         */

        JsonObject input = new JsonObject();
        input.addProperty("item", reedItem);

        root.add("input", input);

        /*
         * soil
         */

        JsonObject soil = new JsonObject();

        soil.addProperty("type", "bookshelf:block_tag");

        // Needed for cross-loader compatibility
        soil.addProperty("fabric:type", "bookshelf:block_tag");

        soil.addProperty("tag", "growores:growing_blocks");

        root.add("soil", soil);

        Path path = output.getPath()
                .resolve("data/botanypots/recipe/" +
                        oreName + "_reed_botany_pot.json");

        return DataProvider.writeToPath(cache, root, path);
    }


    @Override
    public String getName() {
        return "GrowOres Botany Pots Compatibility";
    }
}