package algorithm.esay;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 * <p>
 * 只需翻转字符串字符数组即可，或者使用java的StringBuilder；在反转字符数组时，可以不用新建新数组，直接在原数组上反转，见reverseString1
 *
 * @author chengshaojin
 * @since 2016/9/5.
 */
public class ReverseString {

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        System.out.println(r.reverseString1(""));
    }

    public String reverseString(String s) {
        char[] ss = s.toCharArray();
        char[] reverse = new char[ss.length];
        for (int i = ss.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = ss[i];
        }
        return new String(reverse);
    }

    public String reverseString1(String s) {
        char[] ss = s.toCharArray();
        int n = ss.length - 1;
        for (int i = n >> 1; i >= 0; i--) {
            char b = ss[n-i];
            ss[n-i] = ss[i];
            ss[i] = b;

        }
        return new String(ss);
    }

    public String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
