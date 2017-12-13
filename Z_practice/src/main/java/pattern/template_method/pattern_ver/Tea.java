package pattern.template_method.pattern_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/10
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
