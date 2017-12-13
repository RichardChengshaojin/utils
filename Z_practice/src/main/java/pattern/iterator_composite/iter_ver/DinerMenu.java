package pattern.iterator_composite.iter_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);

        addItem("Soup ot the day", "Soup of the day, with a side of potato salad", false, 3.29);

        addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
            return;
        }
        menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
    }

    public java.util.Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
