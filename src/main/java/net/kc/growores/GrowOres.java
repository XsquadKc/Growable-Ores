package net.kc.growores;

import com.mojang.logging.LogUtils;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.block.entity.ModBlockEntities;
import net.kc.growores.client.DynamicOreReedBlockRenderer;
import net.kc.growores.dynamic.ClientDebug;
import net.kc.growores.dynamic.OreReedRecipeGenerator;
import net.kc.growores.dynamic.OreTextureGenerationManager;
import net.kc.growores.item.ModCreativeModeTabs;
import net.kc.growores.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.resource.PathPackResources;
import org.slf4j.Logger;

import java.nio.file.Path;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(net.kc.growores.GrowOres.MOD_ID)
public class GrowOres {
    public static final String MOD_ID = "growores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public GrowOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addGeneratedRecipePack);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    private void addGeneratedRecipePack(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.SERVER_DATA) {
            return;
        }

        event.addRepositorySource(packConsumer -> {
            Path packRoot = OreReedRecipeGenerator.generateDataPack();
            Pack pack = Pack.readMetaAndCreate(
                    MOD_ID + ":generated_reeds",
                    Component.literal("Growable Ores Generated Reeds"),
                    true,
                    id -> new PathPackResources(id, true, packRoot),
                    PackType.SERVER_DATA,
                    Pack.Position.TOP,
                    PackSource.BUILT_IN
            );

            if (pack != null) {
                packConsumer.accept(pack);
            } else {
                LOGGER.warn("Could not load generated reed recipe pack at {}", packRoot);
            }
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        private static boolean generatedOreTextures;

        @SubscribeEvent
        public static void onModelBakingCompleted(ModelEvent.BakingCompleted event) {
            if (generatedOreTextures) {
                return;
            }

            generatedOreTextures = true;
            OreTextureGenerationManager.generateAll();

        }

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(
                    ModBlockEntities.ORE_REED.get(),
                    DynamicOreReedBlockRenderer::new
            );
        }
    }
}
