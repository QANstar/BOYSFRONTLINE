package com.qanstar.boysfrontline;

import com.qanstar.boysfrontline.Armor.BlackArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;

public class RegisterItems {
    // mod书
    public static final Item ModBook = new Item(new Item.Settings().group(BLACK_GROUP));
    // 黑狗战甲
    public static final Item BLACKDOG_HELMET = new ArmorItem(new BlackArmorMaterial(), EquipmentSlot.HEAD, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_CHESTPLATE = new ArmorItem(new BlackArmorMaterial(), EquipmentSlot.CHEST, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_LEGGINGS = new ArmorItem(new BlackArmorMaterial(), EquipmentSlot.LEGS, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_BOOTS = new ArmorItem(new BlackArmorMaterial(), EquipmentSlot.FEET, (new Item.Settings().group(BLACK_GROUP)));
    public static void register() {
        Registry.register(Registry.ITEM,new Identifier("boysfrontline","mod_book"),ModBook);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_helmet"), BLACKDOG_HELMET);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_chestplate"), BLACKDOG_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_leggings"), BLACKDOG_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("boysfrontline", "blackdog_boots"), BLACKDOG_BOOTS);

    }
}
