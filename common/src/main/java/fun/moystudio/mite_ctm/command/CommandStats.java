package fun.moystudio.mite_ctm.command;

import com.mojang.brigadier.CommandDispatcher;
import fun.moystudio.mite_ctm.manager.FoodDataManager;
import fun.moystudio.mite_ctm.pubilc_interface.IFoodDataManager;
import net.minecraft.commands.CommandSourceStack;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentUtils;
import net.minecraft.world.entity.player.Player;

public class CommandStats {
    public CommandStats(){}
    public static void register(CommandDispatcher<CommandSourceStack> commandDispatcher){
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal("stats").requires((x) -> {
            return x.isPlayer();
        })).executes((context) -> {
            FoodDataManager foodDataManager=((IFoodDataManager)((CommandSourceStack)context.getSource()).getPlayer().getFoodData()).get();
            Player player=((CommandSourceStack) context.getSource()).getPlayer();
            ((CommandSourceStack)context.getSource()).sendSuccess(() -> {
                return Component.translatable("command.mite_ctm.stats",player.getGameProfile().getName(),player.getGameProfile().getId().toString(),Integer.toString(player.experienceLevel),Integer.toString(player.totalExperience),Integer.toString(foodDataManager.getPtt()),Integer.toString(foodDataManager.getPtn()));
            }, false);
            return 1;
        }));
    }
}
