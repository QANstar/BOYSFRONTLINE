package com.qanstar.boysfrontline.item.Armor.BlackArmor;

import com.qanstar.boysfrontline.item.ItemRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class BlackDogArmor extends ArmorItem  {
    public static final Logger LOGGER = LoggerFactory.getLogger("boysfrontline");
    private static final Set<String> damageNegations = new HashSet<>();
    public BlackDogArmor(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
        damageNegations.add(DamageSource.FALL.name);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player =  (PlayerEntity) entity;
            if(hasArmorSet(player)){
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,1,3));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,1,3));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,1,3));
                if(player.getHealth()<4f){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,2,1));
                }
            }
        }
    }
    // 检测去全部装备
    public boolean hasArmorSet(PlayerEntity player) {
        return hasArmorSetItem(player, EquipmentSlot.HEAD) && hasArmorSetItem(player, EquipmentSlot.CHEST) && hasArmorSetItem(player, EquipmentSlot.LEGS) && hasArmorSetItem(player, EquipmentSlot.FEET);
    }
    // 检测盔甲装备情况
    public boolean hasArmorSetItem(PlayerEntity player, EquipmentSlot slot) {
        if (player == null || player.getInventory() == null || player.getInventory().armor == null) {
            return false;
        }

        ItemStack stack = player.getEquippedStack(slot);
        if (stack.isEmpty()) {
            return false;
        }

        return switch (slot) {
            case HEAD -> stack.isOf(ItemRegister.BLACKDOG_HELMET);
            case CHEST -> stack.isOf(ItemRegister.BLACKDOG_CHESTPLATE);
            case LEGS -> stack.isOf(ItemRegister.BLACKDOG_LEGGINGS);
            case FEET -> stack.isOf(ItemRegister.BLACKDOG_BOOTS);
            default -> false;
        };

    }


}
