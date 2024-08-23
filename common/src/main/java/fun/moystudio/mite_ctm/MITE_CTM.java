package fun.moystudio.mite_ctm;

import fun.moystudio.mite_ctm.item.ModItem;

public final class MITE_CTM {
    public static final String MOD_ID = "mite_ctm";

    public static void init() {
        System.out.println("[Minecraft Is Too Easy] Initalizing MITE-CTM!");
        ModItem.register();
    }
}
