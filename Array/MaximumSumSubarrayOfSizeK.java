// correction will coming soon after seeing  2 pointer approach.

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        int res = fun(arr, n, k);

        System.out.println("Output : " + res);

        sc.close();
    }

    public static int fun(ArrayList<Integer> arr, int n, int k) {

        int x = k, sum = 0, res = 0, i;

        for ( i = 0; i < n; i++) {

            if (x > 0) {
                sum = sum + arr.get(i);
                x--;
                continue;
            } else {
                x = k;
                res = Math.max(res, sum);
                sum=0;
                
            }

           // res = Math.max(res, sum);
        }
        return res;

    }

}
