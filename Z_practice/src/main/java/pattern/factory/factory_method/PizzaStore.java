package pattern.factory.factory_method;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza == null) {
            System.out.println("没有这种披萨哦");
        } else {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
