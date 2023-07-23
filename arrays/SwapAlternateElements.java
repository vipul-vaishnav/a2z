package arrays;

import java.util.Arrays;

public class SwapAlternateElements {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 1; i < arr.length + 1; i++) {
            arr[i - 1] = i;
        }
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i + 1 >= arr.length)
                break;
            swap(arr, i, i + 1);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}