package pattern.factory.factory_method;

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
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoStyleGreekPizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
