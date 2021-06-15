// Time Complexity : O(n)
// Aux Space Complexity : O(1)

import java.util.Scanner;

public class MoveZerosToTheEnd2 {

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

        fun(arr, n);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }

    public static void fun (int arr[], int n){

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){

                int temp =arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
    }
    
}
