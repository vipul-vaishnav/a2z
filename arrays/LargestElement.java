package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 64, 32, -12, 25, 77, 119, -10 };

        int max = Integer.MIN_VALUE; // || one can use arr[0]

        for (int el : arr) {
            max = Math.max(el, max);
        }

        System.out.println("MAX_ELEMENT: " + max);
    }
}
