import java.util.Scanner;

public class EqulibriumPoint {
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

        int ans=fun(arr,n);
        System.out.println("Output : "+ans);

        sc.close();
    }

    public static int fun(int arr[], int n){


        // calculate total sum of all array elements

        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }

        int lSum=0;
        for(int i=0;i<n;i++){
            if(lSum==totalSum-arr[i]){
                return i+1;
            }
            else{
                lSum+=arr[i];
                totalSum-=arr[i];
            }
        }

        return -1;
    }
    
}
