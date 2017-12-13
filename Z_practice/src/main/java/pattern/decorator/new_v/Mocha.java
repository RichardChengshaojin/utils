package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
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
            cost += 0.15;
        }
        if (getSize() == Beverage.GRANDE) {
            cost += 0.2;
        }
        if (getSize() == Beverage.VENTI) {
            cost += 0.25;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
