package fun.moystudio.mite_ctm.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> MITHRIL_INGOT=ITEMS.register("mithril_ingot",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银锭
    public static final RegistrySupplier<Item> MITHRIL_COIN=ITEMS.register("mithril_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银币
    public static final RegistrySupplier<Item> MITHRIL_CHAIN=ITEMS.register("mithril_chain",()->
            new Item(new Item.Properties().stacksTo(8).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银锁链
    public static final RegistrySupplier<Item> MITHRIL_ARROW=ITEMS.register("mithril_arrow",()->
            new Item(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.INGREDIENTS)));//秘银箭
    public static final RegistrySupplier<Item> RAW_MITHRIL=ITEMS.register("raw_mithril",()->
            new Item(new Item.Properties().stacksTo(4).arch$tab(CreativeModeTabs.INGREDIENTS)));//粗秘银

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
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//燧石碎片

    public static final RegistrySupplier<Item> BILIBILI_COIN=ITEMS.register("bilibili_coin",()->
            new Item(new Item.Properties().arch$tab(CreativeModeTabs.INGREDIENTS)));//币（？）

    public static void register(){
        ITEMS.register();
    }
}
