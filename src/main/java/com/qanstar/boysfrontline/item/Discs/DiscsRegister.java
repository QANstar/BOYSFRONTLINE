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
    //kano
    public static final Item MUSIC_DISC_KANO_CALC = registerDiscKano("music_disc_calc", ModSounds.MODSOUND_MUSIC_DISC_CALC);
    public static final Item MUSIC_DISC_KANO_FANYU = registerDiscKano("music_disc_fanyu", ModSounds.MODSOUND_MUSIC_DISC_FANYU);
    public static final Item MUSIC_DISC_KANO_GLOW = registerDiscKano("music_disc_glow", ModSounds.MODSOUND_MUSIC_DISC_GLOW);
    public static final Item MUSIC_DISC_KANO_HEART = registerDiscKano("music_disc_heart", ModSounds.MODSOUND_MUSIC_DISC_HEART);
    public static final Item MUSIC_DISC_KANO_STELLARIUM = registerDiscKano("music_disc_stellarium", ModSounds.MODSOUND_MUSIC_DISC_STELLARIUM);
    //other
    public static final Item MUSIC_DISC_OTHER_ALIA = registerDiscOther("music_disc_alia", ModSounds.MODSOUND_MUSIC_DISC_ALIA);
    public static final Item MUSIC_DISC_OTHER_DIVERGENCE = registerDiscOther("music_disc_divergence", ModSounds.MODSOUND_MUSIC_DISC_DIVERGENCE);
    public static final Item MUSIC_DISC_OTHER_HORSEJUMP = registerDiscOther("music_disc_horsejump", ModSounds.MODSOUND_MUSIC_DISC_HORSEJUMP);
    public static final Item MUSIC_DISC_OTHER_SINCERELY = registerDiscOther("music_disc_sincerely", ModSounds.MODSOUND_MUSIC_DISC_SINCERELY);
    public static Item registerDiscLovelive(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.COMMON).maxCount(1).group(BoysFrontline.LOVELIVE_GROUP);
        return Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, id), new QANDiscsItem(0, sound, settings));
    }
    public static Item registerDiscKano(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.COMMON).maxCount(1).group(BoysFrontline.KANO_GROUP);
        return Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, id), new QANDiscsItem(0, sound, settings));
    }
    public static Item registerDiscOther(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.COMMON).maxCount(1).group(BoysFrontline.OTHER_GROUP);
        return Registry.register(Registry.ITEM, new Identifier(BoysFrontline.modID, id), new QANDiscsItem(0, sound, settings));
    }
    public static void registerDiscs() {}

}
