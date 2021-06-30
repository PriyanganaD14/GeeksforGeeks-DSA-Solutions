// Time Complexity : 0(n)
// aux Space Complexity : 0(n)

import java.util.Scanner;

public class LongestEvenOddSubarray {
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

        System.out.println("Output : ");
        int ans = fun(arr, n);
        System.out.println(ans);

        sc.close();

    }

    public static int fun(int arr[], int n) {

        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                res[i] = 0;
            } else {
                res[i] = 1;
            }
        }

        int count = 1, maxCount=1;
        for (int i = 1; i < res.length; i++) {
            if ((res[i - 1] == 0 && res[i] == 1) || (res[i - 1] == 1 && res[i] == 0)) {
                count++;
                maxCount=Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }

        return maxCount;

    }

}
