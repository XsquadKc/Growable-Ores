package net.kc.growores;

import net.fabricmc.api.ModInitializer;

import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModCreativeModeTabs;
import net.kc.growores.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.kc.growores.item.ModCreativeModeTabs.GROWORES_TAB;
import static net.kc.growores.item.ModCreativeModeTabs.GROWORES_TAB_KEY;

public class GrowOres implements ModInitializer {
	public static final String MOD_ID = "growores";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModCreativeModeTabs.registerItemGroups();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, GROWORES_TAB_KEY, GROWORES_TAB);
	}

}