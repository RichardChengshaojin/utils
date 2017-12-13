package pattern.iterator_composite.iter_ver;

import java.util.*;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class PancakeHoseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHoseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public java.util.Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
