package net.kc.growores.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kc.growores.block.entity.OreReedBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class DynamicOreReedBlockRenderer implements BlockEntityRenderer<OreReedBlockEntity> {
    public DynamicOreReedBlockRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(
            OreReedBlockEntity blockEntity,
            float partialTick,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            int packedOverlay
    ) {
        DynamicOreReedRenderer.renderCross(
                blockEntity.getBlockTexture(),
                poseStack,
                buffer,
                packedLight,
                packedOverlay
        );
    }
}
