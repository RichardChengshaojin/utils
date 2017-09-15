package pattern.factory.pizzaentity;

import pattern.factory.Pizza;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        setName("Original Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("Grated Reggiano Cheese");
    }
}
