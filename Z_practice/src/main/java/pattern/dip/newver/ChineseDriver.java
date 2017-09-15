package pattern.dip.newver;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public class ChineseDriver implements IDriver {
    @Override
    public void drive(ICar car) {
        System.out.println("On the right side of the road:");
        car.run();
    }
}
