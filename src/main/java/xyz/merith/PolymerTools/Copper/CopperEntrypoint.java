package xyz.merith.PolymerTools.Copper;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.merith.PolymerTools.Copper.Tools.*;
import xyz.merith.PolymerTools.PolytoolsMaterials;

public class CopperEntrypoint {
    public CopperEntrypoint() {
        Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_axe"),
                new CopperAxe(
                        Items.IRON_AXE,
                        PolytoolsMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(AxeItem.createAttributeModifiers(PolytoolsMaterials.COPPER, 6.5F, -3.15F))));
        Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_hoe"),
                new CopperHoe(
                        Items.IRON_HOE,
                        PolytoolsMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(HoeItem.createAttributeModifiers(PolytoolsMaterials.COPPER, -1.5F, -2.5F))));
        Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_pickaxe"),
                new CopperPickaxe(
                        Items.IRON_PICKAXE,
                        PolytoolsMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(PickaxeItem.createAttributeModifiers(PolytoolsMaterials.COPPER, 1.0F, -2.8F))));
        Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_shovel"),
                new CopperShovel(
                        Items.IRON_SHOVEL,
                        PolytoolsMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(ShovelItem.createAttributeModifiers(PolytoolsMaterials.COPPER, 1.5F, -3.0F))));
        Registry.register(Registries.ITEM, Identifier.of("polytools", "copper_sword"),
                new CopperSword(
                        Items.IRON_SWORD,
                        PolytoolsMaterials.COPPER,
                        new Item.Settings()
                                .attributeModifiers(SwordItem.createAttributeModifiers(PolytoolsMaterials.COPPER, 3, -2.4F))));
    }
}