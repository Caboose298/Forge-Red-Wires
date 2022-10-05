package net.caboose1589.forgeredwires;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class RedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RedWiresMain.MOD_ID);
    public static final RegistryObject<Item> red_ingot = ITEMS.register("red_alloy_ingot",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
