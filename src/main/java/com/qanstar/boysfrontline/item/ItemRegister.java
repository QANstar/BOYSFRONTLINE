package com.qanstar.boysfrontline.item;

import com.qanstar.boysfrontline.BoysFrontline;
import com.qanstar.boysfrontline.Register;
import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackArmor;
import com.qanstar.boysfrontline.item.Armor.BlackArmor.BlackArmorMaterial;
import com.qanstar.boysfrontline.item.Armor.BlackDogArmor.BlackDogArmor;
import com.qanstar.boysfrontline.item.Armor.BlackDogArmor.BlackDogArmorMaterial;
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
    public static final Item BLACK_ALLOY=new Item(new FabricItemSettings().group(BLACK_GROUP));
    public static final Item BLACK_POWER_CORE=new Item(new FabricItemSettings().group(BLACK_GROUP));
    //Armor
    public static final Item BLACKDOG_HELMET = new BlackDogArmor(new BlackDogArmorMaterial(), EquipmentSlot.HEAD, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_CHESTPLATE = new BlackDogArmor(new BlackDogArmorMaterial(), EquipmentSlot.CHEST, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_LEGGINGS = new BlackDogArmor(new BlackDogArmorMaterial(), EquipmentSlot.LEGS, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_BOOTS = new BlackDogArmor(new BlackDogArmorMaterial(), EquipmentSlot.FEET, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACK_HELMET = new BlackArmor(new BlackArmorMaterial(), EquipmentSlot.HEAD, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACK_CHESTPLATE = new BlackArmor(new BlackArmorMaterial(), EquipmentSlot.CHEST, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACK_LEGGINGS = new BlackArmor(new BlackArmorMaterial(), EquipmentSlot.LEGS, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACK_BOOTS = new BlackArmor(new BlackArmorMaterial(), EquipmentSlot.FEET, (new Item.Settings().group(BLACK_GROUP)));
    public static final Item BLACKDOG_Shield = new BlackDogShield(new Item.Settings().maxDamage(10240).group(BLACK_GROUP));
    public static void register() {
        //Item
        Registry.register(Registry.ITEM,new Identifier(BoysFrontline.modID,"black_metal_ingot"),Black_Metal_Ingot);
        Registry.register(Registry.ITEM,new Identifier(BoysFrontline.modID,"black_alloy"),BLACK_ALLOY);
        Registry.register(Registry.ITEM,new Identifier(BoysFrontline.modID,"black_power_core"),BLACK_POWER_CORE);
        //Armor
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "black_helmet"), BLACK_HELMET);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "black_chestplate"), BLACK_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "black_leggings"), BLACK_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, "black_boots"), BLACK_BOOTS);
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
