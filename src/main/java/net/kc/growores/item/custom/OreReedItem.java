package net.kc.growores.item.custom;

import net.kc.growores.dynamic.OreReedData;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class OreReedItem extends BlockItem {

    public OreReedItem(Block pBlock, Item.Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void verifyTagAfterLoad(CompoundTag tag) {
        super.verifyTagAfterLoad(tag);

        if (tag.contains(OreReedData.ORE, 8)) {
            CompoundTag blockEntityTag = tag.getCompound(BLOCK_ENTITY_TAG);
            copyString(tag, blockEntityTag, OreReedData.ORE);
            copyString(tag, blockEntityTag, OreReedData.BLOCK_TEXTURE);
            copyString(tag, blockEntityTag, OreReedData.ITEM_TEXTURE);
            tag.put(BLOCK_ENTITY_TAG, blockEntityTag);
        }
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer renderer =
                    new net.kc.growores.client.DynamicOreReedItemRenderer(
                            net.minecraft.client.Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                            net.minecraft.client.Minecraft.getInstance().getEntityModels()
                    );

            @Override
            public net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }

    public static CompoundTag getReedData(ItemStack stack) {
        CompoundTag tag = stack.getTag();

        if (tag == null) {
            return new CompoundTag();
        }

        return tag;
    }

    @Override
    public Component getName(ItemStack stack) {
        CompoundTag tag = stack.getTag();

        if (tag != null && tag.contains(OreReedData.ORE, 8)) {
            ResourceLocation oreId =
                    ResourceLocation.tryParse(tag.getString(OreReedData.ORE));

            if (oreId != null) {
                Block ore =
                        ForgeRegistries.BLOCKS.getValue(oreId);

                if (ore != null) {
                    return Component.translatable(
                            "item.growores.ore_reed_item.named",
                            ore.getName()
                    );
                }
            }
        }

        return super.getName(stack);
    }

    private static void copyString(CompoundTag source, CompoundTag target, String key) {
        if (source.contains(key, 8)) {
            target.putString(key, source.getString(key));
        }
    }
}
