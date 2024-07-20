package xyz.merith.Bakery.BakersTools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.oven.Tools.ToolMaterialFactory;
import xyz.merith.oven.Tools.ToolFactory;

public class Amethyst {
    public ToolMaterial TOOL_MATERIAL = ToolMaterialFactory.Generate(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            250,
            8F,
            2F,
            32,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD)
    );

    // TODO: Bake Mending into the equipment
    public ToolFactory.Tools AmethystTools;
    public Amethyst() {
        AmethystTools = new ToolFactory().registerTools("bakers-tools","amethyst", TOOL_MATERIAL);
    }
}