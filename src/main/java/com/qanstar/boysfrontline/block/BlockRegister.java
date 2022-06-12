package com.qanstar.boysfrontline.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;

public class BlockRegister {
    public static final Block Black_Metal_Ore=new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    public static void register() {
        Registry.register(Registry.BLOCK,new Identifier("boysfrontline","black_metal_ore"),Black_Metal_Ore);
        Registry.register(Registry.ITEM,new Identifier("boysfrontline","black_metal_ore"),new BlockItem(Black_Metal_Ore,new Item.Settings().group(BLACK_GROUP)));
    }
}
