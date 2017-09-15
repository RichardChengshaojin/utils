package algorithm.esay;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * <p>
 * Example:
 * Given a = 1 and b = 2, return 3.
 * <p>
 * 解析：
 * 这道题要求不是用 + -运算，那么在运算符中只能考虑* /以及位运算<br/>
 * 1. 利用对数和指数的特性，可以完成 对 + 操作的转化，见getSum2<br/>
 * 2. 考虑二进制形式的加法运算：1001 0010 + 0110 1101 = 1111 1111，这个结果刚好和两个数的异或值相同；<br />
 * 考虑以下两个二进制数：1001 0010 + 0110 1011，它们异或的值是 1111 1001，并不等于它们的和，
 * 那么当同一位的值不同为1时，加法运算等价于异或运算；<br />
 * 计算1001 0010 + 0110 1011时，涉及到进位的，可以进位和加法分解开来，先计算加法，值为1111 1001，这个值与异或操作相同，
 * 由于第1位的两个1相加产生了进位，那么，第二步相加进位：1111 1001 + 0000 0100 = 1111 1101，进位可以看做是 (1001 0010 & 0110 1011) << 1
 * 的结果；<br/>
 * 因此，通过分解加法运算，先计算相加(xor)，再计算进位( (a&b)<<1 )，再将相加和进位值“相加”，分解“相加”，直到“相加” == xor为止；<br/>
 * 那么可以通过递归实现整数相加了，见getSum，也可以解递归，见getSum1
 * <p>
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/5.
 */
public class SumOfTwoIntegers {

    public static void main(String[] args) {
        SumOfTwoIntegers s = new SumOfTwoIntegers();
        System.out.println(s.getSum1(20, 30));
    }

    public int getSum(int a, int b) {
        if (0 == b) {
            return a;
        }
        int c = a ^ b;
        int d = (a & b) << 1;
        return getSum(c, d);
    }

    public int getSum1(int a, int b) {
        int xor = a;
        while (0 != b) {
            xor ^= b;
            b = (a & b) << 1;
            a = xor;
        }
        return xor;
    }

    /**
     * 利用对数的运算，将+操作转换为*和对数运算，
     * 10 ^ a * 10 ^ b = 10 ^ (a+b)，从而利用对数运算求出a + b，需要注意overflow的问题
     * Input:
     * 2147483647
     * -2147483648
     * Output:
     * 0
     * Expected:
     * -1
     * 这种情况下有误
     */
    public int getSum2(int a, int b) {
        return (int) Math.log10(Math.pow(10, a) * Math.pow(10, b));
    }
}
