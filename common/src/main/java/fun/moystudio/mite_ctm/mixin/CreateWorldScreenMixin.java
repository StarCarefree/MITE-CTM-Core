package fun.moystudio.mite_ctm.mixin;

import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.components.tabs.GridLayoutTab;
import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Difficulty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.ArrayList;

@Mixin(CreateWorldScreen.class)
public abstract class CreateWorldScreenMixin {
    @Mixin(CreateWorldScreen.GameTab.class)
    public abstract static class CreateWorldScreenGameTabMixin extends GridLayoutTab {
        public CreateWorldScreenGameTabMixin(Component component) {
            super(component);
        }

        @ModifyArg(method = "<init>",at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/CycleButton$Builder;withValues([Ljava/lang/Object;)Lnet/minecraft/client/gui/components/CycleButton$Builder;"))
        public <T> T[] initMixin1(T[] objects){
            if(objects instanceof WorldCreationUiState.SelectedGameMode[]){
                return (T[]) new WorldCreationUiState.SelectedGameMode[]{WorldCreationUiState.SelectedGameMode.HARDCORE};
            }
            else if(objects instanceof Difficulty[]){
                return (T[]) new Difficulty[]{Difficulty.HARD};
            }
            return objects;
        }

    }
}
