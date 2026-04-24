package net.kc.growores.util;

import net.kc.growores.GrowOres;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> GROWING_BLOCKS = tag("growing_blocks");

        private static TagKey<Block> tag(String name){
            return TagKey.create(BuiltInRegistries.BLOCK.key(), Identifier.fromNamespaceAndPath(GrowOres.MOD_ID,name));
        }
    }

    public static class Items{
        private static TagKey<Item> tag(String name){
            return TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(GrowOres.MOD_ID,name));
        }
    }
}
