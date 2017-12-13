package pattern.factory.abstract_factory;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/30
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
