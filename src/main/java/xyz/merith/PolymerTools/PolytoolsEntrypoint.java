package xyz.merith.PolymerTools;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.merith.PolymerTools.Copper.*;
import xyz.merith.PolymerTools.Copper.Tools.*;

public class PolytoolsEntrypoint implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("polytools");


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Polymer Tools");
		// Register Tools
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_axe"),
				new CopperAxe(	Items.IRON_AXE,		CopperMaterial.INSTANCE, new Item.Settings()));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_hoe"),
				new CopperHoe(	Items.IRON_HOE,		CopperMaterial.INSTANCE, new Item.Settings()));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_pickaxe"),
				new CopperPickaxe(Items.IRON_PICKAXE,	CopperMaterial.INSTANCE, new Item.Settings()));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_shovel"),
				new CopperShovel(	Items.IRON_SHOVEL,	CopperMaterial.INSTANCE, new Item.Settings()));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_sword"),
				new CopperSword(	Items.IRON_SWORD,	CopperMaterial.INSTANCE, new Item.Settings()));
		LOGGER.info("Done");
	}
}