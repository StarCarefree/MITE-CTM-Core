package fun.moystudio.mite_ctm;

import dev.architectury.platform.Platform;
import fun.moystudio.mite_ctm.block.ModBlock;
import fun.moystudio.mite_ctm.event.ModEvent;
import fun.moystudio.mite_ctm.feature.ModPlacedFeature;
import fun.moystudio.mite_ctm.item.ModItem;
import fun.moystudio.mite_ctm.keymapping.ModKeyMapping;
import net.fabricmc.api.EnvType;

public final class MITE_CTM {
    public static final String MOD_ID = "mite_ctm";
    public static void init() {
        System.out.println("[Minecraft Is Too Easy] Initalizing MITE-CTM!");
        ModEvent.register();//一定得在Block前面！！！！！
        ModBlock.register();//一定得在Item前面！！！！！
        ModItem.register();
        ModPlacedFeature.register();
        if(Platform.getEnv().equals(EnvType.CLIENT)) {
            ModKeyMapping.register();
        }
    }
}
