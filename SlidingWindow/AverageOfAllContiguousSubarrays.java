package SlidingWindow;

import java.util.Arrays;

public class AverageOfAllContiguousSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int size = 5;

        System.out.println(Arrays.toString(bruteForce(arr, size)));
        System.out.println(Arrays.toString(foo(arr, size)));
    }

    public static double[] foo(int[] arr, int size) {
        int res_size = arr.length - size + 1;

        double[] result = new double[res_size];

        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= size - 1) {
                result[windowStart] = windowSum / size;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return result;
    }

    public static double[] bruteForce(int[] arr, int size) {
        int res_size = arr.length - size + 1;

        double[] result = new double[res_size];

        for (int i = 0; i < res_size; i++) {
            double sum = 0;

            for (int j = i; j < i + size; j++) {
                sum += arr[j];
            }

            double avg = sum / size;

            result[i] = avg;
        }

        return result;
    }
}
