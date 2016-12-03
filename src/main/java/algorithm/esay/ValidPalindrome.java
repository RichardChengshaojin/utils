package algorithm.esay;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * <p>解析：题目是判断回文，并且只要求考虑数字以及字母，忽略字母大小写，但是字符串中有其他字符干扰；
 * 实现方法：从两边遍历字符串，忽略其他字符，逐一比较首位两端的字符是否相等，直到全部比较完毕</p>
 *
 * @author chengshaojin
 * @since 2016/9/27.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(v.isPalindrome("-121"));
        System.out.println(v.isPalindrome("0P"));
        System.out.println(v.isPalindrome("122"));
    }

    public boolean isPalindrome(String s) {
        char[] ss = s.toCharArray();
        for (int i = 0, j = ss.length - 1; i < j; i++, j--) {
            if ((ss[i] < 'A' || (ss[i] > 'Z' && ss[i] < 'a') || ss[i] > 'z') && (ss[i] < '0' || ss[i] > '9')) {
                j++;
                continue;
            }
            if ((ss[j] < 'A' || (ss[j] > 'Z' && ss[j] < 'a') || ss[j] > 'z') && (ss[j] < '0' || ss[j] > '9')) {
                i--;
                continue;
            }
            if ('A' <= ss[i] && ss[i] <= 'Z') {
                ss[i] += 32;
            }
            if ('A' <= ss[j] && ss[j] <= 'Z') {
                ss[j] += 32;
            }
            if (ss[i] != ss[j]) {
                return false;
            }
        }
        return true;
    }
}
