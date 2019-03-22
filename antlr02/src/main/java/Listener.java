import com.google.googlejavaformat.java.Formatter;
import io.github.optjava.generated.Java9Lexer;
import io.github.optjava.generated.Java9Parser;
import io.github.optjava.generated.Java9Parser.AnnotationTypeDeclarationContext;
import io.github.optjava.generated.Java9Parser.CompilationUnitContext;
import io.github.optjava.generated.Java9Parser.EnumDeclarationContext;
import io.github.optjava.generated.Java9Parser.ImportDeclarationContext;
import io.github.optjava.generated.Java9Parser.NormalClassDeclarationContext;
import io.github.optjava.generated.Java9Parser.NormalInterfaceDeclarationContext;
import io.github.optjava.generated.Java9Parser.PackageDeclarationContext;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Listener extends AbstractJava9Listener {

  CommonTokenStream tokens = null;
  Java9Parser parser = null;
  String wholeSource = "";

  public static void main(String[] args) throws Exception {
    OkHttpClient client = new OkHttpClient();
    Request request =
        new Request.Builder()
            .url("https://github.com/javacommons/TIL/raw/master/testdata/B.java")
            .get()
            .build();
    Response response = client.newCall(request).execute();
    String text = response.body().string();
    System.out.println(text);
    CharStream stream = CharStreams.fromString(text);
    Listener l = new Listener();
    ParseTree tree = l.parse(stream);
    String formattedSource = new Formatter().formatSource(l.wholeSource);
    System.out.println(formattedSource);
    String format2 = new Formatter().formatSource(l.unparse(tree));
    System.out.println(format2);
    System.out.println(tree.toString());
    System.out.println(tree.getPayload().getClass().getName());
    System.out.println(tree.getChildCount());
  }

  public ParseTree parse(CharStream stream) {
    try {
      final Java9Lexer lexer = new Java9Lexer(stream);
      this.tokens = new CommonTokenStream(lexer);
      this.parser = new Java9Parser(tokens);
      ParseTree tree = parser.compilationUnit();
      System.out.println(tree.toStringTree(parser));
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(this, tree);
      return tree;
    } catch (IllegalArgumentException iae) {
      throw iae;
    }
  }

  public String unparse(ParseTree tree) {
    Interval interval = tree.getSourceInterval();
    int start = interval.a;
    int stop = interval.b;
    if (start < 0 || stop < 0) return "";
    // this.tokens.fill();
    if (stop >= tokens.size()) stop = tokens.size() - 1;
    StringBuilder buf = new StringBuilder();
    for (int i = start; i <= stop; i++) {
      Token t = tokens.get(i);
      if (t.getType() == Token.EOF) break;
      if (i > start) buf.append(" ");
      buf.append(t.getText());
    }
    return buf.toString();
  }

  public String unparse(ParserRuleContext ctx) {
    Interval interval = ctx.getSourceInterval();
    int start = interval.a;
    int stop = interval.b;
    if (start < 0 || stop < 0) return "";
    // this.tokens.fill();
    if (stop >= tokens.size()) stop = tokens.size() - 1;
    StringBuilder buf = new StringBuilder();
    for (int i = start; i <= stop; i++) {
      Token t = tokens.get(i);
      if (t.getType() == Token.EOF) break;
      if (i > start) buf.append(" ");
      buf.append(t.getText());
    }
    return buf.toString();
  }

  @Override
  public void enterCompilationUnit(CompilationUnitContext ctx) {
    System.out.println("enterCompilationUnit(): " + unparse(ctx));
    this.wholeSource = unparse(ctx);
  }

  @Override
  public void enterPackageDeclaration(PackageDeclarationContext ctx) {
    System.out.println("enterPackageDeclaration(): " + unparse(ctx));
    System.out.println("<" + unparse(ctx.packageName()).replaceAll(" ", "") + ">");
  }

  @Override
  public void enterImportDeclaration(ImportDeclarationContext ctx) {
    System.out.println("enterImportDeclaration(): " + unparse(ctx));
  }

  @Override
  public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
    System.out.println("enterNormalClassDeclaration(): " + unparse(ctx.identifier()));
    System.out.println("enterNormalClassDeclaration(): " + unparse(ctx));
  }

  @Override
  public void enterEnumDeclaration(EnumDeclarationContext ctx) {
    System.out.println("EnumDeclarationContext(): " + unparse(ctx.identifier()));
    System.out.println("EnumDeclarationContext(): " + unparse(ctx));
  }

  @Override
  public void enterNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
    System.out.println("enterNormalInterfaceDeclaration(): " + unparse(ctx.identifier()));
    System.out.println("enterNormalInterfaceDeclaration(): " + unparse(ctx));
  }

  @Override
  public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
    System.out.println("enterAnnotationTypeDeclaration(): " + unparse(ctx.identifier()));
    System.out.println("enterAnnotationTypeDeclaration(): " + unparse(ctx));
  }
}
