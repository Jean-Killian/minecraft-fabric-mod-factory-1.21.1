package killian.weedfactory.effect;

import killian.weedfactory.WeedFactory;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> FONCEDALLE = registerStatusEffect( "foncedalle",
            new FoncedalleEffect(StatusEffectCategory.BENEFICIAL, 0x36ebab));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(WeedFactory.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        WeedFactory.LOGGER.info("Registering Mod Effects for " + WeedFactory.MOD_ID);
    }
}
