package pattern.factory.abstract_factory;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/30
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new ChicagoStyleCheesePizza(factory);
                break;
            case "greek":
                pizza = new ChicagoStyleGreekPizza(factory);
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza(factory);
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza(factory);
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza(factory);
                break;
        }
        return pizza;
    }
}
