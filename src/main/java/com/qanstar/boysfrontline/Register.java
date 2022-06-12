package com.qanstar.boysfrontline;
import com.qanstar.boysfrontline.Block.BlockRegister;
import com.qanstar.boysfrontline.item.ItemRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.qanstar.boysfrontline.BoysFrontline.BLACK_GROUP;

public class Register {
    // mod书
    public static final Item ModBook = new Item(new Item.Settings().group(BLACK_GROUP));
    // 黑狗战甲

    public static void register() {
        Registry.register(Registry.ITEM,new Identifier("boysfrontline","mod_book"),ModBook);
        ItemRegister.register();
        BlockRegister.register();
    }
}
