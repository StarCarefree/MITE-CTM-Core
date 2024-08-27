package fun.moystudio.mite_ctm.effect;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

import java.util.function.Supplier;

public class ModEffect {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.MOB_EFFECT);
    public static final RegistrySupplier<MobEffect> INSULIN_RESISTANCE=MOB_EFFECTS.register("insulin_resistance",() ->
            new EffectInsulinResistance(MobEffectCategory.HARMFUL,0xFF0000));
    public static final RegistrySupplier<MobEffect> MALNOURISHED=MOB_EFFECTS.register("malnourished",()->
            new EffectMalnourished(MobEffectCategory.HARMFUL,0xFFFF00));
    public static void register(){
        MOB_EFFECTS.register();
    }
}
