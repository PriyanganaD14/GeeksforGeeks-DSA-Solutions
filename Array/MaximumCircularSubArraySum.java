import java.util.Scanner;

public class MaximumCircularSubArraySum {
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

        int x1 = kadane(arr, n);
        int x2 = reversekadane(arr, n);

        int finalAns = Math.max(x1, x2);

        return finalAns;

    }

    public static int kadane(int arr[], int n) {

        int currSum = arr[0], maxSum = arr[0], res = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(arr[i], currSum);

            if (maxSum > res) {
                res = maxSum;
            }

            currSum = maxSum;

        }
        return res;
    }

    public static int reversekadane(int arr[], int n) {

        int a = totalSum(arr, n);
        int b = minSumSubarray(arr, n);

        if (a == b) {
            return a;
        }
        int ans = a - b;

        return ans;
    }

    public static int totalSum(int arr[], int n) {

        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int minSumSubarray(int arr[], int n) {

        int currSum = arr[0], minSum = arr[0], res = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = currSum + arr[i];
            minSum = Math.min(arr[i], currSum);

            if (minSum < res) {
                res = minSum;
            }

            currSum = minSum;
        }
        return res;
    }

}
