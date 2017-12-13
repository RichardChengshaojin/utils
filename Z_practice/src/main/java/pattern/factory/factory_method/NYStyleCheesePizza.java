package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        setName("New York Style Original Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
