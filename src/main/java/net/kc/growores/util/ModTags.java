package net.kc.growores.util;

import net.kc.growores.GrowOres;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> GROWING_BLOCKS = tag("growing_blocks");
        private static TagKey<Block> tag(String name){
            return BlockTags.create(Identifier.fromNamespaceAndPath(GrowOres.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(Identifier.fromNamespaceAndPath(GrowOres.MOD_ID, name));
        }
    }
}
