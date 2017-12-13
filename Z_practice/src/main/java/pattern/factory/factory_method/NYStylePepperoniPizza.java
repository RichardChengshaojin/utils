package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        setName("New York Style Original Pepperoni Pizza");
        setDough("超厚");
        setSauce("不加糖");
        addTopping("我要加牛肉");
    }
}
