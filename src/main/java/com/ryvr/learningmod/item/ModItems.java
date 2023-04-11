package com.ryvr.learningmod.item;

import com.ryvr.learningmod.LearningMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MODID);
    public static final RegistryObject<Item> SELENITE = Items.register("selenite",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
