package algorithm.esay;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 * <p>
 * 解析，只要从末尾开始逐个分析字符即可
 *
 * @author chengshaojin
 * @since 2016/9/5.
 */
public class LengthofLastWord {

    public static void main(String[] args) {
        LengthofLastWord l = new LengthofLastWord();
        System.out.println(l.lengthOfLastWord("aasdf"));
    }

    public int lengthOfLastWord(String s) {
        char[] ss = s.toCharArray();
        int count = 0;
        for (int i = ss.length - 1; i >= 0; i--) {
            if (ss[i] != ' ') {
                count++;
            } else if (count != 0) {
                return count;
            } else {
                count = 0;
            }
        }
        return count;
    }
}
