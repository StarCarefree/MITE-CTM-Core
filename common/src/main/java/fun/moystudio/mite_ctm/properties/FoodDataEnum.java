package fun.moystudio.mite_ctm.properties;

import fun.moystudio.mite_ctm.item.ModFood;
import fun.moystudio.mite_ctm.manager.FoodDataManager;
import net.minecraft.world.item.Items;

public enum FoodDataEnum {
    APPLE(FoodItemProperties.create(Items.APPLE, FoodDataManager.create(0,8000,4800))),
    BLUEBERRIES(FoodItemProperties.create(ModFood.BLUEBERRIES.get(), FoodDataManager.create(0,8000,4800))),
//    WHEAT_SEEDS(FoodItemProperties.create(Items.WHEAT_SEEDS), FoodDataManager.create(0,0,0));
    CAKE(FoodItemProperties.create(Items.CAKE, FoodDataManager.create(16000,0,0))),
    PORKCHOP(FoodItemProperties.create(Items.PORKCHOP, FoodDataManager.create(32000,0,0))),
    COOKED_PORKCHOP(FoodItemProperties.create(Items.COOKED_PORKCHOP, FoodDataManager.create(64000,0,0))),
    GOLDEN_APPLE(FoodItemProperties.create(Items.GOLDEN_APPLE, FoodDataManager.create(0,8000,4800))),
    MILK_BUCKET(FoodItemProperties.create(Items.MILK_BUCKET, FoodDataManager.create(32000,0,0))),
    EGG(FoodItemProperties.create(Items.EGG, FoodDataManager.create(24000,0,0))),
    COD(FoodItemProperties.create(Items.COD, FoodDataManager.create(24000,0,0))),
    COOKED_COD(FoodItemProperties.create(Items.COOKED_COD, FoodDataManager.create(48000,0,0))),
//    SUGAR(FoodItemProperties.create(Items.SUGAR, FoodDataManager.create(0,0,4800))),
    COOKIE(FoodItemProperties.create(Items.COOKIE, FoodDataManager.create(0,0,1200))),
    MELON_SLICE(FoodItemProperties.create(Items.MELON_SLICE, FoodDataManager.create(0,8000,4800))),
    BEEF(FoodItemProperties.create(Items.BEEF, FoodDataManager.create(40000,0,0))),
    COOKED_BEEF(FoodItemProperties.create(Items.COOKED_BEEF, FoodDataManager.create(80000,0,0))),
    CHICKEN(FoodItemProperties.create(Items.CHICKEN, FoodDataManager.create(24000,0,0))),
    COOKED_CHICKEN(FoodItemProperties.create(Items.COOKED_CHICKEN, FoodDataManager.create(48000,0,0))),
    ROTTEN_FLESH(FoodItemProperties.create(Items.ROTTEN_FLESH, FoodDataManager.create(8000,0,0))),
    SPIDER_EYE(FoodItemProperties.create(Items.SPIDER_EYE, FoodDataManager.create(8000,0,0))),
    CARROT(FoodItemProperties.create(Items.CARROT, FoodDataManager.create(0,16000,0))),
    GOLDEN_CARROT(FoodItemProperties.create(Items.GOLDEN_CARROT, FoodDataManager.create(0,16000,0))),
    PUMPKIN_PIE(FoodItemProperties.create(Items.PUMPKIN_PIE, FoodDataManager.create(48000,48000,4800))),
    MUTTON(FoodItemProperties.create(Items.MUTTON, FoodDataManager.create(24000, 0, 0))),
    COOKED_MUTTON(FoodItemProperties.create(Items.COOKED_MUTTON, FoodDataManager.create(48000, 0, 0))),

    CHOCOLATE(FoodItemProperties.create(ModFood.CHOCOLATE.get(), FoodDataManager.create(0,0,4800))),
    ONION(FoodItemProperties.create(ModFood.ONION.get(), FoodDataManager.create(0,8000,0))),
    BEEF_STEW(FoodItemProperties.create(ModFood.BEEF_STEW.get(), FoodDataManager.create(128000,128000,0))),
    CHICKEN_SOUP(FoodItemProperties.create(ModFood.CHICKEN_SOUP.get(), FoodDataManager.create(80000,80000,0))),
    COPPER_MILK_BUCKET(FoodItemProperties.create(ModFood.COPPER_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    SILVER_MILK_BUCKET(FoodItemProperties.create(ModFood.SILVER_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    GOLDEN_MILK_BUCKET(FoodItemProperties.create(ModFood.GOLDEN_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    MITHRIL_MILK_BUCKET(FoodItemProperties.create(ModFood.MITHRIL_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    ADAMANTIUM_MILK_BUCKET(FoodItemProperties.create(ModFood.ADAMANTIUM_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    ANCIENT_METAL_MILK_MILK_BUCKET(FoodItemProperties.create(ModFood.ANCIENT_METAL_MILK_MILK_BUCKET.get(), FoodDataManager.create(32000,0,0))),
    CHEESE(FoodItemProperties.create(ModFood.CHEESE.get(), FoodDataManager.create(24000,0,0))),
    VEGETABLE_SOUP(FoodItemProperties.create(ModFood.VEGETABLE_SOUP.get(), FoodDataManager.create(0,48000,0))),
    ICE_CREAM(FoodItemProperties.create(ModFood.ICE_CREAM.get(), FoodDataManager.create(32000,0,4800))),
    SALAD(FoodItemProperties.create(ModFood.SALAD.get(), FoodDataManager.create(0,8000,0))),
    CREAM_OF_MUSHROOM_SOUP(FoodItemProperties.create(ModFood.CREAM_OF_MUSHROOM_SOUP.get(), FoodDataManager.create(40000,0,0))),
    CREAM_OF_VEGETABLE_SOUP(FoodItemProperties.create(ModFood.CREAM_OF_VEGETABLE_SOUP.get(), FoodDataManager.create(56000,56000,0))),
    PUMPKIN_SOUP(FoodItemProperties.create(ModFood.PUMPKIN_SOUP.get(), FoodDataManager.create(0,16000,0))),
    ORANGE(FoodItemProperties.create(ModFood.ORANGE.get(), FoodDataManager.create(0,8000,4800))),
    BANANA(FoodItemProperties.create(ModFood.BANANA.get(), FoodDataManager.create(0,8000,4800))),
    MASHED_POTATO(FoodItemProperties.create(ModFood.MASHED_POTATO.get(), FoodDataManager.create(64000,0,0))),
    SORBET(FoodItemProperties.create(ModFood.SORBET.get(), FoodDataManager.create(16000,0,9600))),
    PORRIDGE(FoodItemProperties.create(ModFood.PORRIDGE.get(), FoodDataManager.create(0,16000,9600))),
    CEREAL(FoodItemProperties.create(ModFood.CEREAL.get(), FoodDataManager.create(16000,0,4800))),
    WORM(FoodItemProperties.create(ModFood.WORM.get(), FoodDataManager.create(8000,0,0))),
    COOKED_WORM(FoodItemProperties.create(ModFood.COOKED_WORM.get(), FoodDataManager.create(8000,0,0)));

    private FoodItemProperties foodItemProperties;

    FoodDataEnum(FoodItemProperties foodItemProperties) {
        this.foodItemProperties=foodItemProperties;
    }

    public FoodItemProperties get(){
        return foodItemProperties;
    }
}
