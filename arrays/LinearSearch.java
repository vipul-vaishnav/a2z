package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 18, 11, 24, 9, 1 };

        int target1 = 24, target2 = 99;

        System.out.println(foo(target1, arr));
        System.out.println(foo(target2, arr));
    }

    public static int foo(int el, int[] arr) {
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el)
                res = i;
        }

        return res;
    }
}