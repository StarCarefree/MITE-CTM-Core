package fun.moystudio.mite_ctm.mixin;

import com.mojang.authlib.GameProfile;
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
    public void tickMixin(CallbackInfo ci){
        if(this.isCreative()||this.isSpectator()){
            this.sendSystemMessage(Component.nullToEmpty("§c§l[CHEATING DETECTOR]§4"+this.getGameProfile().getName()+" §cchanged gamemode to "+this.gameMode.getGameModeForPlayer().getName()+"!\n§b§l[MITE-CTM] §cprevented this behavior!"));
            this.setGameMode(GameType.SURVIVAL);
        }
    }

}
