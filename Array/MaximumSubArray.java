import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubArray {
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

        // ArrayList<Integer> ans = new ArrayList<Integer>();
        System.out.println("Output : ");
        fun(arr, n);

        sc.close();
    }

    public static ArrayList<Integer> fun(int arr[], int n) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        int leftIndex = 0, rightIndex = 0, resLeftIndex = -1, resRightIndex = -1;
        long sum=0, maxSum=0;

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {
                sum += arr[i];

                if ((sum > maxSum) || ((sum == maxSum) && (resRightIndex - resLeftIndex) < (rightIndex - leftIndex))) {
                    resLeftIndex = leftIndex;
                    resRightIndex = rightIndex;
                    maxSum = sum;

                }
            } else {
                sum = 0;
                leftIndex = i + 1;
            }

            rightIndex++;
        }

        if (resLeftIndex != -1 && resRightIndex != -1) {

            for (int j = resLeftIndex; j <= resRightIndex; j++) {

                res.add(arr[j]);
            }
        } else {
            res.add(-1);
        }

        for (int k = 0; k < res.size(); k++) {
            System.out.print(res.get(k) + " ");
        }

        return res;
    }

}
