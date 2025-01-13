package killian.weedfactory;

import killian.weedfactory.item.ModItem;
import killian.weedfactory.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeedFactory implements ModInitializer {
	public static final String MOD_ID = "weedfactory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
		ModVillagers.registerVillagers();
	}
}