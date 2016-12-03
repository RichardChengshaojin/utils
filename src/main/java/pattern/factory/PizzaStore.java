package pattern.factory;

import pattern.factory.factory.SimplePizzaFactory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.simplePizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        if(null == pizza) {
            System.out.println("No such pizza");
        }else {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
