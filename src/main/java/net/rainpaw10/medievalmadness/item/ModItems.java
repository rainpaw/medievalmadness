package net.rainpaw10.medievalmadness.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rainpaw10.medievalmadness.MedievalMadness;

public class ModItems {

    public static final Item LIGHT_IRON_INGOT = registerItem("light_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item HEAVY_IRON_INGOT = registerItem("heavy_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item LIGHT_NETHERITE_INGOT = registerItem("light_netherite_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(LIGHT_IRON_INGOT);
        entries.add(HEAVY_IRON_INGOT);
        entries.add(LIGHT_NETHERITE_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MedievalMadness.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MedievalMadness.LOGGER.info("Registering Mod Items For: " + MedievalMadness.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
