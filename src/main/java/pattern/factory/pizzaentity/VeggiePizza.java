package pattern.factory.pizzaentity;

import pattern.factory.Pizza;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class VeggiePizza extends Pizza {

   public VeggiePizza() {
       setName("Original Veggie Pizza");
       setDough("中厚");
       setSauce("多糖");
       addTopping("加个西红柿");
   }
}
