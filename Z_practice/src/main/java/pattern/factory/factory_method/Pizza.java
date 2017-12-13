package pattern.factory.factory_method;

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
        System.out.println("准备" + name);
        System.out.println("生面团发酵中...");
        System.out.println("调味料添加中...");
        System.out.println("佐料添加: ");
        for (String s : toppings) {
            System.out.println("\t" + s);
        }
    }

    /**
     * bake pizza
     */
    public void bake(){
        System.out.println("在350摄氏度下烘焙25分钟");
    }

    /**
     * cut pizza
     */
    public void cut(){
        System.out.println("将披萨切片");
    }

    /**
     * box pizza
     */
    public void box(){
        System.out.println("将披萨装盒");
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
