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
	Map<Integer, String> ruleIndexMap = new HashMap<Integer, String>();
	Map<Integer, String> tokenTypeMap = new HashMap<Integer, String>();

	// メイン
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.asList(args));
		String text = JitIO.readFileUtf8("src/main/java/Sample2.java");
		System.out.println(text);
	    Sample1 p = new Sample1();
		ParseTree tree = p.parse(text);
		p.dump(tree);
	}

	public ParseTree parse(String text) throws Exception {
		CharStream stream = CharStreams.fromString(text);
		Java9Lexer lexer = new Java9Lexer(stream);
		this.tokens = new CommonTokenStream(lexer);
		this.parser = new Java9Parser(tokens);
		Map<String, Integer> ruleIndexMapReverse = this.parser.getRuleIndexMap();
		this.ruleIndexMap.clear();
		for(Entry<String, Integer> entry: ruleIndexMapReverse.entrySet()) {
			this.ruleIndexMap.put(entry.getValue(), entry.getKey());
		}
		Map<String, Integer> tokenTypeMapReverse = this.parser.getTokenTypeMap();
		this.tokenTypeMap.clear();
		for(Entry<String, Integer> entry: tokenTypeMapReverse.entrySet()) {
			this.tokenTypeMap.put(entry.getValue(), entry.getKey());
		}
		ParseTree tree = parser.compilationUnit();
		//System.out.println(tree.toStringTree(parser));
		return tree;
	}

	public void dump(ParseTree tree) {
		System.out.println(tree.toStringTree(this.parser));
		System.out.println(tree.toStringTree());
		System.out.println(tree.getPayload().getClass().getName());
		System.out.println(tree.getPayload().getClass().getSimpleName());
		ParserRuleContext prc = (ParserRuleContext) tree.getPayload();
		System.out.println( prc.getRuleIndex());
		System.out.println( this.ruleIndexMap.get(prc.getRuleIndex()));
		System.out.println(tree.getChildCount());
	}
}
