import java.util.Scanner;

public class MNoOfNBonnaciNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        System.out.println("Enter M : ");
        int m=sc.nextInt();

        fun(n,m);

        sc.close();
        
    }

    public static void fun(int n, int m){

        // create array of size m

        int arr[]=new int [m];

        for(int i=0;i<m;i++){
            arr[i]=0;
        }

        arr[n-1]=1;
        arr[n]=1;

        for(int i=n+1;i<m;i++){

            arr[i]=(2* arr[i-1])-arr[i-n-1];

        }

        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
