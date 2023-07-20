package arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 3, 4, 0, 0, 7, 0, 9, 1, 0, 10 };
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void fun(int[] arr) {
        // finding first zero element;
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        } else {
            int n = arr.length;
            for (int i = j + 1; i < n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }
}
