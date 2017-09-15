package pattern.strategy.new_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class Launcher {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        System.out.println("=====================");
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("=====================");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("After modification...");
        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
    }
}
