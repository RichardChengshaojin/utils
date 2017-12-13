package pattern.factory.simple_factory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class MakePizza {

    public static void main(String[] args) {
        pattern.factory.simple_factory.PizzaStore store = new pattern.factory.simple_factory.PizzaStore(new SimplePizzaFactory());
        store.orderPizza("veggie");
    }
}
