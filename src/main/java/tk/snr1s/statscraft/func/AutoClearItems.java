package tk.snr1s.statscraft.func;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.Plugin;

import static org.bukkit.Bukkit.getServer;

public class AutoClearItems implements Listener {

    private Plugin plugin;
    public AutoClearItems(Plugin plugin) { this.plugin = plugin; }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        if (plugin.getConfig().getBoolean("autoclearitems-enabled")) getServer().getScheduler().runTaskLater(plugin, () -> e.getItemDrop().remove(), plugin.getConfig().getLong("autoclearitems-itemlifetime-ticks"));
    }
}
