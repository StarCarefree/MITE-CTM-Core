package fun.moystudio.mite_ctm.neoforge;

import fun.moystudio.mite_ctm.MITE_CTM;
import net.neoforged.fml.common.Mod;

@Mod(MITE_CTM.MOD_ID)
public final class MITE_CTMNeoForge {
    public MITE_CTMNeoForge() {
        // Run our common setup.
        MITE_CTM.init();
    }
}
