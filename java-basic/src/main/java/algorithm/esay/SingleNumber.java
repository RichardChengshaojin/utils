package algorithm.esay;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * 解析：
 * 异或运算的特点是一个数异或运算本身的值是0，一个数异或运算0的值不变，利用这两个特性，可以解决问题；同样的，该方法适用于当其他元素出现次数为偶数
 * <p>
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/6.
 */
public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = {1, 2, 3, 1, 2};
        System.out.println(s.singleNumber1(nums));
    }

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public int singleNumber1(int[] nums) {
        int single = 0;
        for (int i = 0; i < 32; i++) {
            int digit = 0;
            for (int num : nums) {
                digit += ((num >> i) & 1);
            }
            single |= ((digit % 2) << i);
        }
        return single;
    }
}
