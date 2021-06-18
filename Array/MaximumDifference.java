//Given an array arr[], find the maximum arr[j] – arr[i] such that arr j > i

// Time Complexity : 0(n*n).
// Aux Space Complexity : 0(1).

import java.util.Scanner;

public class MaximumDifference {
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


       int res=fun(arr,n);
       System.out.println("Output : "+res);

       sc.close();
    }    


    public static int fun(int arr[], int n){

        int ans=arr[1]-arr[0];

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                if(diff>ans){
                    ans=diff;
                }
            }
        }

        return ans;
    }
}


