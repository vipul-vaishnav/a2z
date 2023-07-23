package arrays;

import java.util.Arrays;

public class LastStone {
    public static void main(String[] args) {

        int[] stones = { 8, 8, 8, 8, 8 };
        System.out.println(weightOfLastStone(stones));
    }

    public static int weightOfLastStone(int arr[]) {
        // Your code goes here

        int idx = arr.length - 1;
        int largestIndex = 0;

        while (idx > 0) {
            int largest = arr[0], idxl = 0;
            int secondLargest = Integer.MIN_VALUE, idxs = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= largest) {
                    secondLargest = largest;
                    largest = arr[i];
                    idxs = idxl;
                    idxl = i;
                } else if (arr[i] != largest && arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    idxs = i;
                }
            }

            System.out.println(largest);
            System.out.println(secondLargest);

            int wt = largest - secondLargest;

            if (wt == 0) {
                arr[idxl] = 0;
                arr[idxs] = 0;
            } else {
                arr[idxs] = 0;
                arr[idxl] = wt;
            }

            largestIndex = idxl;

            System.out.println(Arrays.toString(arr));

            idx--;
        }

        return arr[largestIndex];
    }
}