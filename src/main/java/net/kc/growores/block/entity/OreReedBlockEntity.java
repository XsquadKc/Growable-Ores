package net.kc.growores.block.entity;

import net.kc.growores.dynamic.OreReedData;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class OreReedBlockEntity extends BlockEntity {
    private final CompoundTag reedData = new CompoundTag();

    public OreReedBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ORE_REED.get(), pos, state);
    }

    public CompoundTag getReedData() {
        return reedData;
    }

    public void setReedData(CompoundTag tag) {
        setReedData(tag, true);
    }

    private void setReedData(CompoundTag tag, boolean notify) {
        Set<String> keys = Set.copyOf(reedData.getAllKeys());
        keys.forEach(reedData::remove);

        if (tag != null) {
            copyString(tag, OreReedData.ORE);
            copyString(tag, OreReedData.BLOCK_TEXTURE);
            copyString(tag, OreReedData.ITEM_TEXTURE);
        }

        setChanged();

        if (notify && level != null) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }

    public ResourceLocation getBlockTexture() {
        return OreReedData.getBlockTexture(reedData);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        setReedData(tag, false);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        copyString(reedData, tag, OreReedData.ORE);
        copyString(reedData, tag, OreReedData.BLOCK_TEXTURE);
        copyString(reedData, tag, OreReedData.ITEM_TEXTURE);
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = super.getUpdateTag();
        saveAdditional(tag);
        return tag;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    private void copyString(CompoundTag source, String key) {
        copyString(source, reedData, key);
    }

    private static void copyString(CompoundTag source, CompoundTag target, String key) {
        if (source.contains(key, 8)) {
            target.putString(key, source.getString(key));
        }
    }
}
