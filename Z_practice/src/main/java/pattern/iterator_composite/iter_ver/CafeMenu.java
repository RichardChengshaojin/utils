package pattern.iterator_composite.iter_ver;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/16
 */
public class CafeMenu implements Menu {

    private Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
