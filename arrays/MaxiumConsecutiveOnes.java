package arrays;

public class MaxiumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0 };

        int max = 0, count = 0;
        for (int el : arr) {
            if (el == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
