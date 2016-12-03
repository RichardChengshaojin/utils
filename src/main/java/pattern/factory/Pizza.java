package pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Pizzas' father
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public abstract class Pizza {

    private String name;

    private String dough;

    private String sauce;

    private List<String> toppings = new ArrayList<>();

    /**
     * prepare pizza
     */
    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String s : toppings) {
            System.out.println("\t" + s);
        }
    }

    /**
     * bake pizza
     */
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * cut pizza
     */
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * box pizza
     */
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
