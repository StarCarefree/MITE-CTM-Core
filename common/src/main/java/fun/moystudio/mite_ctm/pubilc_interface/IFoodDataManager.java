package fun.moystudio.mite_ctm.pubilc_interface;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import net.minecraft.world.food.FoodProperties;

public interface IFoodDataManager {
    FoodDataManager get();
    FoodProperties set(FoodDataManager foodDataManager);
}
