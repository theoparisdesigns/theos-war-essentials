package com.theoparis.theoswaressentials.client;

import com.theoparis.theoswaressentials.TheosWarEssentials;
import com.theoparis.theoswaressentials.item.AkItem;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class TheosWarEssentialsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeoItemRenderer.registerItemRenderer(TheosWarEssentials.AK47,
                new AkItem.Renderer());
    }
}
