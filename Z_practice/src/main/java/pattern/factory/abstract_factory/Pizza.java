package pattern.factory.abstract_factory;

import java.util.Arrays;

/**
 * Pizzas' father
 *
 * @auther chengshaojin
 * @since 2016/11/29
 */
public abstract class Pizza {

    private String name;

    private Dough dough;

    private Sauce sauce;

    private Veggies[] veggies;

    private Cheese cheese;

    private Pepperoni pepperoni;

    private Clams clams;

    /**
     * prepare pizza
     */
    public abstract void prepare();

    /**
     * bake pizza
     */
    public void bake() {
        System.out.println("在350摄氏度下烘焙25分钟");
    }

    /**
     * cut pizza
     */
    public void cut() {
        System.out.println("将披萨切片");
    }

    /**
     * box pizza
     */
    public void box() {
        System.out.println("将披萨装盒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dough=").append(dough);
        sb.append(", sauce=").append(sauce);
        sb.append(", viggies=").append(Arrays.toString(veggies));
        sb.append(", cheese=").append(cheese);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append(", clams=").append(clams);
        sb.append('}');
        return sb.toString();
    }
}
