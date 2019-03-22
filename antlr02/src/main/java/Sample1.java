import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import io.github.optjava.generated.Java9Lexer;
import io.github.optjava.generated.Java9Parser;

public class Sample1 {

	CommonTokenStream tokens = null;
	Java9Parser parser = null;

	// メイン
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.asList(args));
		String text = JitIO.readFileUtf8("src/main/java/Sample2.java");
		System.out.println(text);
		//System.out.println(
		//    JitIO.readHttpUtf8("https://github.com/javacommons/TIL/raw/master/testdata/B.java"));
	    Sample1 l = new Sample1();
		ParseTree tree = l.parse(text);
		Map<String, Integer> ruleIndexMap = l.parser.getRuleIndexMap();
		Map<Integer, String> ruleIndexMap2 = new HashMap<Integer, String>();
		for(Entry<String, Integer> entry: ruleIndexMap.entrySet()) {
			ruleIndexMap2.put(entry.getValue(), entry.getKey());
		}
		System.out.println(tree.toStringTree(l.parser));
		System.out.println(tree.toStringTree());
		System.out.println(tree.getPayload().getClass().getName());
		System.out.println(tree.getPayload().getClass().getSimpleName());
		ParserRuleContext prc = (ParserRuleContext) tree.getPayload();
		System.out.println( prc.getRuleIndex());
		System.out.println( ruleIndexMap2.get(prc.getRuleIndex()));
		//System.out.println( prc.getAltNumber());
		//System.out.println(Arrays.asList(l.parser.tokenNames));
		System.out.println(tree.getChildCount());
	}

	public ParseTree parse(String text) {
		try {
		    CharStream stream = CharStreams.fromString(text);
			Java9Lexer lexer = new Java9Lexer(stream);
			this.tokens = new CommonTokenStream(lexer);
			this.parser = new Java9Parser(tokens);
			ParseTree tree = parser.compilationUnit();
			//System.out.println(tree.toStringTree(parser));
			return tree;
		} catch (IllegalArgumentException iae) {
			throw iae;
		}
	}
}
