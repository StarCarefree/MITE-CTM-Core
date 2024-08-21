package fun.moystudio.mite_ctm.fabric;

import fun.moystudio.mite_ctm.MITE_CTM;
import net.fabricmc.api.ModInitializer;

public final class MITE_CTMFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        MITE_CTM.init();
    }
}
