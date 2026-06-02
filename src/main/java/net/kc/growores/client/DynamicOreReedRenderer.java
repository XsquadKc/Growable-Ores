package net.kc.growores.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public final class DynamicOreReedRenderer {
    private DynamicOreReedRenderer() {
    }

    public static void renderCross(
            ResourceLocation texture,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            int packedOverlay
    ) {
        VertexConsumer consumer =
                buffer.getBuffer(RenderType.entityCutoutNoCull(texture));

        PoseStack.Pose pose = poseStack.last();

        renderQuad(
                pose,
                consumer,
                0.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 1.0F,
                1.0F, 1.0F, 1.0F,
                0.0F, 1.0F, 0.0F,
                packedLight,
                packedOverlay
        );
        renderQuad(
                pose,
                consumer,
                1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 1.0F,
                0.0F, 1.0F, 1.0F,
                1.0F, 1.0F, 0.0F,
                packedLight,
                packedOverlay
        );
    }

    public static void renderFlatItem(
            ResourceLocation texture,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            int packedOverlay
    ) {
        VertexConsumer consumer =
                buffer.getBuffer(RenderType.entityCutoutNoCull(texture));

        renderQuad(
                poseStack.last(),
                consumer,
                0.0F, 0.0F, 0.5F,
                1.0F, 0.0F, 0.5F,
                1.0F, 1.0F, 0.5F,
                0.0F, 1.0F, 0.5F,
                packedLight == 0 ? LightTexture.FULL_BRIGHT : packedLight,
                packedOverlay
        );
    }

    private static void renderQuad(
            PoseStack.Pose pose,
            VertexConsumer consumer,
            float x1,
            float y1,
            float z1,
            float x2,
            float y2,
            float z2,
            float x3,
            float y3,
            float z3,
            float x4,
            float y4,
            float z4,
            int packedLight,
            int packedOverlay
    ) {
        vertex(pose, consumer, x1, y1, z1, 0.0F, 1.0F, packedLight, packedOverlay);
        vertex(pose, consumer, x2, y2, z2, 1.0F, 1.0F, packedLight, packedOverlay);
        vertex(pose, consumer, x3, y3, z3, 1.0F, 0.0F, packedLight, packedOverlay);
        vertex(pose, consumer, x4, y4, z4, 0.0F, 0.0F, packedLight, packedOverlay);
    }

    private static void vertex(
            PoseStack.Pose pose,
            VertexConsumer consumer,
            float x,
            float y,
            float z,
            float u,
            float v,
            int packedLight,
            int packedOverlay
    ) {
        consumer.vertex(pose.pose(), x, y, z)
                .color(255, 255, 255, 255)
                .uv(u, v)
                .overlayCoords(packedOverlay)
                .uv2(packedLight)
                .normal(pose.normal(), 0.0F, 1.0F, 0.0F)
                .endVertex();
    }
}
