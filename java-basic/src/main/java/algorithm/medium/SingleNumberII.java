package algorithm.medium;

/**
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * 解析：
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/6.
 */
public class SingleNumberII {

    public static void main(String[] args) {
//        System.out.println(101 & 1);
        int[] nums = {1, 1, 1, 2};
        SingleNumberII s = new SingleNumberII();
        System.out.println(s.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int[] digits = new int[32];
        int single = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                digits[i] += ((nums[j] >> i) & 1);
            }
            single ^= ((digits[i] % 3) <<i);
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
            single |= ((digit % 3) << i);
        }
        return single;
    }

    public int singleNumber2(int[] nums) {
        int one = 0;
        int two = 0;
        int three;
        for (int num : nums) {
            two |= num & one;
            one = num ^ one;
            three = ~(one & two);
            one &= three;
            two &= three;
        }
        return one;
    }
}
