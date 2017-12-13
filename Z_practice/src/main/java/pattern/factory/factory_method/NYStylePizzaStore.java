package pattern.factory.factory_method;

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
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "greek":
                pizza = new NYStyleGreekPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
