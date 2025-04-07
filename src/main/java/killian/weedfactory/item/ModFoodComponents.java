package killian.weedfactory.item;

import killian.weedfactory.effect.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import static killian.weedfactory.effect.ModEffects.FONCEDALLE;


class ModFoodComponents {
    public static final FoodComponent SPACE_CAKE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000), 1.0F)
            .statusEffect(new StatusEffectInstance(ModEffects.FONCEDALLE, 1000), 1.0F)
            .alwaysEdible()
            .build();
}
