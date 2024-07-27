package xyz.merith.bakery.bakerstools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import xyz.merith.oven.Tools.ToolMaterialFactory;
import xyz.merith.oven.Tools.ToolFactory;

public class Emerald {
    public ToolMaterial TOOL_MATERIAL = ToolMaterialFactory.Generate(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1796,
            8.5F,
            3.5F,
            15,
            () -> Ingredient.ofItems(Items.EMERALD)
    );

    public ToolFactory.Tools EmeraldTools;
    public Emerald() {
        EmeraldTools = new ToolFactory().registerTools("bakers-tools","emerald", TOOL_MATERIAL);
    }
}