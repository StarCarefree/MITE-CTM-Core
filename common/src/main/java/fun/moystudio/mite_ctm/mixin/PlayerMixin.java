package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.effect.ModEffect;
import fun.moystudio.mite_ctm.pubilc_interface.IFoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IMaxFoodLevel;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity implements IFoodDataManager {
    @Shadow public int experienceLevel;

    @Shadow protected FoodData foodData;

    @Shadow public abstract FoodData getFoodData();

    @Shadow @Final private static Logger LOGGER;

    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    public void tickMixin(CallbackInfo ci){
        ((IMaxFoodLevel)foodData).setMaxFoodLevel(Math.min(20,6+experienceLevel/5*2));
        ((IFoodDataManager)foodData).get().setIsl(((IFoodDataManager)foodData).get().getIsl()-1);//均为每tick降低1（每分钟降低1200）
        ((IFoodDataManager)foodData).get().setPtt(((IFoodDataManager)foodData).get().getPtt()-1);//均为每tick降低1（每分钟降低1200）
        ((IFoodDataManager)foodData).get().setPtn(((IFoodDataManager)foodData).get().getPtn()-1);//均为每tick降低1（每分钟降低1200）
        this.getAttributes().getInstance(Attributes.MAX_HEALTH).setBaseValue(Math.min(20,6+experienceLevel/5*2));
        this.getAttributes().getInstance(Attributes.BLOCK_BREAK_SPEED).setBaseValue(1+0.02*experienceLevel);
        foodData.setFoodLevel(Math.min(foodData.getFoodLevel(),((IMaxFoodLevel)foodData).getMaxFoodLevel()));
        if(foodData.getFoodLevel()==0F){
            this.setSpeed(0.08F);
        }
        else{
            this.setSpeed(0.1F);
        }
        int isl=((IFoodDataManager)foodData).get().getIsl();
        boolean hasInsulinRes=this.hasEffect((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE);
        MobEffectInstance getInsulinRes=hasInsulinRes?this.getEffect((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE):null;
        if(isl>=48000&&isl<96000) {
            if((!hasInsulinRes||getInsulinRes.getAmplifier()!=0)){
                this.removeEffect((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE);
                this.forceAddEffect(new MobEffectInstance((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE,((IFoodDataManager)foodData).get().getIsl()),this);
            }
        } else if (isl>=96000&&isl<144000) {
            if((!hasInsulinRes||getInsulinRes.getAmplifier()!=1)){
                this.removeEffect((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE);
                this.forceAddEffect(new MobEffectInstance((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE,((IFoodDataManager)foodData).get().getIsl(),1),this);
            }
        } else if (isl>=144000){
            if((!hasInsulinRes||getInsulinRes.getAmplifier()!=2)){
                this.removeEffect((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE);
                this.forceAddEffect(new MobEffectInstance((Holder<MobEffect>) ModEffect.INSULIN_RESISTANCE,((IFoodDataManager)foodData).get().getIsl(),2),this);
            }
        }
        int ptt=((IFoodDataManager)foodData).get().getPtt(),ptn=((IFoodDataManager)foodData).get().getPtn();
        boolean hasMalnourished=this.hasEffect((Holder<MobEffect>) ModEffect.MALNOURISHED);
        if(ptt<=(int)(160000*0.05)||ptn<=(int)(160000*0.05)){
            if(!hasMalnourished){
                this.forceAddEffect(new MobEffectInstance((Holder<MobEffect>) ModEffect.MALNOURISHED, MobEffectInstance.INFINITE_DURATION),this);
            }
        }
        else{
            if(!hasMalnourished) {
                this.removeEffect((Holder<MobEffect>) ModEffect.MALNOURISHED);
            }
        }
    }

    @Inject(method = "getXpNeededForNextLevel",at = @At("HEAD"),cancellable = true)
    public void getXpNeededMixin(CallbackInfoReturnable<Integer> cir){//经验系统重写
        if(this.experienceLevel>=200){
            this.experienceLevel=200;
            cir.setReturnValue(Integer.MAX_VALUE);
        }
        else cir.setReturnValue(10*(this.experienceLevel+1));
    }

    @Inject(method = "aiStep", at = @At("HEAD"))
    public void aiStepMixin(CallbackInfo ci){//每64秒回一滴血（直接用tick算的,mc到底有没有秒计数啊啊啊啊啊啊啊啊啊）
        if(this.tickCount%(64*20)==0&&this.foodData.getFoodLevel()>=((IMaxFoodLevel)this.foodData).getMaxFoodLevel()*0.5&&!this.hasEffect(ModEffect.MALNOURISHED)){
            this.heal(1.0F);
        }
        else if(this.tickCount%(256*20)==0&&this.foodData.getFoodLevel()>=((IMaxFoodLevel)this.foodData).getMaxFoodLevel()*0.5&&this.hasEffect(ModEffect.MALNOURISHED)){
            this.heal(1.0F);
        }
    }

    @ModifyArg(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;heal(F)V"),index = 0)
    public float aiStepMixin2(float par1){//禁用原版回血
        return 0.0F;
    }

    @Inject(method = "attack" ,at = @At("HEAD"),cancellable = true)
    public void attackMixin(Entity entity, CallbackInfo ci){//取消攻击
        if (this.getHealth() <= 1.0F) {
            ci.cancel();
        }
        if (this.getFoodData().getFoodLevel() <= 0) {
            ci.cancel();
        }
    }

    @ModifyArg(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"),index = 1)
    public float attackMixin2(float f){//攻击力每级增加0.5%
        return (float)(f*0.005*this.experienceLevel);
    }
}
