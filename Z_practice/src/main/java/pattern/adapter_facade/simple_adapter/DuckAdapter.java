package pattern.adapter_facade.simple_adapter;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/7
 */
public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
