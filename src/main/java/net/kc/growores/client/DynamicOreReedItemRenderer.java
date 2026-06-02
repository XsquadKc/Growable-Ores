package net.kc.growores.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kc.growores.dynamic.OreReedData;
import net.kc.growores.item.custom.OreReedItem;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class DynamicOreReedItemRenderer extends BlockEntityWithoutLevelRenderer {
    public DynamicOreReedItemRenderer(
            BlockEntityRenderDispatcher blockEntityRenderDispatcher,
            EntityModelSet entityModelSet
    ) {
        super(blockEntityRenderDispatcher, entityModelSet);
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
    }

    @Override
    public void renderByItem(
            ItemStack stack,
            ItemDisplayContext displayContext,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            int packedOverlay
    ) {
        DynamicOreReedRenderer.renderFlatItem(
                OreReedData.getItemTexture(OreReedItem.getReedData(stack)),
                poseStack,
                buffer,
                packedLight,
                packedOverlay
        );
    }
}
