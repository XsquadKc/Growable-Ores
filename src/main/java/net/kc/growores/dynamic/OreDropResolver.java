package net.kc.growores.dynamic;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class OreDropResolver {
    private static final Map<String, Item> VANILLA_DROPS = Map.ofEntries(
            Map.entry("coal_ore", Items.COAL),
            Map.entry("deepslate_coal_ore", Items.COAL),
            Map.entry("iron_ore", Items.RAW_IRON),
            Map.entry("deepslate_iron_ore", Items.RAW_IRON),
            Map.entry("copper_ore", Items.RAW_COPPER),
            Map.entry("deepslate_copper_ore", Items.RAW_COPPER),
            Map.entry("gold_ore", Items.RAW_GOLD),
            Map.entry("deepslate_gold_ore", Items.RAW_GOLD),
            Map.entry("redstone_ore", Items.REDSTONE),
            Map.entry("deepslate_redstone_ore", Items.REDSTONE),
            Map.entry("lapis_ore", Items.LAPIS_LAZULI),
            Map.entry("deepslate_lapis_ore", Items.LAPIS_LAZULI),
            Map.entry("diamond_ore", Items.DIAMOND),
            Map.entry("deepslate_diamond_ore", Items.DIAMOND),
            Map.entry("emerald_ore", Items.EMERALD),
            Map.entry("deepslate_emerald_ore", Items.EMERALD),
            Map.entry("nether_quartz_ore", Items.QUARTZ),
            Map.entry("nether_gold_ore", Items.GOLD_NUGGET),
            Map.entry("ancient_debris", Items.NETHERITE_SCRAP)
    );

    private OreDropResolver() {
    }

    public static ResourceLocation resolveDrop(Block ore, ResourceLocation oreId) {
        Item vanillaDrop = VANILLA_DROPS.get(oreId.getPath());

        if (vanillaDrop != null) {
            ResourceLocation vanillaDropId = ForgeRegistries.ITEMS.getKey(vanillaDrop);

            if (vanillaDropId != null) {
                return vanillaDropId;
            }
        }

        return findLootTableDrop(ore, oreId).orElse(oreId);
    }

    private static Optional<ResourceLocation> findLootTableDrop(Block ore, ResourceLocation oreId) {
        ResourceLocation lootTable = ore.getLootTable();
        String relativeLootPath = "data/" + lootTable.getNamespace() + "/loot_tables/" + lootTable.getPath() + ".json";

        return ModList.get()
                .applyForEachModFile(modFile -> readLootDrop(modFile.findResource(relativeLootPath), oreId))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
    }

    private static Optional<ResourceLocation> readLootDrop(Path path, ResourceLocation oreId) {
        if (!Files.isRegularFile(path)) {
            return Optional.empty();
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            List<ResourceLocation> itemEntries = new ArrayList<>();
            collectItemEntries(JsonParser.parseReader(reader), itemEntries);

            return itemEntries.stream()
                    .filter(itemId -> !itemId.equals(oreId))
                    .filter(itemId -> ForgeRegistries.ITEMS.containsKey(itemId))
                    .findFirst()
                    .or(() -> itemEntries.stream()
                            .filter(itemId -> ForgeRegistries.ITEMS.containsKey(itemId))
                            .findFirst());
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private static void collectItemEntries(JsonElement element, List<ResourceLocation> itemEntries) {
        if (element == null || element.isJsonNull()) {
            return;
        }

        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();

            if (object.has("type")
                    && "minecraft:item".equals(object.get("type").getAsString())
                    && object.has("name")) {
                ResourceLocation itemId = ResourceLocation.tryParse(object.get("name").getAsString());

                if (itemId != null) {
                    itemEntries.add(itemId);
                }
            }

            for (Map.Entry<String, JsonElement> entry : object.entrySet()) {
                collectItemEntries(entry.getValue(), itemEntries);
            }

            return;
        }

        if (element.isJsonArray()) {
            element.getAsJsonArray().forEach(child -> collectItemEntries(child, itemEntries));
        }
    }
}
