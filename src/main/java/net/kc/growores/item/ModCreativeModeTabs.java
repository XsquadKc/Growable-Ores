package net.kc.growores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModCreativeModeTabs {

    public static final ItemGroup GROWORES_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GrowOres.MOD_ID,"growores_tab"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.GROWING_BLOCK))
                .displayName(Text.translatable("itemgroup.growores.growores_tab"))
                .entries((displayContext, pOutput) -> {
                pOutput.add(ModBlocks.GROWING_BLOCK);
                pOutput.add(ModItems.COAL_REED_ITEM);
                pOutput.add(ModItems.IRON_REED_ITEM);
                pOutput.add(ModItems.COPPER_REED_ITEM);
                pOutput.add(ModItems.GOLD_REED_ITEM);
                pOutput.add(ModItems.REDSTONE_REED_ITEM);
                pOutput.add(ModItems.LAPIS_REED_ITEM);
                pOutput.add(ModItems.DIAMOND_REED_ITEM);
                pOutput.add(ModItems.EMERALD_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_COAL_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_IRON_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_COPPER_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_GOLD_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_REDSTONE_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_LAPIS_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_DIAMOND_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_EMERALD_REED_ITEM);
                pOutput.add(ModItems.NETHER_QUARTZ_REED_ITEM);
                pOutput.add(ModItems.NETHER_GOLD_REED_ITEM);
                pOutput.add(ModItems.OBSIDIAN_REED_ITEM);
                pOutput.add(ModItems.GLOWSTONE_REED_ITEM);
                pOutput.add(ModItems.CLAY_REED_ITEM);
                pOutput.add(ModItems.ENDER_REED_ITEM);
                pOutput.add(ModItems.BLAZE_REED_ITEM);
                pOutput.add(ModItems.AMETHYST_REED_ITEM);
                pOutput.add(ModItems.ANCIENT_DEBRIS_REED_ITEM);

                //Mods
                //Applied Energistics 2
                pOutput.add(ModItems.CERTUS_QUARTZ_REED_ITEM);

                //Mystical Agriculture & Mystical Agradditions
                pOutput.add(ModItems.SOULIUM_REED_ITEM);
                pOutput.add(ModItems.PROSPERITY_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM);
                pOutput.add(ModItems.NETHER_PROSPERITY_REED_ITEM);
                pOutput.add(ModItems.END_PROSPERITY_REED_ITEM);
                pOutput.add(ModItems.INFERIUM_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_INFERIUM_REED_ITEM);
                pOutput.add(ModItems.NETHER_INFERIUM_REED_ITEM);
                pOutput.add(ModItems.END_INFERIUM_REED_ITEM);

                //Extreme Reactors
                pOutput.add(ModItems.ANGLESITE_REED_ITEM);
                pOutput.add(ModItems.BENITOITE_REED_ITEM);
                pOutput.add(ModItems.YELLORITE_REED_ITEM);

                //RFTools
                pOutput.add(ModItems.DIMENSIONALSHARD_REED_ITEM);
                pOutput.add(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM);
                pOutput.add(ModItems.END_DIMENSIONALSHARD_REED_ITEM);

                //Powah! Rearchitected
                pOutput.add(ModItems.URANITITE_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_URANITITE_REED_ITEM);

                //Create
                pOutput.add(ModItems.ZINC_REED_ITEM);
                pOutput.add(ModItems.DEEPSLATE_ZINC_REED_ITEM);

            }).build());

    public static void registerItemGroups(){
        GrowOres.LOGGER.info("Registering Item Groups for " + GrowOres.MOD_ID);
    }
}
