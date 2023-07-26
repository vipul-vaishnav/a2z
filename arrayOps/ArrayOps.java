package arrayOps;

public class ArrayOps {
    public void printArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }

    public int findElementInArray(int[] arr, int el) {
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (el == arr[i]) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    public void insertAtPosition(int[] arr, int element, int position) {
        if (position < 0)
            throw new Error("Position cannot be negative");

        int idx = position % arr.length == 0 ? arr.length - 1 : position % arr.length - 1;

        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }

        arr[idx] = element;
    }

    public void deleteAtPosition(int[] arr, int position) {
        if (position < 0)
            throw new Error("Position cannot be negative");

        int idx = position % arr.length == 0 ? arr.length - 1 : position % arr.length - 1;

        for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }
}
