package net.vee.vtech.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.vee.vtech.VTech;

public class ModSounds {

    public static final SoundEvent GLORP_SONG = regiserSoundEvent("glorp_song");

    private static SoundEvent regiserSoundEvent(String name){
        Identifier id = new Identifier(VTech.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){VTech.LOGGER.info("Registering Sounds for " + VTech.MOD_ID);
    }
}
