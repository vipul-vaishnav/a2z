package arrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        int x = 4;

        System.out.println(lowerBound(arr, x));
    }

    public static int lowerBound(int[] arr, int x) {
        // For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the
        // smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'

        // If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of
        // 'x', where 'n' is the size of array.

        // Consider 0-based indexing.

        int res = arr.length;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (start == end) {
                if (arr[start] >= x)
                    res = start;
                break;
            }

            if (arr[mid] == x) {
                end = mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return res;
    }
}
