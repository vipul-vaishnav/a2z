import java.util.Arrays;

public class SelectionSort {
    // SELECT minimum element & SWAP it with the element at the correct index (min
    // goes at 0 & so on)
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 32, 11 };
        foo2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swap(arr, min_index, i);
        }
    }

    public static void foo2(int[] arr) {
        int start = 0;
        while (start < arr.length) {
            int min_idx = start;
            for (int i = start + 1; i < arr.length; i++) {
                if (arr[min_idx] > arr[i]) {
                    min_idx = i;
                }
            }
            swap(arr, start, min_idx);
            start++;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}