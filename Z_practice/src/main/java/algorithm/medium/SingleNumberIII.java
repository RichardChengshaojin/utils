package algorithm.medium;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 * <p>
 * 解析：https://discuss.leetcode.com/topic/56318/examples-to-explain-the-xor-solution-and-bit-manipulation-trick/2
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/6.
 */
public class SingleNumberIII {

    public static void main(String[] args) {
        SingleNumberIII s = new SingleNumberIII();
        int[] r = s.singleNumber1(new int[]{1, 89, 3, 1, 4, 4});
        for (int i : r) {
            System.out.print(i + ", ");
        }
    }

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        int i = 0;
        while ((xor & 1) != 1) {
            xor >>= 1;
            i++;
        }
        int diff1 = 0, diff2 = 0;
        for (int num : nums) {
            if (((num >> i) & 1) == 1) {
                diff1 ^= num;
            } else {
                diff2 ^= num;
            }
        }
        return new int[]{diff1, diff2};
    }

    public int[] singleNumber1(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        xor &= (~(xor - 1));
        int diff1 = 0, diff2 = 0;
        for (int num : nums) {
            if ((num & xor) == 0) {
                diff1 ^= num;
            } else {
                diff2 ^= num;
            }
        }
        return new int[]{diff1, diff2};
    }
}
