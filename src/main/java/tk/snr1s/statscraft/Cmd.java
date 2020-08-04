package tk.snr1s.statscraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import tk.snr1s.statscraft.func.ClearLag;

import static tk.snr1s.statscraft.util.CoreVersion.getCoreVersion;
import static tk.snr1s.statscraft.util.Disk.getServerSize;
import static tk.snr1s.statscraft.util.Memory.getFreeMemory;
import static tk.snr1s.statscraft.Messages.formatSN;
import static tk.snr1s.statscraft.util.Players.getPlayers;
import static tk.snr1s.statscraft.util.TPS.getTPS;
import static tk.snr1s.statscraft.util.Uptime.getUptime;

public class Cmd implements CommandExecutor {

    private Plugin plugin;
    public Cmd(Plugin plugin) { this.plugin = plugin; }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("statscraft")) {
            if (!sender.hasPermission("statscraft.use")) {
                sender.sendMessage(Messages.PERMERR);
                return true;
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.BLUE+"\nStatsCraft plugin by snr1s_");
                sender.sendMessage(ChatColor.BLUE+"/statscraft info "+ChatColor.GRAY+"for stats");
                sender.sendMessage(ChatColor.BLUE+"/statscraft clear "+ChatColor.GRAY+"to clear world");
                sender.sendMessage("\n");
            }
            else if (args.length == 1 && args[0].equalsIgnoreCase("info")) {
                sender.sendMessage("\n");
                sender.sendMessage(formatSN("TPS") + getTPS());
                sender.sendMessage(formatSN("Core version") + getCoreVersion());
                sender.sendMessage(formatSN("Uptime") + getUptime());
                sender.sendMessage(formatSN("Free memory") + getFreeMemory());
                sender.sendMessage(formatSN("Disk space used") + getServerSize());
                sender.sendMessage(formatSN("Players") + getPlayers());
                sender.sendMessage("\n");
            }
            else if (args.length == 1 && args[0].equalsIgnoreCase("clear")) {
                sender.sendMessage(ClearLag.clear(sender));
            }
            else sender.sendMessage(Messages.BADARGERR);
        }
        return true;
    }
}