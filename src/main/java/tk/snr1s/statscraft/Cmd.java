package tk.snr1s.statscraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static tk.snr1s.statscraft.CoreVersion.getCoreVersion;
import static tk.snr1s.statscraft.Disk.getServerSize;
import static tk.snr1s.statscraft.Memory.getFreeMemory;
import static tk.snr1s.statscraft.TPS.getTPS;
import static tk.snr1s.statscraft.Uptime.getUptime;

public class Cmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("statscraft")) {
            if(!sender.hasPermission("statscraft")) {
                sender.sendMessage(Messages.PERMERR);
                return true;
            }
            sender.sendMessage(Messages.LINE);
            sender.sendMessage(Messages.PREFIX+ChatColor.GREEN+"TPS"+ChatColor.GRAY+" - "+ChatColor.YELLOW+getTPS());
            sender.sendMessage(Messages.PREFIX+ChatColor.GREEN+"Core version"+ChatColor.GRAY+" - "+ChatColor.YELLOW+getCoreVersion());
            sender.sendMessage(Messages.PREFIX+ChatColor.GREEN+"Uptime"+ChatColor.GRAY+" - "+ChatColor.YELLOW+getUptime());
            sender.sendMessage(Messages.PREFIX+ChatColor.GREEN+"Free memory"+ChatColor.GRAY+" - "+ChatColor.YELLOW+getFreeMemory());
            sender.sendMessage(Messages.PREFIX+ChatColor.GREEN+"Disk space used by server"+ChatColor.GRAY+" - "+ChatColor.YELLOW+getServerSize());
            sender.sendMessage(Messages.LINE);
        }
        return true;
    }
}
