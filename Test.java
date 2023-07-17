import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 0, 10, 1, 2, 2 };

        System.out.println(Arrays.toString(Klargest(arr, 2, 5)));
    }

    public static int[] Klargest(int[] arr, int k, int n) {
        // Write your code here
        foo(arr);

        int[] arr2 = new int[k];

        for (int i = 0; i < k; i++) {
            arr2[i] = arr[n - k + i];
        }

        return arr2;
    }

    public static void foo(int[] arr) {
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
