package pattern.adapter_facade.simple_adapter;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/3
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
