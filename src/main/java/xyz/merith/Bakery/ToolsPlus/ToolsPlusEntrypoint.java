package xyz.merith.Bakery.ToolsPlus;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
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

	public static final Item TOOLSPLUS_TOKEN = new SimplePolymerItem(new Item.Settings(), Items.EMERALD);

	public static final RegistryKey<ItemGroup> TOOLSPLUS_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("bakery-toolsplus", "item_group"));
	public static final ItemGroup TOOLSPLUS_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(TOOLSPLUS_TOKEN))
			.displayName(Text.translatable("bakery-toolsplus.itemgroup"))
			.build();
	// TODO: Copper Armor
	// TODO: Hoe Tools
	// TODO: Test Blocks


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Polymer Tools");

		// Register Token Item
		Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "token"), TOOLSPLUS_TOKEN);

		PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of("bakery-toolsplus:itemgroup"), TOOLSPLUS_GROUP);

		// TODO: Register this as a config file
		// Register Tools
		new AmethystEntrypoint();
		new CopperEntrypoint();
		new EmeraldEntrypoint();


		PolymerResourcePackUtils.addModAssets("bakery-toolsplus");
		LOGGER.info("Done");
	}
}