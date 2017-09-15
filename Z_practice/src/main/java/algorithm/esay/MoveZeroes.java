package algorithm.esay;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * <p>
 * <p>
 * 解析：1.可以做一份原来数组非0数字的备份，这样可以保留原顺序，再在备份数组末尾添0即可；这种方法需要额外空间！
 * 2.依次扫描数组，若遇到0，将后面的第一个非0数字与之交换，直到后面全是0或者扫描完毕位置；这种方法时间复杂度高；
 * 3.仔细思考方法1，其实可以不用开辟额外的空间去存储可以保留原非0数字顺序的数组，可以利用这个数组本身去存储这个非0数字，即使将原来的0位置占据了也没关系，后面全补充0即可！
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/26.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] test = {0, 1, 0, 3, 12};
        int[] test1 = {2, 1};
        m.moveZeroes3(test);
        m.moveZeroes3(test1);
        for (int i : test) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i : test1) {
            System.out.print(i + ", ");
        }
    }

    /**
     * make a copy of the array
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int[] copy = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                copy[j++] = nums[i];
            }
        }
        for (; j < copy.length; j++) {
            copy[j] = 0;
        }
        System.arraycopy(copy, 0, nums, 0, copy.length);
    }

    public void moveZeroes1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i;
                while (j < nums.length && nums[j++] == 0) ;
                if (j == nums.length && nums[j - 1] == 0) {
                    return;
                }
                // exchange
                nums[i] ^= nums[j - 1];
                nums[j - 1] ^= nums[i];
                nums[i] ^= nums[j - 1];
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }

    public void moveZeroes3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int cur = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
