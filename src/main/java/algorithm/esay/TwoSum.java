package algorithm.esay;


import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author chengshaojin
 * @since 2016/9/2.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {591, 955, 829, 805, 312, 83, 764, 841, 12, 744, 104, 773, 627, 306, 731, 539, 349, 811, 662, 341, 465, 300, 491, 423, 569, 405, 508, 802, 500, 747, 689, 506, 129, 325, 918, 606, 918, 370, 623, 905, 321, 670, 879, 607, 140, 543, 997, 530, 356, 446, 444, 184, 787, 199, 614, 685, 778, 929, 819, 612, 737, 344, 471, 645, 726};
        int target = 789;
        TwoSum t = new TwoSum();
        int[] result = t.twoSum4(nums, target);
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            index1 = i;
            int another = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == another) {
                    index2 = j;
                    break;
                }
            }
            if (-1 != index2) {
                break;
            }
        }
        return new int[]{index1, index2};
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] solution = {0, 0};
        HashMap<Integer, Integer> numsWithIndexes = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            Integer mIndex = numsWithIndexes.get(target - n);
            if (mIndex != null) {
                solution[0] = mIndex;
                solution[1] = i;
                return solution;
            } else {
                numsWithIndexes.put(n, i);
            }
        }
        // if input is correct, this line will be never reached
        return solution;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> numsWithIndexes = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (null == numsWithIndexes.get(target - nums[i])) {
                numsWithIndexes.put(nums[i], i);
            } else {
                return new int[]{numsWithIndexes.get(target - nums[i]), i};
            }
        }
        return null;
    }

    public int[] twoSum3(int[] nums, int target) {
        // Since x1 + x2 = target, we can in one loop
        // mark both x1 and x2 in some additional array where we'll keep indices
        // Though to build that array we'd need another loop

        int min = 0, max = 0;
        // first loop to find max and min integers
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                min = nums[i];
                max = min;
            } else {
                if (nums[i] < min)
                    min = nums[i];
                if (nums[i] > max)
                    max = nums[i];
            }
        }
        // valid range for input integers relative to target
        int sMin = Math.max(min, target - max);
        int sMax = Math.min(max, target - min);

        // array to keep indices of valid input integers
        // initialize with -1
        int size = 1 + sMax - sMin;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = -1;

        // second loop
        int offset = -sMin;
        for (int i = 0; i < nums.length; i++) {
            // Skip if integer is not from a valid range
            if (nums[i] > sMax || nums[i] < sMin)
                continue;
            // if found valid X1 and corresponding element of indices array is still -1
            // then mark its pair X2 = target - X1 in indices array
            if (arr[nums[i] + offset] == -1)
                arr[target - nums[i] + offset] = i;
            else
                return new int[]{arr[nums[i] + offset], i};
        }

        return new int[]{0, 0};
    }

    public int[] twoSum4(int[] nums, int target) {
        int max = nums[0];
        int min = max;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int sMin = Math.max(min, target - max);
        int sMax = Math.min(max, target - min);
        int size = sMax - sMin + 1;
        int[] map = new int[size];
        for (int i = 0; i < size; i++) {
            map[i] = -1;
        }

        int offset = -sMin;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sMin || nums[i] > sMax) {
                continue;
            }

            if (-1 == map[target + offset - nums[i]]) {
                map[nums[i] + offset] = i;
            } else {
                return new int[]{map[target + offset - nums[i]], i};
            }
        }

        return null;
    }
}
