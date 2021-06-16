// Efficient Soln 
// Time  Complexity : O(n)
// Aux Space Complexity : O(1)

import java.util.Scanner;

public class LeftRotateAnArrayByD {
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

        System.out.println("Enter D : ");
        int d = sc.nextInt();

        fun(arr, n, d);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

    public static void fun(int arr[], int n, int d) {

     // To avoid index out of bound
        d=d%n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static int[] reverse(int arr[], int x, int y) {

        while (x < y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }

        return arr;

    }

}
