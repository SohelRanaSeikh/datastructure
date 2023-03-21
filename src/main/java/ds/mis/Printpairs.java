package ds.mis;

import java.util.HashSet;

public class Printpairs {
    static void printpair(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Yes");
                System.out.println(arr[i] + " and " + temp);
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpair(arr, n);
    }
}
