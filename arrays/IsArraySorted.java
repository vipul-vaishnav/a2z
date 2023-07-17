package arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 5, 6, 1 };
        System.out.println(foo(arr, 1));
    }

    public static boolean foo(int[] arr, int i) {
        boolean isAscending = arr[0] - arr[1] <= 0;

        if (i == arr.length)
            return true;

        if (isAscending)
            return arr[i] - arr[i - 1] >= 0 && foo(arr, i + 1);

        return arr[i] - arr[i - 1] <= 0 && foo(arr, i + 1);

    }

    public static int isSorted(int n, int[] arr) {
        int idx = 0, diff = arr[1] - arr[0] >= 0 ? 1 : -1, size = arr.length;
        boolean res = true;

        if (diff == 1) {
            while (idx != size - 1) {
                res = res && arr[idx + 1] - arr[idx] >= 0;
                idx++;
            }
        } else {
            while (idx != size - 1) {
                res = res && arr[idx + 1] - arr[idx] <= 0;
                idx++;
            }
        }

        return res ? 1 : 0;
    }
}
