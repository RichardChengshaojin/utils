package pattern.adapter_facade.simple_adapter;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/3
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
