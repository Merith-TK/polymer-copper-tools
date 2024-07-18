package xyz.merith.Bakery.ToolsPlus.Copper;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.Bakery.ToolsPlus.Helpers.MaterialsFactory;
import xyz.merith.Bakery.ToolsPlus.Helpers.RegisterTools;


public class CopperEntrypoint {
    public ToolMaterial MATERIAL = MaterialsFactory.Generate(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            190,
            9F,
            1.5F,
            10,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)
    );
    public CopperEntrypoint() {
        new RegisterTools("copper", MATERIAL);
    }
}