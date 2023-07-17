package arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = { -1, -1 };

        int l = 0, r = nums.length - 1;

        while (l < nums.length - 1) {
            if (nums[l] + nums[r] == target) {
                arr[0] = l;
                arr[1] = r;
                break;
            } else {
                r--;
            }

            if (l == r) {
                l++;
                r = nums.length - 1;
            }
        }

        return arr;
    }
}
