package com.theoparis.theoswaressentials.item;

import com.theoparis.theoswaressentials.TheosWarEssentials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class AkItem extends Item implements IAnimatable {
    public final AnimationFactory factory = new AnimationFactory(this);

    public AkItem(Settings settings) {
        super(settings);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this,
                "controller", 0, this::predicate));
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public static class Renderer extends GeoItemRenderer<AkItem> {
        public Renderer() {
            super(new Model());
        }
    }

    public static class Model extends AnimatedGeoModel<AkItem> {
        @Override
        public Identifier getModelResource(AkItem object) {
            return new Identifier(TheosWarEssentials.MOD_ID, "geo/ak47.geo.json");
        }

        @Override
        public Identifier getTextureResource(AkItem object) {
            return new Identifier(TheosWarEssentials.MOD_ID, "textures/item/ak47.png");
        }

        @Override
        public Identifier getAnimationResource(AkItem object) {
            return new Identifier(TheosWarEssentials.MOD_ID, "animations/ak47.animation.json");
        }
    }
}
