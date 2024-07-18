package xyz.merith.Bakery.ToolsPlus.Amethyst;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.Bakery.ToolsPlus.Helpers.MaterialsFactory;
import xyz.merith.Bakery.ToolsPlus.Helpers.RegisterTools;

public class AmethystEntrypoint {

    public ToolMaterial MATERIAL = MaterialsFactory.Generate(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            250,
            8F,
            2F,
            32,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD)
    );

    // TODO: Bake Mending into the equipment
    public AmethystEntrypoint() {
        new RegisterTools("amethyst", MATERIAL);
   }
}