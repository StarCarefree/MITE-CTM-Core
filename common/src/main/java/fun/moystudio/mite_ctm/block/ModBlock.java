package fun.moystudio.mite_ctm.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fun.moystudio.mite_ctm.MITE_CTM;
import fun.moystudio.mite_ctm.item.ModItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(MITE_CTM.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Block> MITHRIL_BLOCK=registerBlock("mithril_block",()->
            new IngotBlock(5.0F, SoundType.STONE));
    public static final RegistrySupplier<Block> MITHRIL_ORE=registerBlock("mithril_ore",()->
            new OreBlock(3.0F,SoundType.STONE,2,4));
    private static <T extends Block>RegistrySupplier<T> registerBlock(String name, Supplier<T> block){
        RegistrySupplier<T> toReturn = BLOCKS.register(name,block);
        registryBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistrySupplier<Item> registryBlockItem(String name,RegistrySupplier<T> block){
        return ModItem.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }
    public static void register(){
        BLOCKS.register();
    }
}
