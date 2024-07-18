package xyz.merith.Bakery.ToolsPlus.Helpers;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.merith.Bakery.ToolsPlus.Helpers.Tools.*;

public class RegisterTools {
    public RegisterTools(String basename, ToolMaterial material) {
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", basename+"_axe"),
                new Axe(
                        Items.IRON_AXE,
                        material,
                        new Item.Settings()
                                .attributeModifiers(AxeItem.createAttributeModifiers(material, 6.5F, -3.15F)),
                        basename+"_axe"));

        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", basename+"_hoe"),
                new Hoe(
                        Items.IRON_HOE,
                        material,
                        new Item.Settings()
                                .attributeModifiers(HoeItem.createAttributeModifiers(material, -1.5F, -2.5F)),
                        basename+"_hoe"));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", basename+"_pickaxe"),
                new Pickaxe(
                        Items.IRON_PICKAXE,
                        material,
                        new Item.Settings()
                                .attributeModifiers(PickaxeItem.createAttributeModifiers(material, 1.0F, -2.8F)),
                        basename+"_pickaxe"));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", basename+"_shovel"),
                new Shovel(
                        Items.IRON_SHOVEL,
                        material,
                        new Item.Settings()
                                .attributeModifiers(ShovelItem.createAttributeModifiers(material, 1.5F, -3.0F)),
                        basename+"_shovel"));
        Registry.register(Registries.ITEM, Identifier.of("bakery-toolsplus", basename+"_sword"),
                new Sword(
                        Items.IRON_SWORD,
                        material,
                        new Item.Settings()
                                .attributeModifiers(SwordItem.createAttributeModifiers(material, 3, -2.4F)),
                        basename+"_sword"));
    }
}