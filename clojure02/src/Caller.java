public class Caller {
    public static void main(String[] args) {
        System.out.println(Foo.bar("Clojure"));
        Foo.fuga();

        Foo f = new Foo();
        System.out.println(f.echo("foo"));
    }
}