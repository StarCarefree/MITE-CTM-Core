package fun.moystudio.mite_ctm.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModFood {
    public static final FoodProperties FOOD_CHOCOLATE=(new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> CHOCOLATE=ModItem.ITEMS.register("chocolate",()->
            new Item(new Item.Properties().food(FOOD_CHOCOLATE).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_SALAD=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(1).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> SALAD=ModItem.ITEMS.register("salad",()->
            new Item(new Item.Properties().food(FOOD_SALAD).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_BLUEBERRIES=(new FoodProperties.Builder()).nutrition(1).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> BLUEBERRIES=ModItem.ITEMS.register("blueberries",()->
            new Item(new Item.Properties().food(FOOD_BLUEBERRIES).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_PORRIDGE=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(2).saturationModifier(1F).build();
    public static final RegistrySupplier<Item> PORRIDGE=ModItem.ITEMS.register("porridge",()->
            new Item(new Item.Properties().food(FOOD_PORRIDGE).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_MILK_BOWL=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(1).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> MILK_BOWL=ModItem.ITEMS.register("milk_bowl",()->
            new Item(new Item.Properties().food(FOOD_MILK_BOWL).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));
            
    public static final FoodProperties FOOD_WATER_BOWL=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(1).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> WATER_BOWL=ModItem.ITEMS.register("water_bowl",()->
            new Item(new Item.Properties().food(FOOD_WATER_BOWL).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_CEREAL=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(4).saturationModifier(0.25F).build();
    public static final RegistrySupplier<Item> CEREAL=ModItem.ITEMS.register("cereal",()->
            new Item(new Item.Properties().food(FOOD_CEREAL).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_PUMPKIN_SOUP=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(1).saturationModifier(1F).build();
    public static final RegistrySupplier<Item> PUMPKIN_SOUP=ModItem.ITEMS.register("pumpkin_soup",()->
            new Item(new Item.Properties().food(FOOD_PUMPKIN_SOUP).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_CREAM_OF_MUSHROOM_SOUP=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(5).saturationModifier(0.3334F).build();
    public static final RegistrySupplier<Item> CREAM_OF_MUSHROOM_SOUP=ModItem.ITEMS.register("cream_of_mushroom_soup",()->
            new Item(new Item.Properties().food(FOOD_CREAM_OF_MUSHROOM_SOUP).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_ONION=(new FoodProperties.Builder()).nutrition(1).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> ONION=ModItem.ITEMS.register("onion",()->
            new Item(new Item.Properties().food(FOOD_ONION).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_VEGETABLE_SOUP=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(6).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> VEGETABLE_SOUP=ModItem.ITEMS.register("vegetable_soup",()->
            new Item(new Item.Properties().food(FOOD_VEGETABLE_SOUP).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_CREAM_OF_VEGETABLE_SOUP=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(7).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> CREAM_OF_VEGETABLE_SOUP=ModItem.ITEMS.register("cream_of_vegetable_soup",()->
            new Item(new Item.Properties().food(FOOD_CREAM_OF_VEGETABLE_SOUP).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_CHICKEN_SOUP=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(10).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> CHICKEN_SOUP=ModItem.ITEMS.register("chicken_soup",()->
            new Item(new Item.Properties().food(FOOD_CHICKEN_SOUP).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_BEEF_STEW=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(16).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> BEEF_STEW=ModItem.ITEMS.register("beef_stew",()->
            new Item(new Item.Properties().food(FOOD_BEEF_STEW).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_ORANGE=(new FoodProperties.Builder()).nutrition(2).saturationModifier(0.25F).build();
    public static final RegistrySupplier<Item> ORANGE=ModItem.ITEMS.register("orange",()->
            new Item(new Item.Properties().food(FOOD_ORANGE).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_SORBET=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(4).saturationModifier(0.25F).build();
    public static final RegistrySupplier<Item> SORBET=ModItem.ITEMS.register("sorbet",()->
            new Item(new Item.Properties().food(FOOD_SORBET).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_CHEESE=(new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> CHEESE=ModItem.ITEMS.register("cheese",()->
            new Item(new Item.Properties().food(FOOD_CHEESE).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_MASHED_POTATO=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(12).saturationModifier(0.3334F).build();
    public static final RegistrySupplier<Item> MASHED_POTATO=ModItem.ITEMS.register("mashed_potato",()->
            new Item(new Item.Properties().food(FOOD_MASHED_POTATO).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_ICE_CREAM=(new FoodProperties.Builder()).usingConvertsTo(Items.BOWL).nutrition(5).saturationModifier(0.4F).build();
    public static final RegistrySupplier<Item> ICE_CREAM=ModItem.ITEMS.register("ice_cream",()->
            new Item(new Item.Properties().food(FOOD_ICE_CREAM).stacksTo(4).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_DOUGH=(new FoodProperties.Builder()).nutrition(2).saturationModifier(0.75F).build();
    public static final RegistrySupplier<Item> DOUGH=ModItem.ITEMS.register("dough",()->
            new Item(new Item.Properties().food(FOOD_DOUGH).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_BANANA=(new FoodProperties.Builder()).nutrition(2).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> BANANA=ModItem.ITEMS.register("banana",()->
            new Item(new Item.Properties().food(FOOD_BANANA).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_COPPER_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> COPPER_MILK_BUCKET=ModItem.ITEMS.register("copper_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_COPPER_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_SILVER_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> SILVER_MILK_BUCKET=ModItem.ITEMS.register("silver_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_SILVER_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_GOLDEN_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> GOLDEN_MILK_BUCKET=ModItem.ITEMS.register("golden_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_GOLDEN_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_ANCIENT_METAL_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> ANCIENT_METAL_MILK_MILK_BUCKET=ModItem.ITEMS.register("ancient_metal_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_ANCIENT_METAL_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_MITHRIL_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> MITHRIL_MILK_BUCKET=ModItem.ITEMS.register("mithril_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_MITHRIL_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_ADAMANTIUM_MILK_BUCKET=(new FoodProperties.Builder()).nutrition(4).saturationModifier(0F).build();
    public static final RegistrySupplier<Item> ADAMANTIUM_MILK_BUCKET=ModItem.ITEMS.register("adamantium_milk_bucket",()->
            new Item(new Item.Properties().food(FOOD_ADAMANTIUM_MILK_BUCKET).stacksTo(1).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_WORM=(new FoodProperties.Builder()).nutrition(1).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> WORM=ModItem.ITEMS.register("worm",()->
            new Item(new Item.Properties().food(FOOD_WORM).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final FoodProperties FOOD_COOKED_WORM=(new FoodProperties.Builder()).nutrition(1).saturationModifier(0.5F).build();
    public static final RegistrySupplier<Item> COOKED_WORM=ModItem.ITEMS.register("cooked_worm",()->
            new Item(new Item.Properties().food(FOOD_COOKED_WORM).stacksTo(16).arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static void register(){

    }
}
