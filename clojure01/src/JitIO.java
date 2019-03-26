import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class JitIO {
    public static String readFileUtf8(String fileName) throws Exception {
        return IOUtils.toString(new FileInputStream(fileName), StandardCharsets.UTF_8);
    }

    public static String readHttpUtf8(String url) throws Exception {
        return IOUtils.toString(new URL(url), StandardCharsets.UTF_8);
    }

    /*
    public static String readResUtf8(String name) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(name);
        System.out.println(url.toString());
        File myFile = new File(url.toURI());
        String content = FileUtils.readFileToString(myFile, "UTF-8");
        return content;
    }
    */

    public static String readResUtf8(String name) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        InputStream stream = classLoader.getResourceAsStream(name);
        String content = IOUtils.toString(stream, "UTF-8");
        return content;
    }

    public static void writeln(int x) {
        System.out.println(x);
    }
}
