package xyz.merith.Bakery.ToolsPlus.Copper;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.merith.Bakery.ToolsPlus.Copper.Tools.*;
import xyz.merith.Bakery.ToolsPlus.ToolsPlusMaterials;

public class CopperEntrypoint {
    public CopperEntrypoint() {
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "copper_axe"),
                new Axe(
                        Items.IRON_AXE,
                        ToolsPlusMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(AxeItem.createAttributeModifiers(ToolsPlusMaterials.COPPER, 6.5F, -3.15F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "copper_hoe"),
                new Hoe(
                        Items.IRON_HOE,
                        ToolsPlusMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(HoeItem.createAttributeModifiers(ToolsPlusMaterials.COPPER, -1.5F, -2.5F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "copper_pickaxe"),
                new Pickaxe(
                        Items.IRON_PICKAXE,
                        ToolsPlusMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolsPlusMaterials.COPPER, 1.0F, -2.8F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "copper_shovel"),
                new Shovel(
                        Items.IRON_SHOVEL,
                        ToolsPlusMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(ShovelItem.createAttributeModifiers(ToolsPlusMaterials.COPPER, 1.5F, -3.0F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "copper_sword"),
                new Sword(
                        Items.IRON_SWORD,
                        ToolsPlusMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(SwordItem.createAttributeModifiers(ToolsPlusMaterials.COPPER, 3, -2.4F))));
    }
}