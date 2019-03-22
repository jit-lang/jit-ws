import java.util.Arrays;

import org.antlr.v4.runtime.tree.ParseTree;

public class Sample1 {

	// メイン
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.asList(args));
		String text = JitIO.readFileUtf8("src/main/java/Sample2.java");
		System.out.println(text);
		CommonParser p = new CommonParser();
		ParseTree tree = p.parse("io.github.optjava.generated.Java9", "compilationUnit", text);
		p.dump(tree);
	}

}
