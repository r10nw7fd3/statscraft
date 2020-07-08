package tk.snr1s.statscraft;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class Disk {
    public static final String getServerSize() {
        long bytes = FileUtils.sizeOfDirectory(new File("."));
        long mb = 1024 * 1024;
        long diskUsed = bytes / mb;
        return diskUsed + "mb";
    }
}
