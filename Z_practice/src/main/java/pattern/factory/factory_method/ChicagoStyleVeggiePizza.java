package pattern.factory.factory_method;


/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class ChicagoStyleVeggiePizza extends Pizza {

   public ChicagoStyleVeggiePizza() {
       setName("ChicagoStyle Original Veggie Pizza");
       setDough("中厚");
       setSauce("多糖");
       addTopping("加个西红柿");
   }
}
