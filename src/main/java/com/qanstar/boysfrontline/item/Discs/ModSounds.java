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
    public static SoundEvent register(String name) {
        Identifier id = new Identifier(BoysFrontline.modID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerSounds() {}

}
