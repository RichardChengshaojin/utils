package pattern.factory.abstract_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStylePepperoniPizza extends Pizza {

    private PizzaIngredientFactory factory;

    public NYStylePepperoniPizza(PizzaIngredientFactory factory) {
        setName("New York Style Pepperoni Pizza");
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("准备" + getName());
        this.setDough(factory.createDough());
        this.setSauce(factory.createSauce());
        this.setCheese(factory.createCheese());
    }
}
