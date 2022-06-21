package com.qanstar.boysfrontline.item.Discs;

import com.qanstar.boysfrontline.BoysFrontline;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static final SoundEvent MODSOUND_MUSIC_DISC_DREAMSTART = register("lovelive_dreamstart");
    public static final SoundEvent MODSOUND_MUSIC_DISC_ENJOYIT = register("lovelive_enjoyit");
    public static final SoundEvent MODSOUND_MUSIC_DISC_SINGSMILE = register("lovelive_singsmile");
    public static final SoundEvent MODSOUND_MUSIC_DISC_COLORFULDREAMS = register("lovelive_colorfuldreams");
    public static final SoundEvent MODSOUND_MUSIC_DISC_NEOSKYNEOMAP = register("lovelive_neoskyneomap");
    public static final SoundEvent MODSOUND_MUSIC_DISC_DREAMMYSUN = register("lovelive_dreammysun");
    public static final SoundEvent MODSOUND_MUSIC_DISC_FUTURE = register("lovelive_future");
    public static final SoundEvent MODSOUND_MUSIC_DISC_CALC = register("kano_calc");
    public static final SoundEvent MODSOUND_MUSIC_DISC_FANYU = register("kano_fanyu");
    public static final SoundEvent MODSOUND_MUSIC_DISC_GLOW = register("kano_glow");
    public static final SoundEvent MODSOUND_MUSIC_DISC_HEART = register("kano_heart");
    public static final SoundEvent MODSOUND_MUSIC_DISC_STELLARIUM = register("kano_stellarium");
    public static final SoundEvent MODSOUND_MUSIC_DISC_ALIA = register("alia");
    public static final SoundEvent MODSOUND_MUSIC_DISC_DIVERGENCE = register("divergence");
    public static final SoundEvent MODSOUND_MUSIC_DISC_HORSEJUMP = register("horsejump");
    public static final SoundEvent MODSOUND_MUSIC_DISC_SINCERELY = register("sincerely");
    public static SoundEvent register(String name) {
        Identifier id = new Identifier(BoysFrontline.modID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerSounds() {}

}
