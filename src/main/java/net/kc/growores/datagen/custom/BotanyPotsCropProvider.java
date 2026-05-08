package net.kc.growores.datagen.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.kc.growores.GrowOres;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class BotanyPotsCropProvider implements DataProvider {

    private final PackOutput output;

    public BotanyPotsCropProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {

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

    private CompletableFuture<?> generateCrop(CachedOutput cache, String oreName) {

        String reedBlock = GrowOres.MOD_ID + ":" + oreName + "_reed";
        String reedItem = GrowOres.MOD_ID + ":" + oreName + "_reed_item";

        JsonObject root = new JsonObject();


        /*
         * type
         */

        root.addProperty("type", "botanypots:crop");

        /*
         * display
         */
        JsonArray displayArray = new JsonArray();
        JsonObject display = new JsonObject();

        display.addProperty("block", reedBlock);
        displayArray.add(display);
        displayArray.add(display);
        root.add("display", displayArray);

        /*
         * growthTicks
         */

        root.addProperty("growthTicks", 1200);

        /*
         * seed
         */

        JsonObject seed = new JsonObject();
        seed.addProperty("item", reedItem);

        root.add("seed", seed);

        /*
         * categories
         */

        root.addProperty("categories", "growing_blocks");

        /*
         * drops
         */

        JsonObject drops = new JsonObject();

        drops.addProperty("chance", 1.00);

        JsonObject outputs = new JsonObject();
        outputs.addProperty("item", reedItem);

        drops.add("output", outputs);
        root.add("drops", drops);


        Path path = output.getOutputFolder()
                .resolve("data/botanypots/recipes/" +
                        oreName + "_reed_botany_pot.json");

        return DataProvider.saveStable(cache, root, path);
    }

    @Override
    public String getName() {
        return "GrowOres Botany Pots Compatibility";
    }
}