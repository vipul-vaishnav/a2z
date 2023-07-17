package arrays;

import java.util.Arrays;

public class RightRotateKSteps {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateByK(arr, 22);
        System.out.println(Arrays.toString(arr));
    }

    public static void foo(int[] arr) {

    }

    // right rotate
    public static void rotateByK(int[] nums, int k) {
        if (k % nums.length == 0)
            return;

        for (int i = 0; i < k % nums.length; i++) {
            rotateOne(nums);
        }
    }

    public static void rotateOne(int[] nums) {
        int el = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = el;
    }

    // left rotate
    public static void leftRotateOne(int[] arr) {
        int el = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = el;
    }
}
