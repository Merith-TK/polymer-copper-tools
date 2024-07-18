package xyz.merith.Bakery.ToolsPlus.Amethyst.Tools;

import eu.pb4.polymer.core.api.item.PolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class Axe extends AxeItem implements PolymerItem {
    private final PolymerModelData model;

    public Axe(Item polymerItem, ToolMaterial material, Settings settings) {
        super(material, settings);
        this.model = PolymerResourcePackUtils.requestModel(polymerItem, Identifier.of("bakery-toolsplus", "item/copper_axe"));
    }

    @Override
    public Item getPolymerItem(ItemStack stack, ServerPlayerEntity player) {
        return this.model.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return model.value();
    }
}