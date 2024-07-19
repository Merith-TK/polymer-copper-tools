package xyz.merith.Bakery.BakersTools;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BakersToolsEntrypoint implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("bakers-tools");

	public static final Item BAKERSTOOLS_TOKEN = new SimplePolymerItem(new Item.Settings(), Items.EMERALD);

	public static RegistryKey<ItemGroup> BAKERSTOOLS_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("bakers-tools", "item_group"));
	public static ItemGroup BAKERSTOOLS_GROUP = FabricItemGroup.builder()
			.displayName(Text.literal("Bakery Tools"))
			.icon(() -> new ItemStack(BAKERSTOOLS_TOKEN))
			.build();
	// TODO: Copper ArmorMaterialFactory
	// TODO: Hoe ToolTemplates
	// TODO: Test Blocks


	@Override
	public void onInitialize() {
		LOGGER.info("Baking BakersTools");

		// Register Token Item
		Registry.register(Registries.ITEM, Identifier.of("bakers-tools", "token"), BAKERSTOOLS_TOKEN);

		PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of("bakers-tools:itemgroup"), BAKERSTOOLS_GROUP);

		// TODO: Register this as a config file
		// Register ToolTemplates
		new Amethyst();
		new Copper();
		new Emerald();

		PolymerResourcePackUtils.addModAssets("bakers-tools");
		LOGGER.info("Done");
	}
}