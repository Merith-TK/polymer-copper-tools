package xyz.merith.Bakery.BakersTools.Helpers.ToolTemplates;

import eu.pb4.polymer.core.api.item.PolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerModelData;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class Axe extends AxeItem implements PolymerItem {
    private final PolymerModelData model;

    // TODO: setup bool to not include texture
    public Axe(Item polymerItem, ToolMaterial material, Settings settings, String namepace, String toolName) {
        super(material, settings);
        this.model = PolymerResourcePackUtils.requestModel(polymerItem, Identifier.of(namepace, "item/" + toolName));
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