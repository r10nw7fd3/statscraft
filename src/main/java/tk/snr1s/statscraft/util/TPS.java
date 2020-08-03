package tk.snr1s.statscraft.util;

import java.text.DecimalFormat;

public class TPS implements Runnable {
    public static int TICK_COUNT = 0;
    public static long[] TICKS = new long[600];

    public static String getTPS() {
        if (TICK_COUNT < 100) return "Please wait";
        int target = (TICK_COUNT - 1 - 100) % TICKS.length;
        long elapsed = System.currentTimeMillis() - TICKS[target];
        DecimalFormat formatter = new DecimalFormat("#.##");
        String tps = String.valueOf(100 / (elapsed / 1000.0D));
        tps = tps.replace(",", ".");
        return formatter.format(Double.parseDouble(tps));
    }

    public void run() {
        TICKS[(TICK_COUNT % TICKS.length)] = System.currentTimeMillis();
        TICK_COUNT += 1;
    }
}