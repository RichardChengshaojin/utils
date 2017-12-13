package pattern.adapter_facade.java_example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/9
 */
public class IteratorEnumeration<E> implements Enumeration<E> {

    private Iterator<E> it;

    public IteratorEnumeration(Iterator<E> it) {
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public E nextElement() {
        return it.next();
    }
}
