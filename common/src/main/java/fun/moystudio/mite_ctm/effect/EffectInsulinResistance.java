package fun.moystudio.mite_ctm.effect;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IFoodDataManager;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class EffectInsulinResistance extends MobEffect {
    protected EffectInsulinResistance(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity,int i){
        if(livingEntity instanceof Player){
            FoodDataManager foodDataManager=((IFoodDataManager)(((Player) livingEntity).getFoodData())).get();
            if(foodDataManager.getIsl()>foodDataManager.getLastisl()){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,400,i));
                if(i>=2){
                    if(foodDataManager.getIsl()-foodDataManager.getLastisl()>4800){
                        if(!livingEntity.hasEffect(MobEffects.POISON))
                            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON,200));
                    }
                    else{
                        if(!livingEntity.hasEffect(MobEffects.POISON))
                            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON,100));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int i, int j){
        return i>=5;
    }
}