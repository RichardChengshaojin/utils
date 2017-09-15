package pattern.dip.oldver;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driveBenz(new Benz());
    }
}
