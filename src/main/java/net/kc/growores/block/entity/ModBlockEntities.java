package net.kc.growores.block.entity;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GrowOres.MOD_ID);

    public static final RegistryObject<BlockEntityType<OreReedBlockEntity>> ORE_REED =
            BLOCK_ENTITIES.register(
                    "ore_reed",
                    () -> BlockEntityType.Builder
                            .of(OreReedBlockEntity::new, ModBlocks.ORE_REED.get())
                            .build(null)
            );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
