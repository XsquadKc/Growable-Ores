package net.kc.growores.dynamic;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;

import java.io.InputStream;
import java.util.Optional;

public class ReedBlockTextureGenerator {

    public static NativeImage applyMask(
            NativeImage oreTexture,
            ResourceLocation maskLocation
    ) {

        try {

            NativeImage mask = load(maskLocation);

            int width = oreTexture.getWidth();
            int height = oreTexture.getHeight();
            int maskHeight= mask.getHeight();

            NativeImage output = new NativeImage(width, height,true);

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    int orePixel = oreTexture.getPixelRGBA(x, y);
                    int maskPixel = mask.getPixelRGBA(x, y % maskHeight);

                    // mask alpha determines visibility
                    int maskAlpha = (maskPixel >> 24) & 0xFF;

                    if (maskAlpha == 0) {
                        // fully transparent in mask → cut pixel
                        output.setPixelRGBA(x, y, 0);
                        continue;
                    }

                    // otherwise keep ore pixel
                    output.setPixelRGBA(x, y, orePixel);
                }
            }

            mask.close();

            return output;

        } catch (Exception e) {
            throw new RuntimeException("Failed applying reed mask", e);
        }
    }

    private static NativeImage load(ResourceLocation loc) throws Exception {

        Optional<Resource> resource =
                Minecraft.getInstance()
                        .getResourceManager()
                        .getResource(loc);

        if (resource.isEmpty()) {
            throw new RuntimeException("Missing texture: " + loc);
        }

        try (InputStream stream = resource.get().open()) {
            return NativeImage.read(stream);
        }
    }
}