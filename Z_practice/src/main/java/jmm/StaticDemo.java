package jmm;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/19
 */
public class StaticDemo {

    public static String staticString = getString();

    static {
        System.out.println("<clinit>-StaticDemo");
    }

    public static void staticFun() {
        System.out.println("...static fun");
        System.out.println("static method invoked");
    }

    public static String getString() {
        return "static string";
    }

    public StaticDemo() {
        System.out.println("construct method invoked");
    }

    public void fun() {
        System.out.println("common method invoked");
    }
}
