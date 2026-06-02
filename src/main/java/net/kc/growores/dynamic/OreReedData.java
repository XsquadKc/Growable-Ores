package net.kc.growores.dynamic;

import net.kc.growores.GrowOres;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;

public final class OreReedData {
    public static final String ORE = "Ore";
    public static final String ITEM_TEXTURE = "ItemTexture";
    public static final String BLOCK_TEXTURE = "BlockTexture";

    private static final ResourceLocation DEFAULT_ITEM_TEXTURE =
            new ResourceLocation(GrowOres.MOD_ID, "textures/item/templates/stone_reed_item.png");
    private static final ResourceLocation DEFAULT_BLOCK_TEXTURE =
            new ResourceLocation(GrowOres.MOD_ID, "textures/block/growable_reed.png");

    private OreReedData() {
    }

    public static String textureName(ResourceLocation oreId) {
        return oreId.getNamespace() + "_" + oreId.getPath().replace("/", "_");
    }

    public static ResourceLocation itemTexture(ResourceLocation oreId) {
        return new ResourceLocation(
                GrowOres.MOD_ID,
                "textures/item/dynamic_reeds/" + textureName(oreId) + "_reed_item.png"
        );
    }

    public static ResourceLocation blockTexture(ResourceLocation oreId) {
        return new ResourceLocation(
                GrowOres.MOD_ID,
                "textures/block/dynamic_reeds/" + textureName(oreId) + "_reed.png"
        );
    }

    public static ResourceLocation getTexture(CompoundTag tag, String key, ResourceLocation fallback) {
        if (tag != null && tag.contains(key, 8)) {
            ResourceLocation parsed = ResourceLocation.tryParse(tag.getString(key));

            if (parsed != null) {
                return parsed;
            }
        }

        return fallback;
    }

    public static ResourceLocation getItemTexture(CompoundTag tag) {
        return getTexture(tag, ITEM_TEXTURE, DEFAULT_ITEM_TEXTURE);
    }

    public static ResourceLocation getBlockTexture(CompoundTag tag) {
        return getTexture(tag, BLOCK_TEXTURE, DEFAULT_BLOCK_TEXTURE);
    }
}
