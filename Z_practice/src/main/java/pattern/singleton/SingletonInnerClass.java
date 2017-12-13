package pattern.singleton;

/**
 * 单例类-静态内部类实现
 * 特点：懒加载
 * 优点: 多线程安全
 * 缺点: 理解上有难度
 *
 * @author chengshaojin
 * @since 2017/11/1
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    public static SingletonInnerClass getInstance() {
        // 主动使用静态内部类的静态成员，导致第一次调用时，JVM进行初始化实例
        return SingletonHolder.instance;
    }

    /**
     * 根据JVM初始化类的规则，只有当类被主动使用时，JVM才会对类进行初始化，static成员是在初始化时期被初始化，且只初始化一次；
     * <p>
     * 线程安全由JVM保证; 主动使用静态内部类的静态成员，导致第一次调用时，JVM进行初始化实例，即使有多个线程同时在未初始化之前请求，JVM
     * 也会保证静态内部类的静态成员instance只初始化一次。
     * <p>
     * 这里的静态内部类声明为私有，在其外部类的外部无法引用到它；因此其初始化时间完全依赖外部类的主动使用。
     */
    private static class SingletonHolder {
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }
}
