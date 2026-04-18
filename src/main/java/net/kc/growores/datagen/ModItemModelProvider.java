package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GrowOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        reedBlockAndItem(ModBlocks.COAL_REED, ModItems.COAL_REED_ITEM);
        reedBlockAndItem(ModBlocks.IRON_REED, ModItems.IRON_REED_ITEM);
        reedBlockAndItem(ModBlocks.COPPER_REED, ModItems.COPPER_REED_ITEM);
        reedBlockAndItem(ModBlocks.GOLD_REED, ModItems.GOLD_REED_ITEM);
        reedBlockAndItem(ModBlocks.REDSTONE_REED, ModItems.REDSTONE_REED_ITEM);
        reedBlockAndItem(ModBlocks.LAPIS_REED, ModItems.LAPIS_REED_ITEM);
        reedBlockAndItem(ModBlocks.DIAMOND_REED, ModItems.DIAMOND_REED_ITEM);
        reedBlockAndItem(ModBlocks.EMERALD_REED, ModItems.EMERALD_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_COAL_REED, ModItems.DEEPSLATE_COAL_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_IRON_REED, ModItems.DEEPSLATE_IRON_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_COPPER_REED, ModItems.DEEPSLATE_COPPER_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_GOLD_REED, ModItems.DEEPSLATE_GOLD_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_REDSTONE_REED, ModItems.DEEPSLATE_REDSTONE_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_LAPIS_REED, ModItems.DEEPSLATE_LAPIS_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_DIAMOND_REED, ModItems.DEEPSLATE_DIAMOND_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_EMERALD_REED, ModItems.DEEPSLATE_EMERALD_REED_ITEM);
        reedBlockAndItem(ModBlocks.NETHER_QUARTZ_REED, ModItems.NETHER_QUARTZ_REED_ITEM);
        reedBlockAndItem(ModBlocks.NETHER_GOLD_REED, ModItems.NETHER_GOLD_REED_ITEM);
        reedBlockAndItem(ModBlocks.OBSIDIAN_REED, ModItems.OBSIDIAN_REED_ITEM);
        reedBlockAndItem(ModBlocks.GLOWSTONE_REED, ModItems.GLOWSTONE_REED_ITEM);
        reedBlockAndItem(ModBlocks.CLAY_REED, ModItems.CLAY_REED_ITEM);
        reedBlockAndItem(ModBlocks.BLAZE_REED, ModItems.BLAZE_REED_ITEM);
        reedBlockAndItem(ModBlocks.ENDER_REED, ModItems.ENDER_REED_ITEM);
        reedBlockAndItem(ModBlocks.AMETHYST_REED, ModItems.AMETHYST_REED_ITEM);
        reedBlockAndItem(ModBlocks.ANCIENT_DEBRIS_REED, ModItems.ANCIENT_DEBRIS_REED_ITEM);

        //MODS
        //Applied Energistics 2
        reedBlockAndItem(ModBlocks.CERTUS_QUARTZ_REED, ModItems.CERTUS_QUARTZ_REED_ITEM);

        //Mystical Agriculture & Mystical Agradditions
        reedBlockAndItem(ModBlocks.SOULIUM_REED, ModItems.SOULIUM_REED_ITEM);
        reedBlockAndItem(ModBlocks.PROSPERITY_REED, ModItems.PROSPERITY_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_PROSPERITY_REED, ModItems.DEEPSLATE_PROSPERITY_REED_ITEM);
        reedBlockAndItem(ModBlocks.NETHER_PROSPERITY_REED, ModItems.NETHER_PROSPERITY_REED_ITEM);
        reedBlockAndItem(ModBlocks.END_PROSPERITY_REED, ModItems.END_PROSPERITY_REED_ITEM);
        reedBlockAndItem(ModBlocks.INFERIUM_REED, ModItems.INFERIUM_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_INFERIUM_REED, ModItems.DEEPSLATE_INFERIUM_REED_ITEM);
        reedBlockAndItem(ModBlocks.NETHER_INFERIUM_REED, ModItems.NETHER_INFERIUM_REED_ITEM);
        reedBlockAndItem(ModBlocks.END_INFERIUM_REED, ModItems.END_INFERIUM_REED_ITEM);

        //Extreme Reactors
        reedBlockAndItem(ModBlocks.ANGLESITE_REED, ModItems.ANGLESITE_REED_ITEM);
        reedBlockAndItem(ModBlocks.BENITOITE_REED, ModItems.BENITOITE_REED_ITEM);
        reedBlockAndItem(ModBlocks.YELLORITE_REED, ModItems.YELLORITE_REED_ITEM);

        //RFTools
        reedBlockAndItem(ModBlocks.DIMENSIONALSHARD_REED, ModItems.DIMENSIONALSHARD_REED_ITEM);
        reedBlockAndItem(ModBlocks.NETHER_DIMENSIONALSHARD_REED, ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM);
        reedBlockAndItem(ModBlocks.END_DIMENSIONALSHARD_REED, ModItems.END_DIMENSIONALSHARD_REED_ITEM);

        //Powah! Rearchitected
        reedBlockAndItem(ModBlocks.URANINITE_REED, ModItems.URANITITE_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_URANINITE_REED, ModItems.DEEPSLATE_URANITITE_REED_ITEM);

        //Create
        reedBlockAndItem(ModBlocks.ZINC_REED, ModItems.ZINC_REED_ITEM);
        reedBlockAndItem(ModBlocks.DEEPSLATE_ZINC_REED, ModItems.DEEPSLATE_ZINC_REED_ITEM);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(GrowOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void reedBlock(RegistryObject<Block> block) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/cross"))
                .texture("cross",  ResourceLocation.fromNamespaceAndPath(GrowOres.MOD_ID, "block/" + block.getId().getPath()))
                .renderType("cutout");
    }

    public void reedBlockAndItem(RegistryObject<Block> block, RegistryObject<Item> item){
        //reedBlock(block);
        simpleItem(item);
    }
}