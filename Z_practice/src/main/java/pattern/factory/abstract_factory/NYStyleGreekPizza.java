package pattern.factory.abstract_factory;

/**
 * GreekPizza
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class NYStyleGreekPizza extends Pizza {

    private PizzaIngredientFactory factory;

   public NYStyleGreekPizza(PizzaIngredientFactory factory) {
       this.factory = factory;
       setName("New York Style Original Greek Pizza");
   }

    @Override
    public void prepare() {
        System.out.println("准备" + getName());
        this.setDough(factory.createDough());
        this.setSauce(factory.createSauce());
        this.setCheese(factory.createCheese());
    }

    @Override
    public void box() {
        System.out.println("用产自中国的盒子包装");
    }
}
