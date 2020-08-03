package tk.snr1s.statscraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static tk.snr1s.statscraft.util.CoreVersion.getCoreVersion;
import static tk.snr1s.statscraft.util.Disk.getServerSize;
import static tk.snr1s.statscraft.util.Memory.getFreeMemory;
import static tk.snr1s.statscraft.Messages.formatSN;
import static tk.snr1s.statscraft.util.Players.getPlayers;
import static tk.snr1s.statscraft.util.TPS.getTPS;
import static tk.snr1s.statscraft.util.Uptime.getUptime;

public class Cmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("statscraft")) {
            if(!sender.hasPermission("statscraft")) {
                sender.sendMessage(Messages.PERMERR);
                return true;
            }
            sender.sendMessage(Messages.LINE);
            sender.sendMessage(formatSN("TPS")+getTPS());
            sender.sendMessage(formatSN("Core version")+getCoreVersion());
            sender.sendMessage(formatSN("Uptime")+getUptime());
            sender.sendMessage(formatSN("Free memory")+getFreeMemory());
            sender.sendMessage(formatSN("Disk space used")+getServerSize());
            sender.sendMessage(formatSN("Players")+getPlayers());
            sender.sendMessage(Messages.LINE);
        }
        return true;
    }
}