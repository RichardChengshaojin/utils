package pattern.factory;

import pattern.factory.factory.SimplePizzaFactory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class MakePizza {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("veggie");
    }
}
