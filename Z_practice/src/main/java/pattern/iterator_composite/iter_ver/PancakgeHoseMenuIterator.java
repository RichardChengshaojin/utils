package pattern.iterator_composite.iter_ver;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class PancakgeHoseMenuIterator implements Iterator<MenuItem> {

    private List<MenuItem> items;

    private int index = 0;

    public PancakgeHoseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public MenuItem next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return items.get(index++);
    }
}
