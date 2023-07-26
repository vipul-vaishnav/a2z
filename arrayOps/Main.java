package arrayOps;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        var obj = new ArrayOps();

        // System.out.println(obj.findElementInArray(arr, 12));
        obj.insertAtPosition(arr, -99, 12);
        obj.deleteAtPosition(arr, 12);
        obj.insertAtPosition(arr, 16, 8);
        obj.deleteAtPosition(arr, 6);
        obj.printArray(arr);
    }
}
