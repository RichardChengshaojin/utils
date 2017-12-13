package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Decaf extends Beverage {

    public Decaf(int size) {
        description = "Decaf";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
