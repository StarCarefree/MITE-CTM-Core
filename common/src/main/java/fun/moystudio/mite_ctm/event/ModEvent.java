package fun.moystudio.mite_ctm.event;

import dev.architectury.event.events.common.CommandRegistrationEvent;
import fun.moystudio.mite_ctm.command.CommandStats;

public class ModEvent {
    public static void register() {
        CommandRegistrationEvent.EVENT.register(((dispatcher, registry, selection) -> {
            CommandStats.register(dispatcher);
        }));
    }
}
