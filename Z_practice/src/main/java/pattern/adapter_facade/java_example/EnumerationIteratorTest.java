package pattern.adapter_facade.java_example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/9
 */
public class EnumerationIteratorTest {

    private static void traverse(Iterator<?> it) {
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    }

    public static void main(String[] args) {
        Vector<String> vs = new Vector<>();
        vs.add("1");
        vs.add("2");
        vs.add("3");

        Enumeration<String> elements = vs.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + "\t");
        }

        System.out.println();
        traverse(new EnumerationIterator<>(vs.elements()));
    }
}
