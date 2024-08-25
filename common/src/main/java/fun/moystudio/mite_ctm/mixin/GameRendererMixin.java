package fun.moystudio.mite_ctm.mixin;

import fun.moystudio.mite_ctm.MITE_CTM;
import fun.moystudio.mite_ctm.keymapping.ModKeyMapping;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "getFov",at = @At("RETURN"),cancellable = true)
    private void getFovMixin(Camera camera, float f, boolean bl, CallbackInfoReturnable<Double> cir){
        cir.setReturnValue(ModKeyMapping.ZOOM_KEYMAPPING.isDown() ? 30.0D : cir.getReturnValueD());
    }
}
