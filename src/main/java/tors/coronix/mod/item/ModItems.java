package tors.coronix.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import tors.coronix.mod.Coronix;
import net.minecraft.item.Item;

public class ModItems {

    //in lowercase with _ to seperate characters -- used in /give command, convention
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Coronix.MOD_ID, name), item);

    }

    public final static Item RUBY = registerItem("ruby",new Item(new Item.Settings()));

    public static final Item EMERALD_SHARD = registerItem("emerald_shard",new Item(new Item.Settings()));

    public static void registerModItems(){
        Coronix.LOGGER.info("Registering Mod Items for " + Coronix.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries
                -> {
                entries.add(RUBY);
                entries.add(EMERALD_SHARD);
        });
    }
}
