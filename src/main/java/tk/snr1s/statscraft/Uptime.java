package tk.snr1s.statscraft;

public class Uptime {
    public static String getUptime() {
        long UptimeMillis = System.currentTimeMillis() - Main.pluginEnableTime;
        long hours = (UptimeMillis / (1000 * 60 * 60)) % 24;
        long minutes = (UptimeMillis / (1000 * 60)) % 60;
        return hours+":"+minutes;
    }
}
