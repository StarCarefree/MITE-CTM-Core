package fun.moystudio.mite_ctm.mixin;

import com.mojang.authlib.GameProfile;
import dev.architectury.platform.Platform;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin extends Player {
    @Shadow public abstract boolean isCreative();

    @Shadow public abstract boolean setGameMode(GameType arg);

    @Shadow public abstract boolean isSpectator();

    @Shadow public abstract void sendSystemMessage(Component arg);

    @Shadow @Final public ServerPlayerGameMode gameMode;

    public ServerPlayerMixin(Level level, BlockPos blockPos, float f, GameProfile gameProfile) {
        super(level, blockPos, f, gameProfile);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    public void tickMixin(CallbackInfo ci){//作弊检测
        if((this.isCreative()||this.isSpectator()) && !Platform.isDevelopmentEnvironment()){
            this.sendSystemMessage(Component.translatable("chat.mite_ctm.cheating",this.getGameProfile().getName(),this.gameMode.getGameModeForPlayer().getName()));
            this.setGameMode(GameType.SURVIVAL);
        }
    }

}
