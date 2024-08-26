package fun.moystudio.mite_ctm.properties;

import fun.moystudio.mite_ctm.manager.FoodDataManager;
import net.minecraft.world.item.Item;

public class FoodItemProperties {
    public final Item originalItem;
    public final FoodDataManager foodDataManager;
    public FoodItemProperties(Item a,FoodDataManager b){
        this.originalItem=a;
        this.foodDataManager=b;
    }
    public static FoodItemProperties create(Item a,FoodDataManager b){
        return new FoodItemProperties(a,b);
    }
}
