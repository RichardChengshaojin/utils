package pattern.iterator_composite.composite;

import java.util.Iterator;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
