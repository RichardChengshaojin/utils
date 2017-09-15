package pattern.strategy.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class FlyRocketPowerd implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用火箭推进器飞");
    }
}
