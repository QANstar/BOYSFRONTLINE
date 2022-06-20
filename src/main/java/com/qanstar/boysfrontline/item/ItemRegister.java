package com.qanstar.boysfrontline.item;

import com.qanstar.boysfrontline.BoysFrontline;
import com.qanstar.boysfrontline.Register;
import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackArmorMaterial;
import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackDogArmor;
import com.qanstar.boysfrontline.item.Discs.DiscsRegister;
import com.qanstar.boysfrontline.item.Discs.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;

public class ItemRegister {
    //Item
    public static final Item Black_Metal_Ingot=new Item(new FabricItemSettings().group(BLACK_GROUP));
    //Armor
    public static final Item BLACKDOG_HELMET = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.HEAD, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_CHESTPLATE = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.CHEST, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_LEGGINGS = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.LEGS, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_BOOTS = new BlackDogArmor(new BlackArmorMaterial(), EquipmentSlot.FEET, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_Shield = new BlackDogShield(new Item.Settings().maxDamage(10240).group(BLACK_GROUP));
    public static void register() {
        //Item
        Registry.register(Registry.ITEM,new Identifier(BoysFrontline.modID,"black_metal_ingot"),Black_Metal_Ingot);
        //Armor
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "blackdog_helmet"), BLACKDOG_HELMET);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "blackdog_chestplate"), BLACKDOG_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "blackdog_leggings"), BLACKDOG_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "blackdog_boots"), BLACKDOG_BOOTS);
        //Shield
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "blackdog_shield"), BLACKDOG_Shield);
        // 唱片
        DiscsRegister.registerDiscs();
        ModSounds.registerSounds();
    }
}
