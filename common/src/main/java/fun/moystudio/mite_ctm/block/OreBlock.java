package fun.moystudio.mite_ctm.block;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;

public class OreBlock extends DropExperienceBlock {

    public OreBlock(float harvest, int xpmin, int xpmax){
        super(UniformInt.of(xpmin,xpmax),Properties.ofFullCopy(Blocks.DIAMOND_ORE).strength(harvest));
    }
    public OreBlock(float harvest, SoundType sound, int xpmin, int xpmax){
        super(UniformInt.of(xpmin,xpmax),Properties.ofFullCopy(Blocks.DIAMOND_ORE).strength(harvest).sound(sound));
    }
    public OreBlock(float harvest, SoundType sound, float time, int xpmin,int xpmax){
        super(UniformInt.of(xpmin,xpmax),Properties.ofFullCopy(Blocks.DIAMOND_ORE).strength(harvest).sound(sound).destroyTime(time));
    }
    public OreBlock(IntProvider intProvider, Properties properties) {
        super(intProvider, properties);
    }
}
