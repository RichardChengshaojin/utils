package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        setName(" ChicagoStyleOriginal Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
