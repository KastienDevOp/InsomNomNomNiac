package net.kastiendev.insomnomnomniac.item;

import net.kastiendev.insomnomnomniac.InsomNomNomNiac;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InsomNomNomNiac.MOD_ID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSOMNOMNOMNIAC_TAB)));
    public static final RegistryObject<Item> KAS_AMULET = ITEMS.register("kas_amulet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSOMNOMNOMNIAC_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
