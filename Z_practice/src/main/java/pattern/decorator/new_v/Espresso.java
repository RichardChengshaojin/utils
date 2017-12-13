package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Espresso extends Beverage {

    public Espresso(int size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
