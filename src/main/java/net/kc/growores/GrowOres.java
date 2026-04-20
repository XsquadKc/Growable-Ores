package net.kc.growores;

import net.fabricmc.api.ModInitializer;

import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModCreativeModeTabs;
import net.kc.growores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrowOres implements ModInitializer {
	public static final String MOD_ID = "growores";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}