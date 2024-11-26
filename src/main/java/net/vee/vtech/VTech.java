package net.vee.vtech;

import net.fabricmc.api.ModInitializer;

import net.vee.vtech.item.ModItemGroups;
import net.vee.vtech.item.ModItems;
import net.vee.vtech.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VTech implements ModInitializer {
	public static final String MOD_ID = "vtech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModSounds.registerSounds();
	}
}