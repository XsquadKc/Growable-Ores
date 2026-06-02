package net.kc.growores.dynamic;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TextureAnalysisHelper {

    public static List<DetectedColor> findDistinctColors(
            ResourceLocation targetTexture,
            ResourceLocation templateTexture,
            double minimumDifference,
            float minumumSaturation,
            float minumumSatDiff
    ) {

        Map<Integer, DetectedColor> detected = new HashMap<>();

        try {

            NativeImage target = loadTexture(targetTexture);
            NativeImage template = loadTexture(templateTexture);

            int width = Math.min(target.getWidth(), template.getWidth());
            int height = Math.min(target.getHeight(), template.getHeight());

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    int targetPixel = target.getPixelRGBA(x, y);
                    int templatePixel = template.getPixelRGBA(x, y);

                    int ta = (targetPixel >> 24) & 0xFF;

                    if (ta <= 10) {
                        continue;
                    }

                    int tr = targetPixel & 0xFF;
                    int tg = (targetPixel >> 8) & 0xFF;
                    int tb = (targetPixel >> 16) & 0xFF;

                    int sr = templatePixel & 0xFF;
                    int sg = (templatePixel >> 8) & 0xFF;
                    int sb = (templatePixel >> 16) & 0xFF;

                    double distance = colorDistance(
                            tr, tg, tb,
                            sr, sg, sb
                    );

                    // Ignore tiny differences
                    if (distance < minimumDifference) {
                        continue;
                    }

                    float satTarget = saturation(tr, tg, tb);
                    float satTemplate = saturation(sr, sg, sb);

                    float satDiff = satTarget - satTemplate;

                    if (satTarget < minumumSaturation && satDiff < minumumSatDiff) {
                        continue;
                    }

                    DetectedColor entry =
                            detected.computeIfAbsent(
                                    targetPixel,
                                    DetectedColor::new
                            );

                    entry.add(distance);
                }
            }

            target.close();
            template.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return detected.values()
                .stream()
                .sorted((a, b) -> Double.compare(
                        b.getScore(),
                        a.getScore()
                ))
                .toList();
    }

    public static NativeImage loadTexture(ResourceLocation location) throws Exception {

        Optional<Resource> optional = Minecraft.getInstance()
                .getResourceManager()
                .getResource(location);

        if (optional.isEmpty()) {
            throw new RuntimeException("Missing texture: " + location);
        }

        Resource resource = optional.get();

        try (InputStream stream = resource.open()) {
            return NativeImage.read(stream);
        }
    }

    private static float saturation(int r, int g, int b) {

        int max = Math.max(r, Math.max(g, b));
        int min = Math.min(r, Math.min(g, b));

        if (max == 0) {
            return 0;
        }

        return (max - min) / (float) max;
    }

    private static double colorDistance(
            int r1, int g1, int b1,
            int r2, int g2, int b2
    ) {

        int dr = r1 - r2;
        int dg = g1 - g2;
        int db = b1 - b2;

        return Math.sqrt(
                dr * dr +
                        dg * dg +
                        db * db
        );
    }

    /**
     * Converts ABGR integer into readable RGBA string.
     */
    public static String colorToString(int abgr) {

        int a = (abgr >> 24) & 0xFF;
        int b = (abgr >> 16) & 0xFF;
        int g = (abgr >> 8) & 0xFF;
        int r = abgr & 0xFF;

        return String.format(
                "R:%d G:%d B:%d A:%d HEX:#%02X%02X%02X",
                r, g, b, a, r, g, b
        );
    }
}

