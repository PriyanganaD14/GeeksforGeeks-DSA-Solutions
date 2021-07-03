import java.util.Scanner;

public class LargestSumContiguousSubArrayHavingOnlyNonNegativeElements {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
       // ArrayList<Integer> arr = new ArrayList<Integer>();
       int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i]=x;
        }

     
        int ans=fun(arr,n);
        System.out.println("Output : "+ans);
        sc.close();
    }

    public static int fun (int arr[], int n){


        int sum=0, maxSum=0;
        for(int i=0;i<n;i++){

            if(arr[i]>=0){
                sum+=arr[i];

                if(maxSum<=sum){
                    maxSum=sum;
                }
            }
            else{
                sum=0;
            }

        
        

        }

        return maxSum;
    }
    
}
