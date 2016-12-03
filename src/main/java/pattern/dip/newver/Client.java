package pattern.dip.newver;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new ChineseDriver();
        ICar benz = new Benz();
        ICar bmw = new BMW();

        driver.drive(benz);
        driver.drive(bmw);
    }
}
