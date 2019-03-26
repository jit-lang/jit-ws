import java.io.FileInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class JitIO {
    public static String readFileUtf8(String fileName) throws Exception {
        return IOUtils.toString(new FileInputStream(fileName), StandardCharsets.UTF_8);
    }

    public static String readHttpUtf8(String url) throws Exception {
        return IOUtils.toString(new URL(url), StandardCharsets.UTF_8);
    }

    public static void writeln(int x) {
        System.out.println(x);
    }
}
