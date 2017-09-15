package algorithm.esay;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * <p>
 * 解析：分析题目可以看出，数字对26的余数以及对于26的商的余数构成了这些字母，就像计算出数字每个位（个十百千万）上的数字一样
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/26.
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        System.out.println(e.convertToTitle(1));
        System.out.println(e.titleToNumber("A"));
        System.out.println(e.convertToTitle(2));
        System.out.println(e.titleToNumber("B"));
        System.out.println(e.convertToTitle(3));
        System.out.println(e.titleToNumber("C"));
        System.out.println(e.convertToTitle(26));
        System.out.println(e.titleToNumber("Z"));
        System.out.println(e.convertToTitle(27));
        System.out.println(e.titleToNumber("AA"));
        System.out.println(e.convertToTitle(28));
        System.out.println(e.titleToNumber("AB"));

        System.out.println(e.convertToTitle(731));
        System.out.println(e.titleToNumber("ABC"));
    }

    public String convertToTitle(int n) {
        String result = "";
        while (n != 0) {
            result = (char) ('A' + --n % 26) + result;
            n = n / 26;
        }
        return result;
    }

    /**
     * 这个方法是上述转换的逆向
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        char[] ss = s.toCharArray();
        int result = 0;
        for (char c : ss) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
