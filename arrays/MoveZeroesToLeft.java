package arrays;

import java.util.Arrays;

public class MoveZeroesToLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1 };
        moveZerosToLeft(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToLeft(int[] arr, int n) {
        // Write your code here!
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == 0) {
        // int j = i;
        // while (j != 0) {
        // swap(arr, j, j - 1);
        // j--;
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = 0;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
