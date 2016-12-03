package algorithm.esay;

/**
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.<br />
 * 解析：char的本质也是整数，因此可以利用两个char数组之和的差求出多出来的字符，可以利用异或运算的原理，一个整数异或自身的值为0
 *
 * @author chengshaojin
 * @since 2016/9/2.
 */
public class FindTheDifference {

    public static void main(String[] args) {
        FindTheDifference t = new FindTheDifference();
        String a = "abcdefghijklmnopq";
        String b = "abcdeafghijklmnopq";
        System.out.println(t.findTheDifference1(a, b));
    }

    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int sum = 0;
        int i = 0;
        while (i < ss.length) {
            sum -= ss[i];
            sum += tt[i++];
        }
        sum += tt[i];
        return (char) sum;
    }

    public char findTheDifference1(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int tmp = 0;
        int i = 0;
        while (i < ss.length) {
            tmp ^= ss[i] ^ tt[i];
            i++;
        }
        tmp ^= tt[i];
        return (char) tmp;
    }

    public char findTheDifference2(String s, String t)  {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int n = t.length();
        char c = t.charAt(n - 1);
        for (int i = 0; i < n - 1; ++i) {
            c ^= ss[i];
            c ^= tt[i];
        }
        return c;
    }
}
