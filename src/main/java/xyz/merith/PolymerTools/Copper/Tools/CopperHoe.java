package xyz.merith.PolymerTools.Copper.Tools;

import eu.pb4.polymer.core.api.item.PolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class CopperHoe extends HoeItem implements PolymerItem {
    private final PolymerModelData model;

    public CopperHoe(Item polymerItem, ToolMaterial material, Settings settings) {
        super(material, settings);
        this.model = PolymerResourcePackUtils.requestModel(polymerItem, Identifier.of("polytools", "item/copper_hoe"));
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