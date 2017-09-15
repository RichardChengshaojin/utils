package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class King extends Character {

    public King(){
        setWeaponBehavior(new SwordBehavior());
    }
}
