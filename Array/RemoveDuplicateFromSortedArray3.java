//Time Complexity : O(n)
//Aux Space Complexity : O(1)

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases : ");
        int t=sc.nextInt();
        while(t-->0){
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        
        Solution g =new Solution();
        int m =g.fun(arr,n);

        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");

        }

        System.out.println();

        sc.close();

       // System.out.print("Output : " + fun(arr, n));

    }

}

}

class Solution{

    public  int fun(int A[], int N) {

        int res = 1;

        for (int i = 1; i < A.length; i++) {

            if (A[res-1] != A[i]) {
                A[res] = A[i];
                res++;

            }

        }

         return res;

    }

}


