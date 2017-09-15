package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("用弓箭射...");
    }
}
