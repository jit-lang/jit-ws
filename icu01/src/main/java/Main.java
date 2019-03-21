import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Enumeration;

import com.ibm.icu.charset.CharsetICU;
import com.ibm.icu.text.Transliterator;

public class Main {

	public static void main(String[] args) throws Exception {
		Transliterator transliterator = Transliterator.getInstance("Fullwidth-Halfwidth");
		String result = transliterator.transliterate("アイウガギグ１２３①￥％＄");
		System.out.println(result);
		printAvailableIDs();
		CharBuffer chbuf = CharBuffer.wrap("あいうえおかきくけこ");

		//Charset charset = Charset.forName("Shift_JIS");
		Charset charset = CharsetICU.forNameICU("MS932");
		CharsetEncoder encoder = charset.newEncoder();

		// Charset#encode を使用
		ByteBuffer result1 = charset.encode(chbuf);
		// CharsetEncoder#encode を使用
		ByteBuffer result2 = encoder.encode(chbuf);
		System.out.println(result1.array());
		System.out.println(result2.array());
		System.out.println(new String(result1.array(), "MS932"));
		System.out.println( charset.decode(result1).toString());
	}

	static void printAvailableIDs() {
		Enumeration e = Transliterator.getAvailableIDs();
		String tmp = "";
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement().toString());
		}
	}

}
