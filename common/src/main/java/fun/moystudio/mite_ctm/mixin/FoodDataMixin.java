package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.pubilc_interface.IMaxFoodLevel;
import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(FoodData.class)
public abstract class FoodDataMixin implements IMaxFoodLevel {
    @Unique private int maxFoodLevel=6;

    @Override
    public int getMaxFoodLevel(){
        return this.maxFoodLevel;
    }
    @Override
    public void setMaxFoodLevel(int x){
        this.maxFoodLevel=x;
    }
}
