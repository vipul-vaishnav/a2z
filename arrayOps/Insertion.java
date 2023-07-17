package arrayOps;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 0, 0 };
        insert(arr, 99, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int[] arr, int el, int pos) {
        int idx = pos % arr.length == 0 ? arr.length - 1 : pos % arr.length - 1;

        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }

        arr[idx] = el;
    }
}
