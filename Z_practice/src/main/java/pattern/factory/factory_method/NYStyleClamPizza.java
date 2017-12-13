package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        setName("New York Style Original Clam Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
