package pattern.decorator.new_v;

/**
 * 饮料类
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public abstract class Beverage {

    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;

    protected String description;

    protected int size;

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}
