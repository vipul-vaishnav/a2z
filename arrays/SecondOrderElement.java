package arrays;

import java.util.Arrays;

public class SecondOrderElement {
    public static void main(String[] args) {
        int[] arr = { -12, 24, 56, 12, 73, -101, -3, 88 };

        // get second largest and second smallest element
        System.out.println(Arrays.toString(getSecondOrderElement(arr)));
    }

    public static int[] getSecondOrderElement(int[] a) {
        int[] result = { Integer.MAX_VALUE, Integer.MIN_VALUE }; // min, max

        int secondLargest = result[1], largest = a[0], secondSmallest = result[0], smallest = a[0];

        for (int el : a) {
            if (el > largest) {
                secondLargest = largest;
                largest = el;
            } else if (el > secondLargest) {
                secondLargest = el;
            }
            if (el < smallest) {
                secondSmallest = smallest;
                smallest = el;
            } else if (el < secondSmallest && el != smallest) {
                secondSmallest = el;
            }
        }

        result[0] = secondSmallest;
        result[1] = secondLargest;

        return result;
    }
}
