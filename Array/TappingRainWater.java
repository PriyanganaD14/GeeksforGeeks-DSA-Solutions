// Time Complexity : 0(n2)

import java.util.Scanner;

public class TappingRainWater {

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

        int ans = 0;

        for (int i = 1; i < n - 1; i++) {

            // calculate Left max for every middle bar
            int Lmax = arr[i];
            for (int j = 0; j < i; j++) {
                Lmax = Math.max(arr[j], Lmax);
            }

            // calculate right max for every middle bar
            int Rmax = arr[i];
            for (int j = i + 1; j < n; j++) {
                Rmax = Math.max(arr[j], Rmax);
            }

            // calculate min between two side bar
            int minSideBar = Math.min(Lmax, Rmax);

            // calculate water collections

            ans += minSideBar - arr[i];

        }

        return ans;
    }

}
