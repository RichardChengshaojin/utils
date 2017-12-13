package pattern.adapter_facade.java_example;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/9
 */
public class IteratorEnumerationTest {

    private static void traverse(Enumeration<?> e) {
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + "\t");
        }
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("1");
        ls.add("2");
        ls.add("3");

        traverse(new IteratorEnumeration<>(ls.iterator()));
    }
}
