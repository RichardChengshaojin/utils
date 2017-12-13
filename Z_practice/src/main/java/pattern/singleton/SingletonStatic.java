package pattern.singleton;

/**
 * 单例类-静态成员实现
 * 特点：急切加载
 * 优点: 多线程安全
 * <p>
 * 与静态内部类实现相似，也是用静态成员来保持实例，区别是改实现方法将静态成员放到了外部类；
 * 这样就无法保证是懒加载的了。静态成员直接在外部类中，那么久可以以其他(除了getInstance()方法)主动使用类的方式，导致静态成员被初始化。
 * 其多线程安全也是由JVM保证。
 * @author chengshaojin
 * @since 2017/11/2
 */
public class SingletonStatic {

    private static SingletonStatic instance = new SingletonStatic();

    private SingletonStatic() {
        System.out.println("constructor");
    }

    public static SingletonStatic getInstance() {
        return instance;
    }
}
