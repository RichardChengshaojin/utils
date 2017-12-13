package pattern.iterator_composite.composite;

import java.util.Iterator;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
            MenuComponent next = (MenuComponent) iterator.next();
            try {
                if(next.isVegetarian()) {
                    next.print();
                }
            }catch (UnsupportedOperationException e) {
                // suppress
            }
        }
    }
}
