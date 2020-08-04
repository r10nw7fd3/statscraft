package tk.snr1s.statscraft.func;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import tk.snr1s.statscraft.Messages;

public class ClearLag {
    public static String clear(CommandSender sender) {
        if (!(sender instanceof Player)) {
            return Messages.NOTAPLAYERERR;
        }
        Player p = (Player) sender;
        for (Entity entity : p.getWorld().getEntities()) {
            if (entity instanceof Item || entity instanceof Animals || entity instanceof Monster) entity.remove();
        }
        return Messages.CLEREMOVED;
    }
}