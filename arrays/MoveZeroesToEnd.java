package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {

        int[] arr = {
                38,
                7, 93, 0, 8, 15, 0, 0, 0, 0, 0, 26, 0, 0, 0, 43, 90, 2, 0, 0, 0, 58, 94, 77, 45, 59, 19, 0, 0, 98, 0, 0,
                0, 0, 0, 88, 0, 0, 0 };
        foo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo(int[] arr) {
        int r = 0;
        int l = 0;

        while (r < arr.length - 1) {
            while (arr[l] != 0 && arr[r] != 0) {
                if (r == arr.length - 1)
                    break;
                l++;
                r++;
            }

            while (arr[r] == 0) {
                if (r == arr.length - 1)
                    break;
                r++;
            }

            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

            l++;
        }
    }

    // public static void foo(int[] arr) {
    // int left = 0;

    // while (left < arr.length) {
    // while (arr[left] != 0) {
    // left++;
    // }

    // for (int i = left; i < arr.length - 1; i++) {
    // arr[i] = arr[i + 1];
    // }

    // arr[arr.length - 1] = 0;

    // System.out.println(left);

    // if (arr[left] != 0) {
    // left++;
    // }

    // System.out.println(left);
    // }
    // }
}
