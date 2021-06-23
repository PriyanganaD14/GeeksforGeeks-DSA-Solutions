// Time Complexity : 0(n)
// Aux Space Complexity : 0(n).

import java.util.Scanner;

/**
 * TrappingRainWater2
 */
public class TrappingRainWater2 {

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
        System.out.print("Output : " + res);

        sc.close();

    }

    public static int fun(int arr[], int n) {

        int Lmax[] = new int[n];
        Lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Lmax[i] = Math.max(arr[i], Lmax[i - 1]);
        }

        int Rmax[] = new int[n];
        Rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            Rmax[i] = Math.max(arr[i], Rmax[i + 1]);
        }

        int ans = 0;

        for (int i = 1; i < n - 1; i++) {

            ans += (Math.min(Lmax[i], Rmax[i]) - arr[i]);

        }

        return ans;

    }

}