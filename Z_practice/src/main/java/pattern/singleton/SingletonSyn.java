package pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例类-同步实现方法
 * 特点：懒加载
 * 优点:实现简单，多线程安全
 * 缺点:多线程下开销大
 *
 * @author chengshaojin
 * @since 2017/11/1
 */
public class SingletonSyn {

    private static SingletonSyn instance;

    private SingletonSyn() {
    }

    /**
     * 通过同步整个方法的方式，实现多线程环境下只有一个线程能进入方法
     * 但是只有实例未创建的第一次实例请求才需要同步，所以在多线程环境下开销很大
     *
     * @return 实例
     */
    public synchronized static SingletonSyn getInstance() {
        if (null == instance) {
            instance = new SingletonSyn();
        }
        return instance;
    }
}
