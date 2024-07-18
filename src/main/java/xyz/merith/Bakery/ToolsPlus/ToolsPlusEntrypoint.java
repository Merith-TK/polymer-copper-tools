package xyz.merith.Bakery.ToolsPlus;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.merith.Bakery.ToolsPlus.Amethyst.AmethystEntrypoint;
import xyz.merith.Bakery.ToolsPlus.Copper.CopperEntrypoint;
import xyz.merith.Bakery.ToolsPlus.Emerald.EmeraldEntrypoint;


public class ToolsPlusEntrypoint implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("bakery-toolsplus");


	// TODO: Copper Armor
	// TODO: Hoe Tools
	// TODO: Test Blocks


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Polymer Tools");


		// TODO: Register this as a config file
		// Register Tools
		new AmethystEntrypoint();
		new CopperEntrypoint();
		new EmeraldEntrypoint();


		PolymerResourcePackUtils.addModAssets("bakery-toolsplus");
		LOGGER.info("Done");
	}
}