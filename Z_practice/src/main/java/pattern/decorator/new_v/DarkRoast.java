package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class DarkRoast extends Beverage {

    public DarkRoast(int size) {
        description = "Dark Roast.";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
