package pattern.factory.simple_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class GreekPizza extends Pizza {

    public GreekPizza() {
        setName("Original Greek Pizza");
        setDough("Extra Thin Crust Dough");
        setSauce("Potato Sauce");
        addTopping("大虾");
    }

    @Override
    public void box() {
        System.out.println("用产自中国的盒子包装");
    }
}
