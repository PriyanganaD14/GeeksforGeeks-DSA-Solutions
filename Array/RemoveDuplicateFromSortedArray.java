//Time Complexity : O(n);
//Aux Space Complexity : O(n);

import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicateFromSortedArray {

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

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                a.add(arr[i]);
            }

        }

        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }

}
