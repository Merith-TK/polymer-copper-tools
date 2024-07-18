package xyz.merith.Bakery.ToolsPlus.Amethyst;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.merith.Bakery.ToolsPlus.Amethyst.Tools.*;
import xyz.merith.Bakery.ToolsPlus.ToolsPlusMaterials;

public class AmethystEntrypoint {

    // TODO: Bake Mending into the equipment

    public AmethystEntrypoint() {
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "emerald_axe"),
                new Axe(
                        Items.IRON_AXE,
                        ToolsPlusMaterials.EMERALD,
                        new Item.Settings()
                                .attributeModifiers(AxeItem.createAttributeModifiers(ToolsPlusMaterials.EMERALD, 6.5F, -3.15F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "emerald_hoe"),
                new Hoe(
                        Items.IRON_HOE,
                        ToolsPlusMaterials.EMERALD,
                        new Item.Settings()
                                .attributeModifiers(HoeItem.createAttributeModifiers(ToolsPlusMaterials.EMERALD, -1.5F, -2.5F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "emerald_pickaxe"),
                new Pickaxe(
                        Items.IRON_PICKAXE,
                        ToolsPlusMaterials.EMERALD,
                        new Item.Settings()
                                .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolsPlusMaterials.EMERALD, 1.0F, -2.8F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "emerald_shovel"),
                new Shovel(
                        Items.IRON_SHOVEL,
                        ToolsPlusMaterials.EMERALD,
                        new Item.Settings()
                                .attributeModifiers(ShovelItem.createAttributeModifiers(ToolsPlusMaterials.EMERALD, 1.5F, -3.0F))));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", "emerald_sword"),
                new Sword(
                        Items.IRON_SWORD,
                        ToolsPlusMaterials.EMERALD,
                        new Item.Settings()
                                .attributeModifiers(SwordItem.createAttributeModifiers(ToolsPlusMaterials.EMERALD, 3, -2.4F))));
    }
}