package dev.aspyro.periodicdroppermod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup PERIODIC_DROPPER_GROUP = new ItemGroup("periodicDropperTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REDSTONE_CORE.get());
        }
    };
}
