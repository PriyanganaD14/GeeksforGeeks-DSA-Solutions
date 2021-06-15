
/**
 * SearchingUnsortedArray
 */
import java.util.Scanner;

public class SearchingUnsortedArray {

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
        System.out.println("Enter the searching element : ");
        int s = sc.nextInt();
        System.out.println("Output index : " + fun(arr, s));
        sc.close();
    }

    public static int fun(int arr[], int s) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;

    }
}