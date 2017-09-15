package pattern.strategy.old_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("吱吱叫...");
    }

    @Override
    public void display() {
        System.out.println("I am Rubber Duck.");
    }
}
