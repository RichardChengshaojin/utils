package algorithm.esay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * <p>
 * <p>解析：这道题是求两个数组的交集</p>
 *
 * @author chengshaojin
 * @since 2016/9/27.
 * //TODO: to summarize this
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        int[] r1 = i.intersection1(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int j : r1) {
            System.out.print(j + ", ");
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.putIfAbsent(i, 1);
        }
        int len = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums2) {
            if (map.get(i) != null) {
                if (set.add(i)) {
                    len++;
                }
            }
        }
        int[] array = new int[len];
        int index = 0;
        for (int i : set) {
            array[index++] = i;
        }
        return array;
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        int[] smaller, bigger;
        if(nums1.length < nums2.length) {
            smaller = nums1;
            bigger = nums2;
        } else {
            smaller = nums2;
            bigger = nums1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : smaller) {
            map.putIfAbsent(i, 1);
        }
        int len = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : bigger) {
            if (map.get(i) != null) {
                if (set.add(i)) {
                    len++;
                }
            }
        }
        int[] array = new int[len];
        int index = 0;
        for (int i : set) {
            array[index++] = i;
        }
        return array;
    }
}
