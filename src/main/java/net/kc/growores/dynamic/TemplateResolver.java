package net.kc.growores.dynamic;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class TemplateResolver {

    public enum BaseType {
        STONE,
        DEEPSLATE,
        NETHERRACK,
        END_STONE,
        SOULSTONE
    }

    public static BaseType resolve(Block block) {

        String path = ForgeRegistries.BLOCKS.getKey(block.defaultBlockState().getBlock()).getPath();

        if (path.contains("soulstone") || path.contains("soul_stone") || path.contains("soulium")) {
            return BaseType.SOULSTONE;
        }

        if (block.defaultBlockState().is(BlockTags.BASE_STONE_NETHER) || path.contains("nether")) {
            return BaseType.NETHERRACK;
        }

        if (block.defaultBlockState().is(BlockTags.DEEPSLATE_ORE_REPLACEABLES) || path.contains("deepslate")) {
            return BaseType.DEEPSLATE;
        }

        if (path.contains("end_stone")
                || path.contains("endstone")
                || path.contains("_end_")
                || path.startsWith("end_")
                || path.endsWith("_end_ore")) {
            return BaseType.END_STONE;
        }

        return BaseType.STONE;
    }

    public static ResourceLocation getTemplate(BaseType type) {

        return switch (type) {
            case STONE -> new ResourceLocation("growores", "textures/block/template/stone.png");
            case DEEPSLATE -> new ResourceLocation("growores", "textures/block/template/deepslate.png");
            case NETHERRACK -> new ResourceLocation("growores", "textures/block/template/netherrack.png");
            case END_STONE -> new ResourceLocation("growores", "textures/block/template/end_stone.png");
            case SOULSTONE -> new ResourceLocation("growores", "textures/block/template/soulstone.png");
        };
    }

    public static ResourceLocation getReedTemplate(BaseType type) {

        return switch (type) {
            case STONE -> new ResourceLocation("growores", "textures/item/templates/stone_reed_item.png");
            case DEEPSLATE -> new ResourceLocation("growores", "textures/item/templates/deepslate_reed_item.png");
            case NETHERRACK -> new ResourceLocation("growores", "textures/item/templates/netherrack_reed_item.png");
            case END_STONE -> new ResourceLocation("growores", "textures/item/templates/end_reed_item.png");
            case SOULSTONE -> new ResourceLocation("growores", "textures/item/templates/soulstone_reed_item.png");
        };
    }

}
