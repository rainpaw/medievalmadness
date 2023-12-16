package net.rainpaw10.medievalmadness.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rainpaw10.medievalmadness.MedievalMadness;

public class ModItemGroups {

    public static final ItemGroup MEDIEVAL_MADNESS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MedievalMadness.MOD_ID, "medievalmadness"),
            FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.medievalmadness"))
            .icon(() -> new ItemStack(ModItems.LIGHT_IRON_INGOT))
            .entries((displayContext, entries) -> {

                entries.add(ModItems.LIGHT_IRON_INGOT);
                entries.add(ModItems.HEAVY_IRON_INGOT);
                entries.add(ModItems.LIGHT_NETHERITE_INGOT);

            }).build());

    public static void registerItemGroups() {
        MedievalMadness.LOGGER.info("Registering Item Groups For: " + MedievalMadness.MOD_ID);
    }

}