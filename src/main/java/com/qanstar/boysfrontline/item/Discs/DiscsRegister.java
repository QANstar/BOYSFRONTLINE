package com.qanstar.boysfrontline.item.Discs;

import com.qanstar.boysfrontline.BoysFrontline;
import com.qanstar.boysfrontline.item.Discs.type.QANDiscsItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class DiscsRegister {
    //lovelive
    public static final Item MUSIC_DISC_LOVELIVE_DREAMSTART = registerDiscLovelive("music_disc_dreamstart", ModSounds.MODSOUND_MUSIC_DISC_DREAMSTART);
    public static final Item MUSIC_DISC_LOVELIVE_ENJOYIT = registerDiscLovelive("music_disc_enjoyit", ModSounds.MODSOUND_MUSIC_DISC_ENJOYIT);
    public static final Item MUSIC_DISC_LOVELIVE_SINGSMILE = registerDiscLovelive("music_disc_singsmile", ModSounds.MODSOUND_MUSIC_DISC_SINGSMILE);
    public static final Item MUSIC_DISC_LOVELIVE_COLORFULDREAMSCOLORFULSMILES= registerDiscLovelive("music_disc_colorfuldreamscolorfulsmiles", ModSounds.MODSOUND_MUSIC_DISC_COLORFULDREAMS);
    public static final Item MUSIC_DISC_NEOSKYNEOMAP = registerDiscLovelive("music_disc_neoskyneomap", ModSounds.MODSOUND_MUSIC_DISC_NEOSKYNEOMAP);
    public static final Item MUSIC_DISC_LOVELIVE_DREAMMYSUN = registerDiscLovelive("music_disc_dreammysun", ModSounds.MODSOUND_MUSIC_DISC_DREAMMYSUN);
    public static final Item MUSIC_DISC_LOVELIVE_FUTURE = registerDiscLovelive("music_disc_future", ModSounds.MODSOUND_MUSIC_DISC_FUTURE);
    public static Item registerDiscLovelive(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.COMMON).maxCount(1).group(BoysFrontline.LOVELIVE_GROUP);
        return Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, id), new QANDiscsItem(0, sound, settings));
    }
    public static void registerDiscs() {}

}
