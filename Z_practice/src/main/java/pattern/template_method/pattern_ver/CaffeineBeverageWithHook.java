package pattern.template_method.pattern_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/15
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
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
