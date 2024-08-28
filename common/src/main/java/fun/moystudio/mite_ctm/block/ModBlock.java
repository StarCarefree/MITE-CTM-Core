package fun.moystudio.mite_ctm.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import fun.moystudio.mite_ctm.item.ModItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.BLOCK);
    private static <T extends Block>RegistrySupplier<T> registerBlock(String name, Supplier<T> block,int maxx){
        RegistrySupplier<T> rt = BLOCKS.register(name,block);
        registryBlockItem(name,rt,maxx);
        return rt;
    }
    private static <T extends Block>RegistrySupplier<Item> registryBlockItem(String name,RegistrySupplier<T> block,int maxx){
        return ModItem.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().stacksTo(maxx).arch$tab(CreativeModeTabs.INGREDIENTS)));
    }

    public static final RegistrySupplier<Block> MITHRIL_BLOCK=registerBlock("mithril_block",()->
            new IngotBlock(5F, SoundType.STONE),5);
    public static final RegistrySupplier<Block> SILVER_BLOCK=registerBlock("silver_block",()->
            new IngotBlock(5F, SoundType.STONE),3);
    public static final RegistrySupplier<Block> ADAMANTIUM_BLOCK=registerBlock("adamantium_block",()->
            new IngotBlock(5F, SoundType.STONE),6);


    public static final RegistrySupplier<Block> MITHRIL_ORE=registerBlock("mithril_ore",()->
            new OreBlock(3F,SoundType.STONE,2,4),4);
    public static final RegistrySupplier<Block> SILVER_ORE=registerBlock("silver_ore",()->
       new OreBlock(2F, SoundType.STONE,2,4),4);
    public static final RegistrySupplier<Block> ADAMANTIUM_ORE=registerBlock("adamantium_ore",()->
       new OreBlock(3F, SoundType.STONE,2,4),4);
    public static void register(){
        BLOCKS.register();
    }
}
