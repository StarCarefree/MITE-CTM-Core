package fun.moystudio.mite_ctm.pubilc_interface;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import fun.moystudio.mite_ctm.mixin.FoodPropertiesMixin;

public interface IFoodDataManager {
    FoodDataManager get();
    FoodPropertiesMixin set(FoodDataManager foodDataManager);
}
