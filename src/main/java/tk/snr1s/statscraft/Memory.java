package tk.snr1s.statscraft;

public class Memory {
    public static String getFreeMemory() {
        long bytes = Runtime.getRuntime().freeMemory();
        long mb = 1024 * 1024;
        long freeMemory = bytes / mb;
        return freeMemory + "mb";
    }
}
