package arrays;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        int x = 4;

        System.out.println(upperBound(arr, x, arr.length));
    }

    public static int upperBound(int[] arr, int x, int n) {
        // Write your code here.
        int res = n;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            if (start == end) {
                if (arr[start] > x)
                    res = start;
                break;
            }

            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return res;
    }
}
