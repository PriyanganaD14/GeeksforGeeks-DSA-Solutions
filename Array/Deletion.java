import java.util.Scanner;

public class Deletion {

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
        System.out.println("Enter the deleting element : ");
        int e=sc.nextInt();
        sc.close();

        fun (arr,n,e);
        
    }


    public static void fun(int arr[], int n, int e){

       int anotherarray[]=new int[n];


    
       

        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]==e){
                continue;
            }

            anotherarray[k]=arr[i];
            k++;
        }

      
        for(int i=0;i<anotherarray.length;i++){
            System.out.print(anotherarray[i]+" ");
        }

    }
    
}
