package fun.moystudio.mite_ctm;

import dev.architectury.platform.Platform;
import fun.moystudio.mite_ctm.block.ModBlock;
import fun.moystudio.mite_ctm.effect.ModEffect;
import fun.moystudio.mite_ctm.event.ModEvent;
import fun.moystudio.mite_ctm.feature.ModPlacedFeature;
import fun.moystudio.mite_ctm.item.ModFood;
import fun.moystudio.mite_ctm.item.ModItem;
import fun.moystudio.mite_ctm.keymapping.ModKeyMapping;
import net.fabricmc.api.EnvType;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public final class MITE_CTM {
    public static final String MOD_ID = "mite_ctm";
    public static Logger LOGGER=LogManager.getLogger("Minecraft Is Too Easy:Cataclysm");
    public static void init() {
        LOGGER.info("Initalizing MITE-CTM!");
        ModEffect.register();
        ModEvent.register();//一定得在Block前面！！！！！
        ModBlock.register();//一定得在Item前面！！！！！
        ModFood.register();//一定得在Item前面！！！！！
        ModItem.register();
        ModPlacedFeature.register();
        if(Platform.getEnv().equals(EnvType.CLIENT)) {
            ModKeyMapping.register();
        }
        LOGGER.info("\n"+
                "  __  __  _                                  __  _     _____        _______              ______                        _____        _                _                        \n" +
                " |  \\/  |(_)                                / _|| |   |_   _|      |__   __|            |  ____|                   _  / ____|      | |              | |                       \n" +
                " | \\  / | _  _ __    ___   ___  _ __  __ _ | |_ | |_    | |   ___     | |  ___    ___   | |__    __ _  ___  _   _ (_)| |      __ _ | |_  __ _   ___ | | _   _  ___  _ __ ___  \n" +
                " | |\\/| || || '_ \\  / _ \\ / __|| '__|/ _` ||  _|| __|   | |  / __|    | | / _ \\  / _ \\  |  __|  / _` |/ __|| | | |   | |     / _` || __|/ _` | / __|| || | | |/ __|| '_ ` _ \\ \n" +
                " | |  | || || | | ||  __/| (__ | |  | (_| || |  | |_   _| |_ \\__ \\    | || (_) || (_) | | |____| (_| |\\__ \\| |_| | _ | |____| (_| || |_| (_| || (__ | || |_| |\\__ \\| | | | | |\n" +
                " |_|  |_||_||_| |_| \\___| \\___||_|   \\__,_||_|   \\__| |_____||___/    |_| \\___/  \\___/  |______|\\__,_||___/ \\__, |(_) \\_____|\\__,_| \\__|\\__,_| \\___||_| \\__, ||___/|_| |_| |_|\n" +
                "                                                                                                             __/ |                                       __/ |                \n" +
                "                                                                                                            |___/                                       |___/                 ");
        //闲的没事搞了个字符画(它看起来不好看，但是实际输出是正常的)
    }
}
