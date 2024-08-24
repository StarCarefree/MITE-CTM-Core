package fun.moystudio.mite_ctm.event;

import dev.architectury.event.events.common.PlayerEvent;
import fun.moystudio.mite_ctm.item.ModItem;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class ModEvent {
    public static void register() {
        PlayerEvent.CRAFT_ITEM.register((Player player, ItemStack consrtucted, Container inventory) ->{
            if (consrtucted.getItem().equals(ModItem.MITHRIL_COIN.get())) {
                if (player.totalExperience >=2500) {
                    player.giveExperiencePoints(-2500);
                }
            }
        });
    }
}
