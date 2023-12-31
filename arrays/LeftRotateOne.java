package arrays;

import java.util.Arrays;

public class LeftRotateOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // OUTPUT = {2,3,4,5,1}

        int el = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = el;

        System.out.println(Arrays.toString(arr));
    }
}
