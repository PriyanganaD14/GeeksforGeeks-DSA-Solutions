//Given an array arr[], find the maximum arr[j] – arr[i] such that arr j > i

// Time Complexity : 0(n).
// Aux Space Complexity : 0(1).


import java.util.Scanner;

/**
 * MaximumDifference2
 */
public class MaximumDifference2 {

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


    public static int fun (int arr[], int n ){

        int res=arr[1]-arr[0];
        int minVal=arr[0];

        for(int j =1;j<n;j++){

           // 1) Maximum difference found so far (max_diff). 
           // 2) Minimum number visited so far (min_element).
            res=Math.max(res, arr[j]-minVal);
            minVal=Math.min(minVal, arr[j]);
        }

        return res;
    }
}