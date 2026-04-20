package net.kc.growores.util;

import net.kc.growores.GrowOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> GROWING_BLOCKS = tag("growing_blocks");

        private static TagKey<Block> tag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(GrowOres.MOD_ID,name));
        }
    }

    public static class Items{
        private static TagKey<Item> tag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(GrowOres.MOD_ID,name));
        }
    }
}
