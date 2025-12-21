package tors.coronix.mod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import tors.coronix.mod.Coronix;



public class ModBlocks {

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Coronix.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Coronix.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }


    public static final Block RUBY_BLOCK = registerBlock(
            "ruby_block",
            new Block (
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL).velocityMultiplier(3f)
                            .pistonBehavior(PistonBehavior.PUSH_ONLY)));


    public static void registerModBlocks(){
        Coronix.LOGGER.info("Registering mod blocks for "+Coronix.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> {
                    entries.add(ModBlocks.RUBY_BLOCK);
        });
    }
}
