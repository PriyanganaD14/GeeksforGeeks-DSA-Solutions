import java.util.Scanner;

//Given an array arr[], find the maximum j – i such that arr arr[j] > = arr[i]

// Time Complexity : 0(n).
// Aux Space Complexity : 0(n).

public class MaximumIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        int res = fun(arr, n);
        System.out.println("Output : " + res);

        sc.close();

    }

    public static int fun(int arr[], int n) {

        // create two array
        // Lmin to store smallest occurring element before the element
        int Lmin[] = new int[n];
        // Rmax to store largest occurring element after the element
        int Rmax[] = new int[n];

        Lmin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Lmin[i] = min(arr[i], Lmin[i - 1]);
        }

        Rmax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            Rmax[j] = max(arr[j], Rmax[j + 1]);
        }

        // Traverse both arrays from left to right to find optimum j - i

        int j = 0, i = 0;
        int maxdiff = 0;
        while (j < n && i < n) {
            if (Lmin[i] <= Rmax[j]) {
                maxdiff = max(maxdiff, (j - i));
                j++;
            } else {
                i++;
            }
        }

        return maxdiff;

    }

    public static int min(int x, int y) {

        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

}
