import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // PUSH max to the end by adjacent swaping of elements

        int[] arr = { 64, 25, 12, 32, 11 };
        foo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                // if not swaps happen then arr is already sorted so further comparisons are
                // required
                break;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
