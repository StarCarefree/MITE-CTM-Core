package fun.moystudio.mite_ctm.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

public class IngotBlock extends Block {
    public IngotBlock(float harvest) {
        super(Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(harvest).requiresCorrectToolForDrops());
    }
    public IngotBlock(float harvest, SoundType sound) {
        super(Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(harvest).requiresCorrectToolForDrops().sound(sound));
    }
    public IngotBlock(float harvest, SoundType sound, float time) {
        super(Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).strength(harvest).destroyTime(time).requiresCorrectToolForDrops());
    }
    public IngotBlock(){
        super(Properties.ofFullCopy(Blocks.DIAMOND_BLOCK));
    }
    public IngotBlock(Properties properties){
        super(properties);
    }
}