package pattern.factory.factory_method;


/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public class MakePizza {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        nyStore.orderPizza("veggie");
        System.out.println();
        chicagoStore.orderPizza("veggie");
    }
}
