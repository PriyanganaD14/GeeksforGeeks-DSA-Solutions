

// Time  Complexity : 0(n)

import java.util.Scanner;

public class StockBuyAndSell2 {
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

      int res=fun(arr,n);
      System.out.print("Output : "+res);

        sc.close();
    }

    public static int fun(int arr[], int n){

        int profit=0;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }

        return profit;
    }
    
}
