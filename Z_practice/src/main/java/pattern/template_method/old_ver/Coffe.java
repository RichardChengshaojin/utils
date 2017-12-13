package pattern.template_method.old_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/10
 */
public class Coffe {

    void prepareRecipe() {
        boilWater();
        breCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Add Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void breCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
