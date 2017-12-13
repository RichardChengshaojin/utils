package pattern.factory.simple_factory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
        }
        return pizza;
    }
}
