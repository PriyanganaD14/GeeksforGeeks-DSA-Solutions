import java.util.Scanner;

public class MaximumConsecutive1sInBinaryArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n =sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        int res=fun(arr, n);

        System.out.println("Output : "+res);

        sc.close();
    }
    

    public static int fun(int arr[], int n){

        int count=0, res=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                res=Math.max(res, count);
            }
            else{
                count=0;
            }
        }

        return res;
    }
}
