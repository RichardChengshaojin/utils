package pattern.factory.abstract_factory;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/30
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new NYStyleCheesePizza(factory);
                break;
            case "greek":
                pizza = new NYStyleGreekPizza(factory);
                break;
            case "clam":
                pizza = new NYStyleClamPizza(factory);
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza(factory);
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza(factory);
                break;
        }
        return pizza;
    }
}
