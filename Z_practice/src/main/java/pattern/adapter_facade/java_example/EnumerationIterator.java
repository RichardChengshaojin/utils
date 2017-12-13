package pattern.adapter_facade.java_example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/9
 */
public class EnumerationIterator<E> implements Iterator<E> {

    private Enumeration<E> eEnumeration;

    public EnumerationIterator(Enumeration<E> eEnumeration) {
        this.eEnumeration = eEnumeration;
    }

    @Override
    public boolean hasNext() {
        return eEnumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return eEnumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
