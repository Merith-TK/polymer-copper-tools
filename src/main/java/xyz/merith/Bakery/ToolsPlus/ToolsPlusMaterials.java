package xyz.merith.Bakery.ToolsPlus;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;


public enum ToolsPlusMaterials implements ToolMaterial {
    // Reference for Values: net/minecraft/item/ToolMaterials.java

    AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 250, 8.0F, 2.0F, 32, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 190, 9F, 1.5F, 10, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1796, 8.5F, 3.5F, 15, () -> Ingredient.ofItems(Items.EMERALD));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ToolsPlusMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
