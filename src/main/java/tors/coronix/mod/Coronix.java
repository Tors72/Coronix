package tors.coronix.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tors.coronix.mod.block.ModBlocks;
import tors.coronix.mod.item.ModItems;

public class Coronix implements ModInitializer {
	public static final String MOD_ID = "coronix";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}