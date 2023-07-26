package SlidingWindow;

public class MaximumSumSubarryOfSizeK {
    // Given an array of positive numbers and a positive number ‘k’, find the
    // maximum sum of any contiguous subarray of size ‘k’.

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int size = 3;

        System.out.println(foo(arr, size));
    }

    public static int foo(int[] arr, int k) {
        // int res_size = arr.length - k + 1;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i >= k - 1) {
                max_sum = Math.max(sum, max_sum);
                sum -= arr[start];
                start++;
            }
        }

        return max_sum;
    }
}
