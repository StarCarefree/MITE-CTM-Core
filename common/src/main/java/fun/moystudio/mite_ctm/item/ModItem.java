package fun.moystudio.mite_ctm.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> MITHRIL_INGOT=ITEMS.register("mithril_ingot",()->
            new Item(new Item.Properties().stacksTo(8)));//秘银锭
    public static final RegistrySupplier<Item> MITHRIL_NUGGETS=ITEMS.register("mithril_nuggets",()->
            new Item(new Item.Properties()));//秘银粒
    public static final RegistrySupplier<Item> MITHRIL_COIN=ITEMS.register("mithril_coin",()->
            new Item(new Item.Properties()));//秘银币
    public static final RegistrySupplier<Item> MITHRIL_CHAIN=ITEMS.register("mithril_chain",()->
            new Item(new Item.Properties().stacksTo(8)));//秘银锁链
    public static final RegistrySupplier<Item> MITHRIL_ARROW=ITEMS.register("mithril_arrow",()->
            new Item(new Item.Properties().stacksTo(16)));//秘银箭
    public static void register(){
        ITEMS.register();
    }
}
