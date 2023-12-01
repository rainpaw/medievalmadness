package net.rainpaw10.medievalmadness;

import net.fabricmc.api.ModInitializer;

import net.rainpaw10.medievalmadness.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MedievalMadness implements ModInitializer {
	public static final String MOD_ID = "medievalmadness";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("[" + MOD_ID + "]: Mod is initialized!");

		ModItems.registerModItems();
	}
}