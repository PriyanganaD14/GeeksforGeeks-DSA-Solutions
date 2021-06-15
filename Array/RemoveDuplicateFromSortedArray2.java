//Time Complexity : O(n)
//Aux Space Complexity : O(1)

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray2 {
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
        sc.close();

        fun(arr, n);

    }

    public static void fun(int arr[], int n) {

        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                System.out.print(arr[i] + " ");
            }

        }

    }

}
