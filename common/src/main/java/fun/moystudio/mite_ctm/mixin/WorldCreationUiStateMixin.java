package fun.moystudio.mite_ctm.mixin;

import net.minecraft.client.gui.screens.worldselection.WorldCreationContext;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

@Mixin(WorldCreationUiState.class)
public class WorldCreationUiStateMixin {
    @Shadow private WorldCreationUiState.SelectedGameMode gameMode;

    @Inject(method = "<init>",at = @At("TAIL"))
    public void initMixin(Path path, WorldCreationContext worldCreationContext, Optional optional, OptionalLong optionalLong, CallbackInfo ci){
        this.gameMode=WorldCreationUiState.SelectedGameMode.HARDCORE;
    }
}
