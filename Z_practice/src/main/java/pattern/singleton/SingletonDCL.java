package pattern.singleton;

/**
 * 单例类-双重校验锁 DCL (double checked locking 实现法)
 * 特点:懒加载
 * 优点:线程安全
 * 缺点:实现略复杂
 * @author chengshaojin
 * @since 2017/10/30
 */
public class SingletonDCL {

    // FIXME: volatile的作用 ?
    private static volatile SingletonDCL instance;

    private SingletonDCL() {

    }

    public static SingletonDCL getInstance() {
        // 实际上只有在instance没有被创建，第一次请求实例时，才有可能出现多线程情况下的多次创建实例
        // 第一层null判断有效解决第一次以后请求实例的同步效率问题
        if (null == instance) {
            synchronized (SingletonDCL.class) {
                // 若多线程下第一次请求实例，其中一个线程成功拿到锁，其他多个线程进入锁等待队列，
                // 当拿到锁的线程创建完实例释放锁时，第二层null判断使得其他在锁等待队列获得锁的线程不再创建实例
                if (null == instance) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
