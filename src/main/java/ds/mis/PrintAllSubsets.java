package ds.mis;

public class PrintAllSubsets {

    static int count;
    static int sum;
    static int n;

    // Driver code
    public static void main(String[] args) {
        count = 0;
        n = 5;
        sum = 10;

        int[] pat = {2, 3, 4, 6, 8, 10};

        f(pat, 0, 0, "");

        System.out.println(count);
    }

    // Function to select or not the array element
    // to form a subset with given sum
    static void f(int[] pat, int i, int currSum, String st) {
        if (currSum == sum) {
            count++;
            System.out.println(st);
            return;
        }
        if (currSum < sum && i < n) {
            f(pat, i + 1, currSum + pat[i], "" + pat[i]);
            f(pat, i + 1, currSum, "");
        }
    }
}
