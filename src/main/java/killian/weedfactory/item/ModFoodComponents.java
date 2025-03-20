package killian.weedfactory.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

class ModFoodComponents {
    public static final FoodComponent SPACE_CAKE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 1.0F)
            .alwaysEdible()
            .build();
}
