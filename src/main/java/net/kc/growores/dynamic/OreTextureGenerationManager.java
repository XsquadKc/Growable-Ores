package net.kc.growores.dynamic;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static net.kc.growores.dynamic.OreReedRecipeGenerator.generateAllRecipes;
import static net.kc.growores.dynamic.TextureAnalysisHelper.loadTexture;

public class OreTextureGenerationManager {

    public static void generateAll() {

        List<Block> ores =
                OreDiscovery.getAllOres();
        List<Block> generatedOres =
                new ArrayList<>();

        System.out.println(
                "Found ores: " + ores.size()
        );

        for (Block ore : ores) {

            try {

                if (processOre(ore)) {
                    generatedOres.add(ore);
                }

            } catch (Exception e) {

                System.err.println(
                        "Failed ore: "
                                + ore
                );

                e.printStackTrace();
            }
        }

        generateAllRecipes(generatedOres);
    }

    private static boolean processOre(Block ore)
            throws Exception {

        ResourceLocation targetRegName = ForgeRegistries.BLOCKS.getKey(ore.defaultBlockState().getBlock());
        ResourceLocation targetTexture = new ResourceLocation(
        targetRegName.getNamespace(), "textures/block/" + targetRegName.getPath() + ".png");

        ResourceLocation oreTextureLoc =
                OreTextureResolver.getTexture(ore);

        if (oreTextureLoc == null) {
            System.out.println(
                    "Skipping ore without a readable texture: "
                            + targetRegName
            );

            return false;
        }

        NativeImage oreTexture = loadTexture(oreTextureLoc);

        NativeImage generatedBlock =
                ReedBlockTextureGenerator.applyMask(
                        oreTexture,
                        new ResourceLocation(
                                "growores",
                                "textures/block/template/reed_mask.png"
                        )
                );
        ResourceLocation generatedBlockTexture =
                OreReedData.blockTexture(targetRegName);

        String name = OreReedData.textureName(targetRegName);

        File blockOut =
                GeneratedResourcePaths.debugGeneratedResource(
                        "block/" + name + "_reed.png"
                );
        blockOut.getParentFile().mkdirs();

        generatedBlock.writeToFile(blockOut);
        registerTexture(generatedBlockTexture, generatedBlock);

        String mcmeta = AnimationMetaIO.loadMcmeta(oreTextureLoc);

        if (mcmeta != null) {
            File metaFile =
                    new File(blockOut.getAbsolutePath() + ".mcmeta");

            try (FileWriter writer = new FileWriter(metaFile)) {
                writer.write(mcmeta);
                System.out.println("Copied mcmeta for: " + oreTextureLoc);
            }
        }
        else {
            System.out.println("No animation: " + oreTextureLoc);
        }

        oreTexture.close();

        System.out.println(
                "Generated reed block texture: "
                        + blockOut.getName()
        );


        // Find Ore Colours
        TemplateResolver.BaseType base = TemplateResolver.resolve(ore);
        ResourceLocation template = TemplateResolver.getTemplate(base);

        List<DetectedColor> colors =
                TextureAnalysisHelper.findDistinctColors(
                        oreTextureLoc,
                        template ,
                        50,
                        0.1f,
                        0.1f
                );

        // Generate Reed Item Texture
        NativeImage generatedItem =
                ReedItemTextureGenerator.generateReedItemTexture(
                        TemplateResolver.getReedTemplate(base),
                        new ResourceLocation(
                                "growores",
                                "textures/item/templates/reed_item_overlay.png"
                        ),
                        colors
                );
        ResourceLocation generatedItemTexture =
                OreReedData.itemTexture(targetRegName);

        File itemOut =
                GeneratedResourcePaths.debugGeneratedResource(
                        "item/" + name + "_reed_item.png"
                );
        itemOut.getParentFile().mkdirs();

        generatedItem.writeToFile(itemOut);
        registerTexture(generatedItemTexture, generatedItem);

        System.out.println(
                "Generated reed item texture: "
                        + itemOut.getName()
        );

        return true;
    }

    private static void registerTexture(ResourceLocation location, NativeImage image) {
        Minecraft.getInstance()
                .getTextureManager()
                .register(location, new DynamicTexture(image));
    }
}
