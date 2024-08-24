package fun.moystudio.mite_ctm;

import fun.moystudio.mite_ctm.block.ModBlock;
import fun.moystudio.mite_ctm.event.ModEvent;
import fun.moystudio.mite_ctm.item.ModItem;

public final class MITE_CTM {
    public static final String MOD_ID = "mite_ctm";

    public static void init() {
        System.out.println("[Minecraft Is Too Easy] Initalizing MITE-CTM!");
        ModBlock.register();//一定得在Item前面！！！！！
        ModItem.register();
        ModEvent.register();
    }
}
