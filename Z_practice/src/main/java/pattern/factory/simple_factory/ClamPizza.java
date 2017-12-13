package pattern.factory.simple_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        setName("Original Clam Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
