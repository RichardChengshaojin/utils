package algorithm.esay;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * @author chengshaojin
 * @since 2016/9/2.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse3(1534236469));
        System.out.println(r.reverse3(-1234));

        System.out.println(Integer.toBinaryString(0x7FFFFFFF));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE & 0x7FFFFFFF);
    }

    public int reverse(int x) {
        String str = String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        if (x < 0) {
            reverse = reverse.substring(0, reverse.length() - 1);
            reverse = "-" + reverse;
        }
        int r = 0;
        try {
            r = Integer.parseInt(reverse);
        } catch (Exception e) {
            // do noting
        }
        return r;
    }

    public int reverse1(int x) {
        if (0 == x) {
            return 0;
        }

        int signBit;
        int y = x;
        if (x >= 0) {
            signBit = 1;
        } else {
            signBit = -1;
            y = -x;
        }

        int digit = 1;
        int tmp = y;
        while ((y = y / 10) != 0) {
            digit++;
        }

        y = tmp;
        int[] reverseDigit = new int[digit];
        int i = 0;
        while (0 != y) {
            reverseDigit[i++] = y % 10;
            y /= 10;
        }

        int reverse = 0;
        long real = 0;
        for (i = 0; i < digit; i++) {
            reverse += reverseDigit[i] * (int) Math.pow(10, (digit - i - 1));
            real += (long) reverseDigit[i] * (long) Math.pow(10, (digit - i - 1));
            if (reverse != real) {
                return 0;
            }
        }

        return signBit > 0 ? reverse : -reverse;
    }

    public int reverse2(int x) {
        int b = 0;
        long real = 0;
        while (x != 0) {
            int digit = x % 10;
            b = b * 10 + digit;
            // overflow
            real = real * 10 + digit;
            if (real != b) {
                return 0;
            }
            x /= 10;
        }
        return b;
    }

    public int reverse3(int x) {
        int b = 0;
        while (x != 0) {
            // overflow
            if (b > Integer.MAX_VALUE / 10 || b < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            b = b * 10 + digit;
            x /= 10;
        }
        return b;
    }
}
