package com.qanstar.boysfrontline.item.Armor.BlackDogArmor;

import com.qanstar.boysfrontline.item.ItemRegister;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BlackDogArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {400, 400, 400, 400};
    private static final int[] PROTECTION_VALUES = new int[] {10, 10, 10, 10};
    private final float toughness = 20;
    private final Ingredient repairIngredientSupplier = Ingredient.ofItems(ItemRegister.BLACK_ALLOY);
    private final int durabilityMultiplier = 200;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier;
    }

    @Override
    public String getName() {
        return "black_dog";
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.20F;
    }
}
