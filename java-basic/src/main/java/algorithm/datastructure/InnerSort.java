package algorithm.datastructure;


/**
 * 内排序
 *
 * @author chengshaojin
 * @since 2016/9/27.
 */
public class InnerSort {

    public static void main(String[] args) {
        InnerSort i = new InnerSort();
        int[] arr = {1, 3, 2, 6, 2, 8};
        i.bubbleSort(arr);
        for (int t : arr) {
            System.out.print(t + ", ");
        }
    }

    public void bubbleSort(int[] arr) {
        int i = arr.length - 1;
        int j;
        int last; // 指示最后一次交换的索引
        while (i > 0) {
            last = 0;
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                    last = j;
                }
            }
            i = last;
        }
    }
}
