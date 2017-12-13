package pattern.iterator_composite.old_ver;

import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class Waitress {

    private PancakeHoseMenu pancakeHoseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHoseMenu pancakeHoseMenu, DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHoseMenu = pancakeHoseMenu;
    }

    public void printMenu() {
        List<MenuItem> menuItems = pancakeHoseMenu.getMenuItems();
        System.out.println("MENU\n----\nBREAKFAST");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
        System.out.println("\nLUNCH");
        MenuItem[] menuItems1 = dinerMenu.getMenuItems();
        for (int i = 0; i < menuItems1.length; i++) {
            System.out.println(menuItems1[i]);
        }
    }
}
