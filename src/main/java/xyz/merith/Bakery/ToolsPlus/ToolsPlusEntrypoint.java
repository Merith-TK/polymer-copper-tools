package xyz.merith.Bakery.ToolsPlus;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.merith.Bakery.ToolsPlus.Copper.CopperEntrypoint;


public class ToolsPlusEntrypoint implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("bakery-toolsplus");


	// TODO: Copper Armor
	// TODO: Emerald Tools
	// TODO: Test Blocks


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Polymer Tools");

		// Register Tools
		new CopperEntrypoint();

		PolymerResourcePackUtils.addModAssets("bakery-toolsplus");
		LOGGER.info("Done");
	}
}