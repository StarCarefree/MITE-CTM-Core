package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.pubilc_interfaces.IMaxFoodLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {
    @Shadow public int experienceLevel;

    @Shadow protected FoodData foodData;

    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    public void tickMixin(CallbackInfo ci){
        ((IMaxFoodLevel)foodData).setMaxFoodLevel(Math.min(20,6+experienceLevel/5*2));
        this.getAttributes().getInstance(Attributes.MAX_HEALTH).setBaseValue((double)6+experienceLevel/5*2);
        foodData.setFoodLevel(Math.min(foodData.getFoodLevel(),((IMaxFoodLevel)foodData).getMaxFoodLevel()));
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
        if(this.tickCount%(64*20)==0&&this.getHealth()>=this.getAttributes().getBaseValue(Attributes.MAX_HEALTH)*0.5) this.heal(1.0F);
    }

    @ModifyArg(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;heal(F)V"),index = 0)
    public float aiStepMixin2(float par1){//禁用原版回血
        return 0.0F;
    }
}
