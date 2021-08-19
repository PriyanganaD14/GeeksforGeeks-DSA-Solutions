import java.util.Scanner;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        int ans=countDistinct(arr);
        System.out.println("Output : "+ans);
        
        sc.close();
    }


    public static int countDistinct(int arr[]){

        HashSet<Integer> s= new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }

        return s.size();
    }
    
}
