package fun.moystudio.mite_ctm.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.Difficulty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.IntFunction;

@Mixin(Difficulty.class)
public abstract class DifficultyMixin {
    @Inject(method = "getDisplayName",at = @At("HEAD"), cancellable = true)
    public void getDisplayNameMixin(CallbackInfoReturnable<Component> cir){
        cir.setReturnValue(Component.translatable("gui.mite_ctm.difficulty"));
    }
    @Inject(method = "getInfo",at = @At("HEAD"), cancellable = true)
    public void getInfoMixin(CallbackInfoReturnable<Component> cir){
        cir.setReturnValue(Component.translatable("gui.mite_ctm.difficulty.info"));
    }
}
