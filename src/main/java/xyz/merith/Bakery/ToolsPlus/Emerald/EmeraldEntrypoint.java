package xyz.merith.Bakery.ToolsPlus.Emerald;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.Bakery.ToolsPlus.Helpers.MaterialsFactory;
import xyz.merith.Bakery.ToolsPlus.Helpers.RegisterTools;

public class EmeraldEntrypoint {
    public ToolMaterial MATERIAL = MaterialsFactory.Generate(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1796,
            8.5F,
            3.5F,
            15,
            () -> Ingredient.ofItems(Items.EMERALD)
    );

    // TODO: Bake Fortune 2 into all tools, except sword, sword gets looting 2
    public EmeraldEntrypoint() {
        new RegisterTools("emerald", MATERIAL);
    }
}