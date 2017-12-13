package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}
