package pattern.template_method.pattern_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/10
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Puring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
