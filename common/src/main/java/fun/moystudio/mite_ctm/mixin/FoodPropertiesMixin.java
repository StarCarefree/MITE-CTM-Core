package fun.moystudio.mite_ctm.mixin;

import dev.architectury.extensions.injected.InjectedFoodPropertiesBuilderExtension;
import fun.moystudio.mite_ctm.manager.FoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IFoodDataManager;
import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoodProperties.class)
public abstract class FoodPropertiesMixin implements IFoodDataManager {
    @Unique FoodDataManager foodDataManager=new FoodDataManager();
    @Override
    public FoodDataManager get(){
        return foodDataManager;
    }
    @Override
    public FoodPropertiesMixin set(FoodDataManager foodDataManager){
        this.foodDataManager=foodDataManager;
        return this;
    }
    @Mixin(FoodProperties.Builder.class)
    public abstract static class Builder implements InjectedFoodPropertiesBuilderExtension,IFoodDataManager{
        @Unique FoodDataManager foodDataManager=new FoodDataManager();
        public Builder foodDataManager(FoodDataManager foodDataManager){
            this.foodDataManager=foodDataManager;
            return this;
        }
        @Inject(method = "build", at = @At("RETURN"), cancellable = true)
        public void buildMixin(CallbackInfoReturnable<FoodProperties> cir){
//            cir.setReturnValue(((IFoodDataManager)cir.getReturnValue()).set(foodDataManager));
            //为什么不能强转类型！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
        }
    }
}
