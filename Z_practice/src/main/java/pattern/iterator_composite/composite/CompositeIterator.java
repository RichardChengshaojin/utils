package pattern.iterator_composite.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent next = (MenuComponent) iterator.next();
            if (next instanceof Menu) {
                stack.push(next.createIterator());
            }
            return next;
        }
        return null;
    }
}
