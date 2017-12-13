package pattern.decorator.old_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Most Excellent Dark Roast.";
    }

    @Override
    public double cost() {
        return 0.99 + super.cost();
    }
}
