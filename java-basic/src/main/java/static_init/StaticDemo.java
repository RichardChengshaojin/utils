package static_init;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/19
 */
public class StaticDemo {

    static {
        System.out.println("<clinit>-StaticDemo");
    }

    public void fun() {
        System.out.println("fun");
    }
}
