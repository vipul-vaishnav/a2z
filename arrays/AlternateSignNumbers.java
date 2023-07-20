package arrays;

import java.util.Arrays;

public class AlternateSignNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        System.out.println(Arrays.toString(alternateNumbers(arr)));
    }

    public static int[] alternateNumbers(int[] arr) {
        // Write your code here.
        int i = 0;

        while (i < arr.length) {
            if (i % 2 == 0 && arr[i] > 0) {
                i++;
            } else if (i % 2 != 0 && arr[i] < 0) {
                i++;
            } else {
                if (i % 2 == 0 && arr[i] < 0) {
                    int j = i;
                    while (arr[j] < 0) {
                        j++;
                    }
                    int el = arr[j];
                    delete(arr, j + 1);
                    insert(arr, el, i + 1);
                } else if (i % 2 != 0 && arr[i] > 0) {
                    int j = i;
                    while (arr[j] > 0) {
                        j++;
                    }
                    int el = arr[j];
                    delete(arr, j + 1);
                    insert(arr, el, i + 1);
                }
            }
        }

        return arr;
    }

    public static void insert(int[] arr, int el, int pos) {
        int idx = pos % arr.length == 0 ? arr.length - 1 : pos % arr.length - 1;

        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }

        arr[idx] = el;
    }

    public static void delete(int[] arr, int pos) {
        int idx = pos % arr.length == 0 ? arr.length - 1 : pos % arr.length - 1;

        for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

}
