package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Knight extends Character {

    public Knight(){
        setWeaponBehavior(new AxeBehavior());
    }
}
