package net.kc.growores.dynamic;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReedItemTextureGenerator {

    public static NativeImage generateReedItemTexture(
            ResourceLocation baseTexture,
            ResourceLocation overlayTexture,
            List<DetectedColor> detectedColors
    ) {

        try {

            NativeImage base = loadTexture(baseTexture);
            NativeImage overlay = loadTexture(overlayTexture);

            int width = base.getWidth();
            int height = base.getHeight();

            NativeImage output = new NativeImage(width, height, true);

            // Copy base texture first
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    output.setPixelRGBA(
                            x,
                            y,
                            base.getPixelRGBA(x, y)
                    );
                }
            }

            // Build 8-colour palette
            List<Integer> palette =
                    buildPalette(detectedColors);

            // Apply overlay
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    int overlayPixel =
                            overlay.getPixelRGBA(x, y);

                    int alpha =
                            (overlayPixel >> 24) & 0xFF;

                    if (alpha <= 10) {
                        continue;
                    }

                    int b =
                            (overlayPixel >> 16) & 0xFF;

                    int g =
                            (overlayPixel >> 8) & 0xFF;

                    int r =
                            overlayPixel & 0xFF;

                    // Overlay is grayscale
                    int brightness = (r + g + b) / 3;

                    int shadeIndex =
                            7 - (brightness * 7 / 255);

                    shadeIndex =
                            Math.max(0,
                                    Math.min(7, shadeIndex));

                    int color =
                            palette.get(shadeIndex);

                    output.setPixelRGBA(x, y, color);
                }
            }

            base.close();
            overlay.close();

            return output;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Integer> buildPalette(
            List<DetectedColor> colors
    ) {

        List<Integer> palette = new ArrayList<>();

        if (colors.isEmpty()) {

            for (int i = 0; i < 8; i++) {
                palette.add(toABGR(255, 255, 255, 255));
            }

            return palette;
        }

        int uniqueCount =
                Math.min(colors.size(), 8);

        for (int i = 0; i < 8; i++) {

            int mapped =
                    (i * uniqueCount) / 8;

            mapped =
                    Math.min(mapped,
                            uniqueCount - 1);

            palette.add(
                    colors.get(mapped).getColor()
            );
        }

        return palette;
    }

    private static NativeImage loadTexture(
            ResourceLocation location
    ) throws Exception {

        Optional<Resource> optional =
                Minecraft.getInstance()
                        .getResourceManager()
                        .getResource(location);

        if (optional.isEmpty()) {
            throw new RuntimeException(
                    "Missing texture: " + location
            );
        }

        try (InputStream stream =
                     optional.get().open()) {

            return NativeImage.read(stream);
        }
    }

    private static int toABGR(
            int r,
            int g,
            int b,
            int a
    ) {

        return ((a & 255) << 24) |
                ((b & 255) << 16) |
                ((g & 255) << 8) |
                (r & 255);
    }
}