package tk.snr1s.statscraft;

import org.bukkit.plugin.java.JavaPlugin;
import tk.snr1s.statscraft.func.ClearLag;
import tk.snr1s.statscraft.util.TPS;


public class Main extends JavaPlugin {
    public static long pluginEnableTime;
    @Override
    public void onEnable() {
        getServer().getScheduler().scheduleSyncRepeatingTask(this, new TPS(), 100L, 1L);
        getCommand("statscraft").setExecutor(new Cmd(this));
        pluginEnableTime = System.currentTimeMillis();
        getLogger().info("Enabled");
    }

    @Override
    public void onDisable() { getLogger().info("Disabled"); }
}
