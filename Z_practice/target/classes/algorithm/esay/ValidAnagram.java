package algorithm.esay;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>解析：统计第一个字符串中26个字母出现的次数，再在遍历第二个字符串的过程中使用掉上一步统计的字符，出现过度使用则返回false，未过度使用返回true</p>
 * @author chengshaojin
 * @since 2016/9/27.
 */
public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();

        System.out.println(v.isAnagram("", ""));
        System.out.println(v.isAnagram("anagram", "nagaram"));
        System.out.println(v.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] dict = new int[26];
        for (char c : ss) {
            dict[c - 'a']++;
        }
        for (char c : tt) {
            if (--dict[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
