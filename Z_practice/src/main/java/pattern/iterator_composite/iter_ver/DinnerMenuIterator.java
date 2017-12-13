package pattern.iterator_composite.iter_ver;

import java.util.*;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class DinnerMenuIterator implements java.util.Iterator<MenuItem> {

    private MenuItem[] items;

    private int position = 0;

    private int lastRtn = -1;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && null != items[position];
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        lastRtn = position;
        return items[position++];
    }

    @Override
    public void remove() {
        if (lastRtn < 0) {
            throw new IllegalStateException();
        }
        // remove and move
        System.arraycopy(items, lastRtn + 1, items, lastRtn, items.length - 1 - lastRtn);
        position = lastRtn;
        lastRtn = -1;
    }
}
