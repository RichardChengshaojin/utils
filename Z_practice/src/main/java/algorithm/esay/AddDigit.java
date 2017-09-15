package algorithm.esay;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p>
 * 解析：1. 直观的方案是逐步分解每一位再相加，和小于10作为终止条件 <br />\
 * 2. 数根：https://en.wikipedia.org/wiki/Digital_root http://baike.baidu.com/view/5820558.htm
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/21.
 */
public class AddDigit {

    public static void main(String[] args) {
        AddDigit a = new AddDigit();
        System.out.println(a.addDigits3(100));
        System.out.println(a.addDigits3(0));
//        System.out.println(-10 % 9);
    }

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (true) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            if (num < 10) {
                sum += num;
                if (sum < 10) {
                    return sum;
                }
                num = sum;
                sum = 0;
            }
        }
    }

    public int addDigits1(int num) {
        if (num == 0) {
            return num;
        }
        return (num % 9 == 0) ? 9 : num % 9;
    }

    public int addDigits2(int num) {
        return num - 9 * ((num - 1) / 9);
    }

    public int addDigits3(int num) {
        return (num - 1) % 9 + 1;
    }
}
