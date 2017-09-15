package pattern.strategy.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
    }
}
