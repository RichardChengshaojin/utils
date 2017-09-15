package algorithm.esay;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * 解析：最后一位加1，达到10就进一，模拟一个10进制的加一运算
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/23.
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] r = p.plusOne(new int[]{9, 9});
        for (int i : r) {
            System.out.print(i + ", ");
        }
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public int[] plusOne2(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
