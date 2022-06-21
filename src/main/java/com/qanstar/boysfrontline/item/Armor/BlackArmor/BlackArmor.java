package com.qanstar.boysfrontline.item.Armor.BlackArmor;

import com.qanstar.boysfrontline.item.ItemRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class BlackArmor extends ArmorItem {
    private static final Set<String> damageNegations = new HashSet<>();
    public BlackArmor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        super(material, slot, settings);
        damageNegations.add(DamageSource.FALL.name);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    }


}
