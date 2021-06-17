import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * LeadersInAnArray
 */
public class LeadersInAnArray {

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

        ArrayList<Integer> ans = new ArrayList<Integer>();

        ans = fun(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        sc.close();

    }

    public static ArrayList<Integer> fun(int arr[], int n) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(arr[n - 1]);

        int leadEle = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= leadEle) {
                res.add(arr[i]);
                leadEle = arr[i];
            }
        }
       Collections.reverse(res);

        return res;
    }
}