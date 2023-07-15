import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Take one element & place it at its correct position

        int[] arr = { 64, 25, 12, 32, 11 };
        // foo(arr);
        // System.out.println(Arrays.toString(arr));

        foo2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void foo2(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int j = i;
            while (j != 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
