package com.qanstar.boysfrontline.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackDogArmor extends ArmorItem  {

    public BlackDogArmor(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    public static final Logger LOGGER = LoggerFactory.getLogger("boysfrontline");

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity player, int slot, boolean selected) {
        LOGGER.info("Hello Fabric world!" + stack.getDamage());
        if (player instanceof PlayerEntity) {
            ((PlayerEntity) player).heal(1f);
        }
    }

    public void onArmorTick(ItemStack stack, World world, Entity player) {

    }


}
