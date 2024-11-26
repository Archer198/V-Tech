package net.vee.vtech.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vee.vtech.VTech;

public class ModItemGroups {
    public static final ItemGroup GLORP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VTech.MOD_ID, "glorp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.glorp"))
                    .icon(() -> new ItemStack(ModItems.GLORP)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GLORP);
                        entries.add(ModItems.RAW_GLORP);

                        entries.add(ModItems.GLORP_SONG_MUSIC_DISC);

                    }).build());


    public static void registerItemGroups(){
        VTech.LOGGER.info("Registering Item Groups for " + VTech.MOD_ID);
    }

}
