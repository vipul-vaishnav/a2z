import java.util.*;

public class Test {
    public static void main(String[] args) {
        // int[] arr = { 2, 0, 0, 10, 1, 0, 2, 2 };
        // int[] arr = { 0, 3, 0, 2, 0 };
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();

        in.close();

        System.out.println("My name is " + name + " and my age is " + age + ".");

        int[] arr = { 2, 9, 4, 8, 1, 7, 6 };

        // System.out.println(reverseString("abc"));

        ArrayList<Integer> a = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<>();

        for (int el : arr) {
            s.push(el);
        }

        for (int el : arr) {
            a.add(el);
        }

        // System.out.println(kthSmallLarge(a, a.size(), 4));

        System.out.println(Arrays.toString(foo3(new int[] { 0, 1, 1, 1 })));
    }

    public static int[] foo3(int[] arr) {
        // Your code goes here
        int res = 1;
        for (int el : arr) {
            res *= el;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 0;
            } else
                arr[i] = (res / arr[i]) % 1000000007;
        }

        return arr;
    }

    public static boolean foo2(String s) {
        boolean result = true;

        int left = 0, right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                result = false;
                return result;
            }
        }

        return result;
    }

    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        // Write your code here

        // for (int i = 1; i < arr.size(); i++) {
        // int j = i;
        // while (j != 0 && arr.get(j) < arr.get(i)) {
        // int temp = arr.get(j);
        // arr.set(j, arr.get(j - 1));
        // arr.set(j - 1, temp);
        // j--;
        // }
        // }
        Collections.sort(arr);

        System.out.println(arr);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr.get(k - 1));
        a.add(arr.get(arr.size() - k));

        return a;
    }

    public static Boolean splitString(String str) {
        // Write your code here..
        int mid = str.length() / 2;

        String s1 = str.substring(0, mid).toLowerCase();
        String s2 = str.substring(mid).toLowerCase();

        System.out.println(s1);
        System.out.println(s2);

        // int v1 = countVowels(s1), v2 = countVowels(s2);

        // return new Boolean(v1 == v2);
        return true;
    }

    public static int countVowels(String s) {
        int count = 0;
        String[] sarr = s.split("");
        for (String c : sarr) {
            char ctr = c.charAt(0);

            if (ctr == 'a' || ctr == 'e' || ctr == 'i' || ctr == 'o' || ctr == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        } else {
            int el = s.pop();
            reverseStack(s);
            insertAtBottom(s, el);
        }
    }

    private static void insertAtBottom(Stack<Integer> s, int el) {
        if (s.empty()) {
            s.push(el);
            return;
        } else {
            int top = s.pop();
            insertAtBottom(s, el);
            s.push(top);
        }
    }

    public static void sortAStackUsingRecursion(Stack<Integer> s) {
        if (s.empty() || s.size() == 1) {
            return;
        } else {
            int el = s.peek();
            s.pop();
            sortAStackUsingRecursion(s);
            insert(s, el);
        }
    }

    public static void insert(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.peek() <= temp) {
            s.push(temp);
            return;
        } else {
            int temp2 = s.peek();
            s.pop();
            insert(s, temp);
            s.push(temp2);
        }
    }

    public static void sortArrByRecursion(ArrayList<Integer> arr) {
        if (arr.size() == 0 || arr.size() == 1) {
            return;
        } else {
            int val = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            sortArrByRecursion(arr);
            insert(arr, val);
        }
    }

    public static void insert(ArrayList<Integer> arr, int temp) {
        if (arr.size() == 0 || arr.get(arr.size() - 1) <= temp) {
            arr.add(temp);
            return;
        } else {
            int temp2 = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            insert(arr, temp);
            arr.add(temp2);
        }
    }

    public static int totalSalary(int basic, char grade) {
        // Write your code here
        double hra = 20 * (double) basic / 100;
        double da = 50 * (double) basic / 100;
        double pf = 11 * (double) basic / 100;
        int allowance = 0;

        System.out.println(hra);
        System.out.println(pf);
        System.out.println(da);

        if (grade == 'A') {
            allowance = 1700;
        } else if (grade == 'B') {
            allowance = 1500;
        } else {
            allowance = 1300;
        }

        System.out.println(allowance);

        return (int) Math.round(basic + hra + da + allowance - pf);
    }

    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        // Write your code here.

        int left = 0, right = 0;

        while (true) {
            if (right == arr.size() - 1)
                break;

            while (right < arr.size() && arr.get(left) != 0 && arr.get(right) != 0) {
                left++;
                right++;
            }

            while (right < arr.size() && arr.get(right) == 0) {
                right++;
            }

            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
        }
    }

    public static int[] Klargest(int[] arr, int k, int n) {
        // Write your code here
        foo(arr);

        int[] arr2 = new int[k];

        for (int i = 0; i < k; i++) {
            arr2[i] = arr[n - k + i];
        }

        return arr2;
    }

    public static void foo(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int j = i;
            while (j != 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
