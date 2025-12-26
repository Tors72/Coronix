package tors.coronix.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tors.coronix.mod.Coronix;
import tors.coronix.mod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Coronix.MOD_ID,"ruby_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.coronix.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        }
                    ).build());

    public static final ItemGroup SHARD_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Coronix.MOD_ID,"shard_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.EMERALD_SHARD))
                    .displayName(Text.translatable("itemgroup.coronix.shard_items"))
                    .entries((displayContext, entries) -> {
                                entries.add(ModItems.EMERALD_SHARD);
                            }
                    ).build());

//ORDER OF ITEM GROUPS ORDER IN WHICH THEY ARE REGISTERED, ITEMS THEN BLOCKS
    public static void registerItemGroups(){

        Coronix.LOGGER.info("Registering item groups for "+Coronix.MOD_ID);
    }
}
