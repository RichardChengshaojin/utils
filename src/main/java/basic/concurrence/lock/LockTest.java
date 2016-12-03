package basic.concurrence.lock;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class LockTest {

    public static void fun() {
        synchronized (LockTest.class) {
            try {
                System.out.println("LookTest, fun sleep 5s");
                Thread.sleep(5 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        UseLock.useLock();
//        LockTest.fun();
        byte[] bs = new byte[2];
        bs[0] = 0x36;
        bs[1] = 0x31;
        System.out.println(new String(bs));
    }
}
