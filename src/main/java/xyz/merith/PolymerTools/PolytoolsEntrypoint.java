package xyz.merith.PolymerTools;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
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


	// TODO: Copper Armor
	// TODO: Emerald Tools
	// TODO: Test Blocks


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Polymer Tools");

		// Register Tools
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_axe"),
				new CopperAxe(
						Items.IRON_AXE,
						PolyToolMaterials.COPPER,
						new Item.Settings()
								.attributeModifiers(AxeItem.createAttributeModifiers(PolyToolMaterials.COPPER, 6.5F, -3.15F))));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_hoe"),
				new CopperHoe(
						Items.IRON_HOE,
						PolyToolMaterials.COPPER,
						new Item.Settings()
								.attributeModifiers(HoeItem.createAttributeModifiers(PolyToolMaterials.COPPER, -1.5F, -2.5F))));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_pickaxe"),
				new CopperPickaxe(
						Items.IRON_PICKAXE,
						PolyToolMaterials.COPPER,
						new Item.Settings()
								.attributeModifiers(PickaxeItem.createAttributeModifiers(PolyToolMaterials.COPPER, 1.0F, -2.8F))));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_shovel"),
				new CopperShovel(
						Items.IRON_SHOVEL,
						PolyToolMaterials.COPPER,
						new Item.Settings()
								.attributeModifiers(ShovelItem.createAttributeModifiers(PolyToolMaterials.COPPER, 1.5F, -3.0F))));
		Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_sword"),
				new CopperSword(
						Items.IRON_SWORD,
						PolyToolMaterials.COPPER,
						new Item.Settings()
								.attributeModifiers(SwordItem.createAttributeModifiers(PolyToolMaterials.COPPER, 3, -2.4F))));
		PolymerResourcePackUtils.addModAssets("polytools");
		LOGGER.info("Done");
	}
}