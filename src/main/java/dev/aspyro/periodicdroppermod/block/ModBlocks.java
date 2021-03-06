package dev.aspyro.periodicdroppermod.block;

import dev.aspyro.periodicdroppermod.PeriodicDropperMod;
import dev.aspyro.periodicdroppermod.item.ModItemGroup;
import dev.aspyro.periodicdroppermod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PeriodicDropperMod.MOD_ID);

    public static final RegistryObject<Block> PERIODIC_REDSTONE_DROPPER =
            registerBlock("periodic_redstone_dropper_mk1",
                    () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                            .harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.PERIODIC_DROPPER_GROUP)));
    }
}
