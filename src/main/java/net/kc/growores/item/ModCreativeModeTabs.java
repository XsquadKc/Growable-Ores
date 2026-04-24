package net.kc.growores.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> GROWORES_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            Identifier.fromNamespaceAndPath(GrowOres.MOD_ID,"growores_tab"));

    public static final CreativeModeTab GROWORES_TAB = FabricCreativeModeTab.builder()
            .icon(()-> new ItemStack(ModBlocks.GROWING_BLOCK))
                .title(Component.translatable("creativeTab.growores.growores_tab"))
                .displayItems((displayContext, pOutput) -> {
                pOutput.accept(ModBlocks.GROWING_BLOCK);
                pOutput.accept(ModItems.COAL_REED_ITEM);
                pOutput.accept(ModItems.IRON_REED_ITEM);
                pOutput.accept(ModItems.COPPER_REED_ITEM);
                pOutput.accept(ModItems.GOLD_REED_ITEM);
                pOutput.accept(ModItems.REDSTONE_REED_ITEM);
                pOutput.accept(ModItems.LAPIS_REED_ITEM);
                pOutput.accept(ModItems.DIAMOND_REED_ITEM);
                pOutput.accept(ModItems.EMERALD_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_COAL_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_IRON_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_COPPER_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_GOLD_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_REDSTONE_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_LAPIS_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_DIAMOND_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_EMERALD_REED_ITEM);
                pOutput.accept(ModItems.NETHER_QUARTZ_REED_ITEM);
                pOutput.accept(ModItems.NETHER_GOLD_REED_ITEM);
                pOutput.accept(ModItems.OBSIDIAN_REED_ITEM);
                pOutput.accept(ModItems.GLOWSTONE_REED_ITEM);
                pOutput.accept(ModItems.CLAY_REED_ITEM);
                pOutput.accept(ModItems.ENDER_REED_ITEM);
                pOutput.accept(ModItems.BLAZE_REED_ITEM);
                pOutput.accept(ModItems.AMETHYST_REED_ITEM);
                pOutput.accept(ModItems.ANCIENT_DEBRIS_REED_ITEM);

                //Mods
                //Applied Energistics 2
                pOutput.accept(ModItems.CERTUS_QUARTZ_REED_ITEM);

                //Mystical Agriculture & Mystical Agradditions
                pOutput.accept(ModItems.SOULIUM_REED_ITEM);
                pOutput.accept(ModItems.PROSPERITY_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM);
                pOutput.accept(ModItems.NETHER_PROSPERITY_REED_ITEM);
                pOutput.accept(ModItems.END_PROSPERITY_REED_ITEM);
                pOutput.accept(ModItems.INFERIUM_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_INFERIUM_REED_ITEM);
                pOutput.accept(ModItems.NETHER_INFERIUM_REED_ITEM);
                pOutput.accept(ModItems.END_INFERIUM_REED_ITEM);

                //Extreme Reactors
                pOutput.accept(ModItems.ANGLESITE_REED_ITEM);
                pOutput.accept(ModItems.BENITOITE_REED_ITEM);
                pOutput.accept(ModItems.YELLORITE_REED_ITEM);

                //RFTools
                pOutput.accept(ModItems.DIMENSIONALSHARD_REED_ITEM);
                pOutput.accept(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM);
                pOutput.accept(ModItems.END_DIMENSIONALSHARD_REED_ITEM);

                //Powah! Rearchitected
                pOutput.accept(ModItems.URANITITE_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_URANITITE_REED_ITEM);

                //Create
                pOutput.accept(ModItems.ZINC_REED_ITEM);
                pOutput.accept(ModItems.DEEPSLATE_ZINC_REED_ITEM);

            }).build();

    public static void registerItemGroups(){
        GrowOres.LOGGER.info("Registering Item Groups for " + GrowOres.MOD_ID);
    }

}
