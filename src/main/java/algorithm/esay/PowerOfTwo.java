package algorithm.esay;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * @author chengshaojin
 * @since 2016/9/1.
 */
public class PowerOfTwo {

    public static void main(String[] args) {
//        PowerOfTwo test = new PowerOfTwo();
//        System.out.println(test.isPowerOfTwo4(1));
//        System.out.println(test.isPowerOfTwo4(0));
//        System.out.println(test.isPowerOfTwo4(31241));
//        for (int i = 0; i < 31; i++) {
//            System.out.print(String.format("case %d : \n", (long) Math.pow(2, i)));
//        }
    }

    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (0 == (n & (n - 1)));
    }

    public boolean isPowerOfTwo1(int n) {
        long k = Integer.MAX_VALUE + 1;
        return n > 0 && k % n == 0;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && n == (n & -n);
    }

    public boolean isPowerOfTwo3(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        while (0 == (n & 1)) {
            n = n >> 1;
            if (n == 1) return true;
        }
        return false;
    }

    public boolean isPowerOfTwo4(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        int x = n;
        int y = 1;
        while (x > 1) {
            x >>= 1;
            y <<= 1;
        }
        return y == n;
    }

    public boolean isPowerOfTwo5(int n) {

        if (n == 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public boolean isPowerOfTwo6(int n) {
        if (n < 0)
            return false;
        int x = n, y = 1;
        while (x > 1) {
            x >>= 1;
            y <<= 1;
        }
        return y == n;
    }

    public boolean isPowerOfTwo7(int n) {
        if (n == 1)
            return true;
        if (n == Integer.MIN_VALUE)
            return false;
        String bint = Integer.toBinaryString(n);
        if (bint.charAt(0) != '1')
            return false;
        String bint1 = bint.substring(1);
        return !bint1.contains("1");
    }

    public boolean isPowerOfTwo8(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt == 1;
    }
}
