package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class HouseBlend extends Beverage {

    public HouseBlend(int size) {
        description = "House Blend";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
