package net.kc.growores.dynamic;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class OreDiscovery {

    public static List<Block> getAllOres() {

        return ForgeRegistries.BLOCKS.getValues()
                .stream()
                .filter(block -> {

                    BlockState state =
                            block.defaultBlockState();

                    ResourceLocation id =
                            ForgeRegistries.BLOCKS
                                    .getKey(block);

                    if (id == null) {
                        return false;
                    }

                    if (hardcoded(block)) {
                        return false;
                    }

                    // Primary detection: proper ore tags
                    boolean taggedOre =
                            state.is(Tags.Blocks.ORES);

                    // Fallback detection:
                    // catches poorly-tagged mods
                    boolean namedOre =
                            id.getPath().contains("_ore");

                    return taggedOre || namedOre;
                })
                .distinct()
                .toList();
    }

    public static boolean hardcoded(Block block){
        return block == Blocks.COAL_ORE || block == Blocks.IRON_ORE || block == Blocks.COPPER_ORE || block == Blocks.GOLD_ORE
                || block == Blocks.REDSTONE_ORE || block == Blocks.LAPIS_ORE || block == Blocks.DIAMOND_ORE || block == Blocks.EMERALD_ORE
                || block == Blocks.DEEPSLATE_COAL_ORE || block == Blocks.DEEPSLATE_IRON_ORE || block == Blocks.DEEPSLATE_COPPER_ORE
                || block == Blocks.DEEPSLATE_GOLD_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE
                || block == Blocks.DEEPSLATE_DIAMOND_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE
                || block == Blocks.NETHER_QUARTZ_ORE || block == Blocks.NETHER_GOLD_ORE;
    }
}
