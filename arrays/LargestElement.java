package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 64, 32, -12, 25, 77, 119, -10 };
        int[] arr2 = { 13, 8, -17, -18, 1 };

        int max = Integer.MIN_VALUE; // || one can use arr[0]

        for (int el : arr) {
            max = Math.max(el, max);
        }

        System.out.println("MAX_ELEMENT: " + max);
        System.out.println(foo(arr2));
    }

    public static int foo(int[] A) {
        int largest = A[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int el : A) {
            if (el > largest) {
                secondLargest = largest;
                largest = el;
            } else if (el != largest && el > secondLargest) {
                secondLargest = el;
            }
        }

        return largest + secondLargest;
    }
}
