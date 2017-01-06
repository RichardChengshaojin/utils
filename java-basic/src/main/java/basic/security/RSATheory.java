package basic.security;

/**
 * RSA原理，指定两个质数，输出RSA公钥以及私钥
 *
 * @auther chengshaojin
 * @since 2016/11/15
 */
public class RSATheory {
    public static void main(String[] args) {
        int[] p = new int[2];
        int a = 61;
        int b = 53;
        RSA(a, b, p);
        //p1为私钥
        System.out.print("p[0] is: " + p[0] + ";p[1] is：" + p[1]);
    }

    public static int[] RSA(int a, int b, int[] p) { //这里假设a > b
        if (a % b == 1) {
            p[0] = 1;
            p[1] = -(a - 1) / b;
            return p;
        } else {
            RSA(b, a % b, p);
            int t = p[0];
            p[0] = p[1];
            p[1] = t - (a / b) * p[1];
            return p;
        }
    }
}
