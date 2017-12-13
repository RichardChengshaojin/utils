package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        setName("New York Style Original Veggie Pizza");
        setDough("中厚");
        setSauce("多糖");
        addTopping("加个西红柿");
    }
}
