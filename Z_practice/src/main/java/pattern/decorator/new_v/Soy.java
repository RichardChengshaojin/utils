package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
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
            cost += 0.1;
        }
        if (getSize() == Beverage.GRANDE) {
            cost += 0.15;
        }
        if (getSize() == Beverage.VENTI) {
            cost += 0.2;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
