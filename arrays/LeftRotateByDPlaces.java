package arrays;

import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 11, 12, 7 };
        foo2(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo2(int[] arr, int k) {
        int[] temp = new int[k % arr.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = k % arr.length; i < arr.length; i++) {
            arr[i - k % arr.length] = arr[i];
        }

        for (int i = arr.length - k % arr.length; i < arr.length; i++) {
            arr[i] = temp[i - arr.length + k % arr.length];
        }
    }

    public static void foo(int[] arr, int k) {
        for (int i = 0; i < k % arr.length; i++) {
            foo(arr);
        }
    }

    public static void foo(int[] arr) {
        int size = arr.length;

        int el = arr[0];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = el;
    }
}
