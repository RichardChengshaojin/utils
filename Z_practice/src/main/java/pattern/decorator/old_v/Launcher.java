package pattern.decorator.old_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Launcher {

    public static void main(String[] args) {
        DarkRoast original = new DarkRoast();
        System.out.println(String.format("原味深培：$%.2f", original.cost()));

        DarkRoast milkAndMocha = new DarkRoast();
        milkAndMocha.setMilk(true);
        milkAndMocha.setMocha(true);
        System.out.println(String.format("牛奶摩卡深培：$%.2f", milkAndMocha.cost()));
    }
}
