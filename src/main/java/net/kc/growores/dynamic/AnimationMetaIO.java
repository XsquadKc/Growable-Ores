package net.kc.growores.dynamic;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;

import java.io.InputStream;
import java.util.Optional;

public class AnimationMetaIO {

    public static String loadMcmeta(ResourceLocation texture) {

        try {

            ResourceLocation mcmeta =
                    new ResourceLocation(
                            texture.getNamespace(),
                            texture.getPath() + ".mcmeta"
                    );

            Optional<Resource> resource =
                    Minecraft.getInstance()
                            .getResourceManager()
                            .getResource(mcmeta);

            if (resource.isEmpty()) {
                return null;
            }

            try (InputStream stream =
                         resource.get().open()) {

                return new String(stream.readAllBytes());
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}