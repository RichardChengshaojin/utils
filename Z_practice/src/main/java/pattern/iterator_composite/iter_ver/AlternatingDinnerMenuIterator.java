package pattern.iterator_composite.iter_ver;

import java.util.Calendar;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class AlternatingDinnerMenuIterator implements java.util.Iterator<MenuItem> {

    private MenuItem[] items;
    private int position;

    public AlternatingDinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || null == items[position]);
    }

    @Override
    public MenuItem next() {
        position += 2;
        return items[position];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
