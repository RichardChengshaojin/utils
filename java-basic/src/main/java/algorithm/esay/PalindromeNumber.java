package algorithm.esay;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * 解析：
 * 这道题明确标明不需要额外的空间，因此不能转为字符串实现，负数不是回文；<br/>
 * 有很多实现方法：<br/>
 * 1. 最基本的是取出每一位，然后依次判断首尾是否一致，但是这种方法仍然需要一个额外的数组，见isPalindrome<br/>
 * 2. 明智的方法是翻转整数，但是需要考虑overflow的情况，其实用翻转整数的方法确定整数是否回文，不必计算出翻转后的整数，
 * 只需要计算翻转len-1的整数，然后用origin/10与翻转值比较即可，因为少了一个数量级，不会overflow，具体见isPalindrome3<br/>
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/5.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome1(0));
    }

    public boolean isPalindrome(int x) {
        if (0 == x) {
            return true;
        }
        if (0 > x) {
            return false;
        }
        // 判断整数长度，x > 0
        int len = (int) Math.log10(x) + 1;
        int[] digits = new int[len];
        int i = 0;
        while (0 != x) {
            digits[i++] = x % 10;
            x /= 10;
        }
        i = 0;
        for (int j = digits.length - 1; i < digits.length; i++, j--) {
            if (digits[i] != digits[j]) {
                return false;
            }
            if (j <= i) {
                break;
            }
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0, origin = x;
        do {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        } while (0 != x);
        return origin == reverse;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int sum = 0;
        while (x > sum) {
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        return (x == sum) || (x == sum / 10);
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10) {
            q *= 10;
            q += p % 10;
            p /= 10;
        }
        return q == x / 10 && p == x % 10;
    }
}
