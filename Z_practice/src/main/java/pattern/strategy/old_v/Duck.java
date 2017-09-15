package pattern.strategy.old_v;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public abstract class Duck {

    public void quack() {
        System.out.println("quack, quack, quack...");
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void fly() {
        System.out.println("I can fly");
    }

    public abstract void display();
}
