package basic.concurrence.lock;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class UseLock {

    public static void useLock() {
        synchronized (LockTest.class) {
            try {
                System.out.println("UseLock, sleep 5s...");
                Thread.sleep(5 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
