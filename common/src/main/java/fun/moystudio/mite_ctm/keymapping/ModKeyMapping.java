package fun.moystudio.mite_ctm.keymapping;

import com.mojang.blaze3d.platform.InputConstants;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;

public class ModKeyMapping {
    public static final KeyMapping ZOOM_KEYMAPPING=new KeyMapping(
            "key.mite_ctm.zoom",
            InputConstants.Type.KEYSYM,
            InputConstants.KEY_Z,
            "category.mite_ctm.main");
    public static void register(){
        KeyMappingRegistry.register(ZOOM_KEYMAPPING);
    }
}
