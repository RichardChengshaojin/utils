package pattern.template_method.pattern_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/10
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
