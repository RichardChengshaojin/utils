package pattern.strategy.example;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Character {

    private WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
