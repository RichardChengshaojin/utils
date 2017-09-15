package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Queen extends Character {

    public Queen(){
        setWeaponBehavior(new BowAndArrowBehavior());
    }
}
