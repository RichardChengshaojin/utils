package pattern.factory.abstract_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class ChicagoStyleCheesePizza extends Pizza {

    private PizzaIngredientFactory factory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
        setName(" ChicagoStyleOriginal Cheese Pizza");
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("准备" + getName());
        this.setDough(factory.createDough());
        this.setSauce(factory.createSauce());
        this.setCheese(factory.createCheese());
        this.setClams(factory.createClam());
    }
}
