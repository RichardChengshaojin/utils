package basic.io;

/**
 * desc
 *
 * @author chengshaojin
 * @since 2016/10/27.
 */
public class IOTest {

    public static int i;
    private String t;
    private String t1;

    public static String byte2String(byte b) {
        byte[] bs = new byte[1];
        bs[0] = b;
        return new String(bs);
    }

    public static void print(byte[] bs) {
        for (byte b :
                bs) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        System.out.println(0x70);
    }

    public String getT() throws Exception {
        throw new Exception();
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }
}