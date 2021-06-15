import java.util.Scanner;

/**
 * LargestElement
 */
public class LargestElement {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        sc.close();
        System.out.print("Output : "+fun(arr,n));
    }

    public static int fun(int arr[], int n){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
     return ans;
    
    }

   
}