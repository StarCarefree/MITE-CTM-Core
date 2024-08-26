package fun.moystudio.mite_ctm.properties;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import net.minecraft.world.item.Items;

public enum FoodDataEnum {
    APPLE(FoodItemProperties.create(Items.APPLE, FoodDataManager.create(0,8000,4800)));

    private FoodItemProperties foodItemProperties;

    FoodDataEnum(FoodItemProperties foodItemProperties) {
        this.foodItemProperties=foodItemProperties;
    }

    public FoodItemProperties get(){
        return foodItemProperties;
    }
}
