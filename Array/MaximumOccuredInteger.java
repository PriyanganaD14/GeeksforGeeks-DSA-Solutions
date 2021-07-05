
import java.util.Scanner;

public class MaximumOccuredInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements of the arrays L and R : ");
        int n = sc.nextInt();
        System.out.println("Enter L array : ");
        int l[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l[i] = x;
        }
        System.out.println("Enter R array : ");
        int r[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            r[i] = x;
            if (r[i] > max) {
                max = r[i];
            }
        }
        int ans = fun(l, r, n, max);
        System.out.println("Output : " + ans);

        sc.close();
    }

    public static int fun(int l[], int r[], int n, int m) {

        // create array of 1000 elements and store all values zero.
        int arr[] = new int[100000];

        // increament the starting indexes of all ranges
        for (int i = 0; i < n; i++) {
            arr[l[i]]++;
        }

        // decreament the ending indexes+1 of all ranges to balance the prefix sum
        for (int i = 0; i < n; i++) {
            arr[r[i] + 1]--;
        }

        // calculate prefix sum of new array and as well as result .

        int sum = 0, maxSum = Integer.MIN_VALUE, res = 0;
        for (int i = 0; i < 100000; i++) {
            sum += arr[i];
            if (maxSum < sum) {
                maxSum = sum;
                res = i;
            }
        }

        return res;

    }

}
