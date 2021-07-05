// This code is not passed all the test cases.

import java.util.Scanner;

public class ThreeEqualSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        fun(arr, n);

        sc.close();
    }

    public static int fun(int arr[], int n) {

        int totalSum = arr[0];

        for (int i = 1; i < n; i++) {
            totalSum += arr[i];
        }

        if (totalSum % 3 != 0) {
            System.out.println("Three Equal Sum Split is not possible");
            return 0;
        }

        int s1 = totalSum /3;
        int s2 = 2 * s1;
        int i = -1, j = -1;

        int preSum = 0;
        for (int k = 0; k < n; k++) {

            preSum += arr[k];
            if (preSum == s1 && i == -1) {

                i = k;

            } else if (preSum == s2 && i != -1) {
                j = k;

                break;
            }

        }

        if (i != -1 && j != -1) {
            System.out.println("(" + i + "," + j + ")");
            return 1;
        }

        return 0;

    }

}
