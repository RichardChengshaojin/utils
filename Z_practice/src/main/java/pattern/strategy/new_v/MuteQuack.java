package pattern.strategy.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
