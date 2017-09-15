package algorithm.esay;

/**
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * 解析：TODO: solve this problem
 *
 * @author chengshaojin
 * @since 2016/9/5.
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        ImplementStrStr i = new ImplementStrStr();
        System.out.println(i.strStr2("abcde", "cde"));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr1(String haystack, String needle) {
        char[] hh = haystack.toCharArray();
        char[] nn = needle.toCharArray();
        if (nn.length == 0) {
            return 0;
        }
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] == nn[0]) {
                int j = i;
                int k;
                for (k = 0; k < nn.length && j < hh.length && hh[j] == nn[k]; k++, j++) ;
                if (k == nn.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        char[] hh = haystack.toCharArray();
        char[] nn = needle.toCharArray();
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (nn[j] != hh[i + j]) break;
            }
        }
    }
}
