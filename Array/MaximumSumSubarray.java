import java.util.Scanner;

public class MaximumSumSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int res = fun(arr, n);

        System.out.println("Output : " + res);

        sc.close();
    }

    public static int fun(int arr[], int n) {

        int currsum = arr[0], sum = arr[0], res = arr[0];

        for (int i = 1; i < n; i++) {
            currsum = currsum + arr[i];
            sum = Math.max(arr[i], currsum);
            currsum = sum;
            res = Math.max(res, sum);
        }

        return res;
    }

}
