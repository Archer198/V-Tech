package net.vee.vtech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.vee.vtech.VTech;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vee.vtech.sound.ModSounds;

public class ModItems {
    public static final Item GLORP = registerItem("glorp",
            new Item(new FabricItemSettings()));
    public static final Item RAW_GLORP = registerItem("raw_glorp",
            new Item(new FabricItemSettings()));

    public static final Item GLORP_SONG_MUSIC_DISC = registerItem("glorp_song_music_disc",
            new MusicDiscItem(7, ModSounds.GLORP_SONG, new FabricItemSettings().maxCount(1), 251));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(GLORP);
        entries.add(RAW_GLORP);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VTech.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VTech.LOGGER.info("Registering Mod Items for " + VTech.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
