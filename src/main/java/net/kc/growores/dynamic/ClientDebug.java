package net.kc.growores.dynamic;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.File;
import java.util.List;

import static net.kc.growores.dynamic.TextureAnalysisHelper.loadTexture;

public class ClientDebug {

    public static void testOre() throws Exception {

        OreTextureGenerationManager.generateAll();

//        Block target = Blocks.DEEPSLATE_COPPER_ORE;
//
//        ResourceLocation targetRegName = ForgeRegistries.BLOCKS.getKey(target.defaultBlockState().getBlock());
//        ResourceLocation targetTexture = new ResourceLocation(
//                targetRegName.getNamespace(), "textures/block/" + targetRegName.getPath() + ".png");
//
//
//        // Find Ore Colours
//        TemplateResolver.BaseType base = TemplateResolver.resolve(target);
//        ResourceLocation template = TemplateResolver.getTemplate(base);
//
//        List<DetectedColor> colors =
//                TextureAnalysisHelper.findDistinctColors(
//                        targetTexture,
//                        template ,
//                        50,
//                        0.1f,
//                        0.1f
//                );
//
//        // Generate Reed Item Texture
//        NativeImage generatedItem =
//                ReedItemTextureGenerator.generateReedItemTexture(
//                        TemplateResolver.getReedTemplate(base),
//                        new ResourceLocation(
//                                "growores",
//                                "textures/item/templates/reed_item_overlay.png"
//                        ),
//                        colors
//                );
//        generatedItem.writeToFile(
//                new File("generated_"+targetRegName.getPath()+"_reed_item.png")
//        );

//        // Generate Reed Block Texture
//        ResourceLocation mask =
//                new ResourceLocation("growores",
//                        "textures/block/template/reed_mask.png");
//
//        NativeImage generatedBlock =
//                ReedBlockTextureGenerator.applyMask(loadTexture(targetTexture), mask);
//        generatedBlock.writeToFile(new File("generated_"+targetRegName.getPath()+"_reed.png"));
//
    }
}