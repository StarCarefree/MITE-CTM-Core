package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.pubilc_interfaces.IMaxFoodLevel;
import net.minecraft.world.entity.Entity;
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

    @Shadow public abstract FoodData getFoodData();

    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    public void tickMixin(CallbackInfo ci){
        ((IMaxFoodLevel)foodData).setMaxFoodLevel(Math.min(20,6+experienceLevel/5*2));
        this.getAttributes().getInstance(Attributes.MAX_HEALTH).setBaseValue((double)6+experienceLevel/5*2);
        this.getAttributes().getInstance(Attributes.BLOCK_BREAK_SPEED).setBaseValue(1+0.02*experienceLevel);
        foodData.setFoodLevel(Math.min(foodData.getFoodLevel(),((IMaxFoodLevel)foodData).getMaxFoodLevel()));
        if(foodData.getFoodLevel()==0.0F){
            this.setSpeed(0.08F);
        }
        else{
            this.setSpeed(0.1F);
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
        if(this.tickCount%(64*20)==0&&this.getHealth()>=this.getAttributes().getBaseValue(Attributes.MAX_HEALTH)*0.5) this.heal(1.0F);
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
    //破坏就得注册一个新的方块来替代旧的方块并把硬度改为设置的值（直接复制）
    //要不我去定义里面找用mixin改找不到
    @ModifyArg(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"),index = 1)
    public float attackMixin2(float f){//攻击力每级增加0.5%
        return (float)(f*0.005*this.experienceLevel);
    }
}
