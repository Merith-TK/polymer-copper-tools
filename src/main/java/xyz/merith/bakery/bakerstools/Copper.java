package xyz.merith.bakery.bakerstools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.oven.Tools.ToolMaterialFactory;
import xyz.merith.oven.Tools.ToolFactory;

public class Copper {
    public ToolMaterial TOOL_MATERIAL = ToolMaterialFactory.Generate(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            190,
            9F,
            1.5F,
            10,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)
    );

    public ToolFactory.Tools CopperTools;
    public Copper() {
        CopperTools = new ToolFactory().registerTools("bakers-tools","copper", TOOL_MATERIAL);
    }
}