package pattern.singleton;

/**
 * 简单单例类实现
 * 特点：懒加载
 * 优点:实现简单
 * 缺点:多线程下不安全
 *
 * @author chengshaojin
 * @since 2017/11/1
 */
public class SingletonSimple {

    private static SingletonSimple instance;

    /**
     * 基本思想是将构造器私有化，只能在本来调用，外部无法调用；以此来控制外部类对单例类实例的创建
     * 但是还是可以通过反射的方法获取实例
     */
    private SingletonSimple() {

    }

    public static SingletonSimple getInstance() {
        if (null == instance) {
            instance = new SingletonSimple();
        }
        return instance;
    }
}
