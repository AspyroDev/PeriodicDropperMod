package dev.aspyro.periodicdroppermod.item;

import dev.aspyro.periodicdroppermod.PeriodicDropperMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PeriodicDropperMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> REDSTONE_CORE = ITEMS.register("redstone_core",
            () -> new Item(new Item.Properties().tab(ModItemGroup.PERIODIC_DROPPER_GROUP)));
}
