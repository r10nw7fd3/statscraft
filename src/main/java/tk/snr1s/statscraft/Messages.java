package tk.snr1s.statscraft;

import org.bukkit.ChatColor;

public class Messages {
    public static final String PERMERR = ChatColor.RED+"You do not have permission to do that!";
    public static final String BADARGERR = ChatColor.RED+"Invalid argument, run "+ChatColor.BLUE+"/statscraft "+ChatColor.RED+"for help.";
    public static final String CLEREMOVED = ChatColor.BLUE+"All entities have been removed.";
    public static final String NOTAPLAYERERR = ChatColor.RED+"Only players can do this!";

    public static String formatSN(String statName) { return ChatColor.BLUE+statName+ChatColor.WHITE+" > "+ChatColor.BLUE; }
}