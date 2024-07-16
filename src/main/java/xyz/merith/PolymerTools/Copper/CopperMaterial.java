package xyz.merith.PolymerTools.Copper;

import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class CopperMaterial implements ToolMaterial {

    @Override
    public int getDurability() { return 190;        }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5;
    }

    @Override
    public float getAttackDamage() {
        return 2;
    }

        @Override
        public TagKey<Block> getInverseTag() {
            return BlockTags.INCORRECT_FOR_IRON_TOOL;
        }

        @Override
        public int getEnchantability() {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
        }

        @Override
        public ToolComponent createComponent(TagKey<Block> tag) {
            return net.minecraft.item.ToolMaterial.super.createComponent(tag);
        }
    public static final CopperMaterial INSTANCE = new CopperMaterial();
}