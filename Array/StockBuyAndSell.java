
// Time Complexity : 0(n2)

/**
 * StockBuyAndSell
 */

import java.util.Scanner;

public class StockBuyAndSell {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.println("Output : ");
        int res = fun(arr, 0, arr.length - 1);
        System.out.println(res);

        sc.close();

    }

    public static int fun(int arr[], int start, int end) {

        // if array have one or less than one element
        if (end <= start) {

            return 0;

        }

        int curProfit = 0;
        int maxProfit = 0;

        for (int i = start; i <= end - 1; i++) {
            for (int j = i + 1; j <= end; j++) {
                curProfit = arr[j] - arr[i] + fun(arr, start, i-1) + fun(arr, j+1, end);
                maxProfit = Math.max(curProfit, maxProfit);
            }
        }

        return maxProfit;

    }
}