package killian.weedfactory.item;

import killian.weedfactory.WeedFactory;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {

    public static final Item SPACE_CAKE = registerItem("space_cake", new Item(new Item.Settings()));
    public static final Item BARRETTE_DE_SHIT = registerItem("barrette_de_shit", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
     return Registry.register(Registries.ITEM, Identifier.of(WeedFactory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WeedFactory.LOGGER.info("Registering Mod Items for " + WeedFactory.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SPACE_CAKE);
            entries.add(BARRETTE_DE_SHIT);
        });
    }
}
