package algorithm.esay;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * <p>
 * Note: You may assume the string contain only lowercase letters.
 * <p>
 *     解析：题目所示只有26个小写字母，统计各个小写字母在字符串中出现的次数，然后再遍历字符串找出第一个出现次数为1的字符索引
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/22.
 */
public class FirstUniqueChar {

    public static void main(String[] args) {
        FirstUniqueChar f = new FirstUniqueChar();
        System.out.println(f.firstUniqChar2("cca"));
    }

    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            char c = ss[i];
            boolean unique = true;
            for (int j = 0; j < ss.length; j++) {
                if (i != j && c == ss[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        char[] ss = s.toCharArray();
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            if (null != hash.put(ss[i], i)) {
                ss[i] = '-';
            }
        }
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != '-' && hash.get(ss[i]) == i) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int[] appearance = new int[26];
        char[] ss = s.toCharArray();
        for (char c : ss) {
            appearance[c - 97]++;
        }
        for (int i = 0; i < ss.length; i++) {
            if (appearance[ss[i] - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
