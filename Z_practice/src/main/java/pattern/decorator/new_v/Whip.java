package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += 0.05;
        }
        if (getSize() == Beverage.GRANDE) {
            cost += 0.1;
        }
        if (getSize() == Beverage.VENTI) {
            cost += 0.15;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
