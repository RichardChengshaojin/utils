package pattern.iterator_composite.iter_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class Waitress {

    private Menu pancakeHoseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHoseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHoseMenu = pancakeHoseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeHoseMenu.createIterator());
        System.out.println("\nLUNCH");
        printMenu(dinerMenu.createIterator());
        System.out.println("\nDINNER");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
