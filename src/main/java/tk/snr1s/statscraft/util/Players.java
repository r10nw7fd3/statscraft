package tk.snr1s.statscraft.util;

import org.bukkit.Bukkit;

public class Players {
    public static String getPlayers() { return Bukkit.getServer().getOnlinePlayers().size() + " / " + Bukkit.getServer().getMaxPlayers(); }
}
