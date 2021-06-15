import java.util.Scanner;

public class ReverseAnArray {public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of test cases : ");
    int t =sc.nextInt();
    while (t-->0){
    System.out.println("Enter the length of the array : ");
    int n=sc.nextInt();
    System.out.println("Enter the array elements : ");
    int arr[]=new int [n];
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        arr[i]=x;
    }
    sc.close();

    fun(arr,n);
}

    
}

 public static void fun (int arr[], int n){
     for(int i=arr.length-1;i>=0;i--){
         System.out.print(arr[i]+" ");
     }
 }

}
