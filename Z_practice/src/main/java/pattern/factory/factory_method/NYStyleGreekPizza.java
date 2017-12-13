package pattern.factory.factory_method;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStyleGreekPizza extends Pizza {

   public NYStyleGreekPizza() {
       setName("New York Style Original Greek Pizza");
       setDough("Extra Thin Crust Dough");
       setSauce("Potato Sauce");
       addTopping("大虾");
   }

    @Override
    public void box() {
        System.out.println("用产自中国的盒子包装");
    }
}
