package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IFoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IMaxFoodLevel;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FoodData.class)
public abstract class FoodDataMixin implements IMaxFoodLevel {
    @Unique private int maxFoodLevel=6;//最大饥饿值
    @Unique private FoodDataManager foodDataManager=new FoodDataManager(160000,160000,0);

    @Override
    public int getMaxFoodLevel() {
        return this.maxFoodLevel;
    }
    @Override
    public void setMaxFoodLevel(int x){
        this.maxFoodLevel=x;
    }

    @Inject(method = "eat(Lnet/minecraft/world/food/FoodProperties;)V", at = @At("TAIL"))
    public void eat(FoodProperties foodProperties, CallbackInfo ci){
//        foodDataManager.setPtt(foodDataManager.getPtt()+((IFoodDataManager)foodProperties).get().getPtt());
//        foodDataManager.setPtn(foodDataManager.getPtn()+((IFoodDataManager)foodProperties).get().getPtn());
//        foodDataManager.setIsl(foodDataManager.getIsl()+((IFoodDataManager)foodProperties).get().getIsl());
        //WHY??????????????????????????????????????
    }


}
