package net.kc.growores.dynamic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class OreTextureResolver {

    public static ResourceLocation getTexture(Block block) {
        ResourceLocation inferredTexture = inferBlockTexture(block);

        if (resourceExists(inferredTexture)) {
            return inferredTexture;
        }

        BlockRenderDispatcher dispatcher =
                Minecraft.getInstance().getBlockRenderer();

        BlockState state = block.defaultBlockState();

        BakedModel model =
                dispatcher.getBlockModelShaper()
                        .getBlockModel(state);

        if (model == null) {

            System.out.println(
                    "Skipping null model: "
                            + block
            );

            return null;
        }

        TextureAtlasSprite sprite =
                model.getParticleIcon();

        if (sprite == null) {

            System.out.println(
                    "Skipping null particle icon: "
                            + block
            );

            return null;
        }

        ResourceLocation spriteName = sprite.contents().name();

        if (MissingTextureAtlasSprite.getLocation().equals(spriteName)) {
            System.out.println(
                    "Skipping missing texture sprite: "
                            + block
            );

            return null;
        }

        ResourceLocation spriteTexture = textureResource(spriteName);

        if (resourceExists(spriteTexture)) {
            return spriteTexture;
        }

        System.out.println(
                "Skipping missing texture resource: "
                        + spriteTexture
                        + " for "
                        + block
        );

        return null;
    }

    private static ResourceLocation textureResource(ResourceLocation sprite) {
        return new ResourceLocation(
                sprite.getNamespace(),
                "textures/" + sprite.getPath() + ".png"
        );
    }

    private static ResourceLocation inferBlockTexture(Block block) {
        ResourceLocation blockId = ForgeRegistries.BLOCKS.getKey(block);

        if (blockId == null) {
            return null;
        }

        return new ResourceLocation(
                blockId.getNamespace(),
                "textures/block/" + blockId.getPath() + ".png"
        );
    }

    private static boolean resourceExists(ResourceLocation location) {
        if (location == null) {
            return false;
        }

        ResourceManager resourceManager =
                Minecraft.getInstance()
                        .getResourceManager();

        return resourceManager
                .getResource(location)
                .isPresent();
    }
}
