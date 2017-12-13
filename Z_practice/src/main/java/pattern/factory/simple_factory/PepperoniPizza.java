package pattern.factory.simple_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        setName("Original Pepperoni Pizza");
        setDough("超厚");
        setSauce("不加糖");
        addTopping("我要加牛肉");
    }
}
