import com.google.common.base.Charsets;
import java.io.FileInputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;

public class JitIO {
  public static String readFileUtf8(String fileName) throws Exception {
    return IOUtils.toString(new FileInputStream(fileName), Charsets.UTF_8);
  }

  public static String readHttpUtf8(String url) throws Exception {
    return IOUtils.toString(new URL(url), Charsets.UTF_8);
  }

  public static void writeln(int x) {
    System.out.println(x);
  }
}
