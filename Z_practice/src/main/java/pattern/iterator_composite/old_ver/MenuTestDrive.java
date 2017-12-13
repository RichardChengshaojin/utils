package pattern.iterator_composite.old_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHoseMenu pancakeHoseMenu = new PancakeHoseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHoseMenu, dinerMenu);
        waitress.printMenu();
    }
}
