package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        // Your function should return k = 5, with the first five elements of nums being
        // 0, 1, 2, 3, and 4 respectively. nums = [0,1,2,3,4,_,_,_,_,_]
        // It does not matter what you leave beyond the returned k (hence they are
        // underscores).
        System.out.println(foo(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int foo(int[] nums) {
        int count = 0;
        int left = 0, right = 0;

        while (right < nums.length) {
            while (right < nums.length && nums[left] == nums[right]) {
                right++;
            }

            nums[count] = nums[left];
            left = right;
            count++;
        }

        return count;
    }

    public static int foo(ArrayList<Integer> nums) {
        int count = 0;
        int left = 0, right = 0;

        while (right < nums.size()) {
            while (right < nums.size() && nums.get(left) == nums.get(right)) {
                right++;
            }

            nums.set(count, nums.get(left));
            left = right;
            count++;
        }

        return count;
    }

}
