package arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4, 5, 5, 6, 7 };
        int[] arr2 = { 2, 3, 4, 4, 5, 5, 6 };

        ArrayList<Integer> l1 = new ArrayList<>();

        for (int el : arr1) {
            l1.add(el);
        }

        ArrayList<Integer> l2 = new ArrayList<>();

        for (int el : arr2) {
            l2.add(el);
        }

        System.out.println(l1);
        System.out.println(l2);

        findArrayIntersection(l1, arr1.length, l2, arr2.length);
    }

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
            int m) {
        // Write Your Code Here.
        int i = 0, j = 0;
        ArrayList<Integer> l = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                l.add(arr1.get(i));
            }
        }

        System.out.println(l);

        return l;
    }
}
