package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Troll extends Character {

    public Troll(){
        setWeaponBehavior(new KnifeBehavior());
    }
}
