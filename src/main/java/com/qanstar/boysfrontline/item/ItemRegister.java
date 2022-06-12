package com.qanstar.boysfrontline.item;

import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackArmorMaterial;
import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackDogArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;

public class ItemRegister {
    public static final Item BLACKDOG_HELMET = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.HEAD, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_CHESTPLATE = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.CHEST, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_LEGGINGS = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.LEGS, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_BOOTS = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.FEET, (new Item.Settings().group(BLACK_GROUP)));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_helmet"), BLACKDOG_HELMET);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_chestplate"), BLACKDOG_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_leggings"), BLACKDOG_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_boots"), BLACKDOG_BOOTS);

    }
}
