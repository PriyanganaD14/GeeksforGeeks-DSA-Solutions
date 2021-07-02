import java.util.ArrayList;
import java.util.Scanner;

class SubArrayWithGivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            // arr.add(x);
            arr[i] = x;
        }
        System.out.println("Enter the sum value of K : ");
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans = fun(arr, n, k);
        System.out.println("Output : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        sc.close();
    }

    public static ArrayList<Integer> fun(int arr[], int n, int k) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        int currSum = 0, startIndex = 0;
        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];

            // clear the previous window element.
            while (currSum > k) {
                currSum = currSum - arr[startIndex];
                startIndex++;
            }

            if (currSum == k) {
                res.add(startIndex + 1);
                res.add(i + 1);
                break;

            }

        }

        if (res.size() == 0) {
            res.add(-1);
        }

        return res;

    }
}