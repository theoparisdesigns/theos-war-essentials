package com.theoparis.theoswaressentials;

import com.theoparis.theoswaressentials.item.AkItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TheosWarEssentials implements ModInitializer {
    public static final String MOD_ID = "theoswaressentials";

    // Create ak47s item
    public static final AkItem AK47 = new AkItem(new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ak47"), AK47);
    }
}
