package pattern.factory.abstract_factory;


/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class ChicagoStyleClamPizza extends Pizza {

    private PizzaIngredientFactory factory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory factory) {
        setName(" ChicagoStyleOriginal Clam Pizza");
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("准备" + getName());
        this.setDough(factory.createDough());
        this.setSauce(factory.createSauce());
        this.setCheese(factory.createCheese());
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
