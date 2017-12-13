package pattern.decorator.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Launcher {

    public static void main(String[] args) {
        Beverage b1 = new Espresso(Beverage.TALL);
        System.out.println(String.format("%s->$%.2f", b1.getDescription(), b1.cost()));

        Beverage b2 = new DarkRoast(Beverage.GRANDE);
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(String.format("%s->$%.2f", b2.getDescription(), b2.cost()));

        Beverage b3 = new HouseBlend(Beverage.VENTI);
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(String.format("%s->$%.2f", b3.getDescription(), b3.cost()));
    }
}
