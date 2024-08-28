package fun.moystudio.mite_ctm.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MITHRIL_CHAIN=ITEMS.register("mithril_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银锁链
    public static final RegistrySupplier<Item> COPPER_CHAIN=ITEMS.register("copper_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//铜锁链
    public static final RegistrySupplier<Item> GOLDEN_CHAIN=ITEMS.register("golden_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//金锁链
    public static final RegistrySupplier<Item> RUSTED_IRON_CHAIN=ITEMS.register("rusted_iron_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//铁锈锁链
    public static final RegistrySupplier<Item> IRON_CHAIN=ITEMS.register("iron_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//铁锁链
    public static final RegistrySupplier<Item> ANCIENT_METAL_CHAIN=ITEMS.register("ancient_metal_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属锁链
    public static final RegistrySupplier<Item> ADAMANTIUM_CHAIN=ITEMS.register("adamantium_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼锁链


    public static final RegistrySupplier<Item> MITHRIL_ARROW=ITEMS.register("mithril_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银箭
    public static final RegistrySupplier<Item> FLINT_ARROW=ITEMS.register("flint_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//燧石箭
    public static final RegistrySupplier<Item> OBSIDIAN_ARROW=ITEMS.register("obsidian_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//黑曜石箭
    public static final RegistrySupplier<Item> COPPER_ARROW=ITEMS.register("copper_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//铜箭
    public static final RegistrySupplier<Item> SILVER_ARROW=ITEMS.register("silver_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//银箭
    public static final RegistrySupplier<Item> GOLDEN_ARROW=ITEMS.register("golden_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//金箭
    public static final RegistrySupplier<Item> RUSTED_IRON_ARROW=ITEMS.register("rusted_iron_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//锈铁箭
    public static final RegistrySupplier<Item> IRON_ARROW=ITEMS.register("iron_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//铁箭
    public static final RegistrySupplier<Item> ANCIENT_METAL_ARROW=ITEMS.register("ancient_metal_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属箭
    public static final RegistrySupplier<Item> ADAMANTIUM_ARROW=ITEMS.register("adamantium_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼箭


    public static final RegistrySupplier<Item> MITHRIL_INGOT=ITEMS.register("mithril_ingot",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银锭
    public static final RegistrySupplier<Item> SILVER_INGOT=ITEMS.register("silver_ingot",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//银锭
    public static final RegistrySupplier<Item> ANCIENT_METAL=ITEMS.register("ancient_metal",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属锭
    public static final RegistrySupplier<Item> ADAMANTIUM_INGOT=ITEMS.register("adamantium_ingot",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼锭


    public static final RegistrySupplier<Item> COPPER_COIN=ITEMS.register("copper_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//铜币
    public static final RegistrySupplier<Item> GOLD_COIN=ITEMS.register("gold_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//金币
    public static final RegistrySupplier<Item> SILVER_COIN=ITEMS.register("silver_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//银币
    public static final RegistrySupplier<Item> IRON_COIN=ITEMS.register("iron_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//铁币
    public static final RegistrySupplier<Item> ANCIENT_METAL_COIN=ITEMS.register("ancient_metal_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属币
    public static final RegistrySupplier<Item> MITHRIL_COIN=ITEMS.register("mithril_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银币
    public static final RegistrySupplier<Item> ADAMANTIUM_COIN=ITEMS.register("adamantium_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼币
    
    
    public static final RegistrySupplier<Item> RAW_MITHRIL=ITEMS.register("raw_mithril",()->
            new Item(new Item.Properties().stacksTo(4).arch$tab(CreativeModeTabs.INGREDIENTS)));//粗秘银
    public static final RegistrySupplier<Item> RAW_SILVER=ITEMS.register("raw_silver",()->
            new Item(new Item.Properties().stacksTo(4).arch$tab(CreativeModeTabs.INGREDIENTS)));//粗银
    public static final RegistrySupplier<Item> RAW_ADAMANTIUM=ITEMS.register("raw_adamantium",()->
            new Item(new Item.Properties().stacksTo(4).arch$tab(CreativeModeTabs.INGREDIENTS)));//粗艾德曼



    public static final RegistrySupplier<Item> COPPER_NUGGETS=ITEMS.register("copper_nuggets",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//铜粒
    public static final RegistrySupplier<Item> SILVER_NUGGETS=ITEMS.register("silver_nuggets",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//银粒
    public static final RegistrySupplier<Item> ANCIENT_METAL_NUGGETS=ITEMS.register("ancient_metal_nuggets",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属粒
    public static final RegistrySupplier<Item> MITHRIL_NUGGETS=ITEMS.register("mithril_nuggets",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银粒
    public static final RegistrySupplier<Item> ADAMANTIUM_NUGGETS=ITEMS.register("adamantium_nuggets",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼粒


    public static final RegistrySupplier<Item> FLINT_CHIPS=ITEMS.register("flint_chips",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//燧石碎片
    public static final RegistrySupplier<Item> OBSIDIAN_CHIPS=ITEMS.register("obsidian_chips",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//黑曜石碎片
    public static final RegistrySupplier<Item> EMERALD_CHIPS=ITEMS.register("emerald_chips",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//绿宝石碎片
    public static final RegistrySupplier<Item> DIAMOND_CHIPS=ITEMS.register("diamond_chips",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//钻石碎片
    public static final RegistrySupplier<Item> NETHER_QUARTZ_SHARD=ITEMS.register("nether_quartz_shard",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//下界石英碎片
    public static final RegistrySupplier<Item> GLASS_SHARD=ITEMS.register("glass_shard",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//玻璃碎片


    public static final RegistrySupplier<Item> COPPER_BUCKET=ITEMS.register("copper_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//铜桶
    public static final RegistrySupplier<Item> SILVER_BUCKET=ITEMS.register("silver_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//银桶
    public static final RegistrySupplier<Item> GOLDEN_BUCKET=ITEMS.register("golden_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//金桶
    public static final RegistrySupplier<Item> ANCIENT_METAL_BUCKET=ITEMS.register("ancient_metal_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//远古金属桶
    public static final RegistrySupplier<Item> MITHRIL_BUCKET=ITEMS.register("mithril_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银桶
    public static final RegistrySupplier<Item> ADAMANTIUM_BUCKET=ITEMS.register("adamantium_bucket",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//艾德曼桶


    public static final RegistrySupplier<Item> BILIBILI_COIN=ITEMS.register("bilibili_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//币（？）


    public static void register(){
        ITEMS.register();
    }
}
