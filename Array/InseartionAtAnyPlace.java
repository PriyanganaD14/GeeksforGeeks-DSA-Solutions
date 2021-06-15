import java.util.Scanner;

public class InseartionAtAnyPlace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int capacity = sc.nextInt();
        System.out.println("Enter the no of elements first present in the array  :");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[capacity];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println("Enter the inserting element : ");
        int s = sc.nextInt();
        System.out.println("Enter the insearting index position : ");
        int p=sc.nextInt();
        fun(arr, capacity, n, s, p);
        sc.close();

    }

    public static void fun (int arr[], int capacity, int n, int s, int p){

        if(n==capacity){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

        else if(p>capacity){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
         else{
                int temp =n;
                while(temp>p){

                    arr[temp]=arr[n-1];
                    temp--;
                    n--;

                }

               
                for(int i=0;i<arr.length;i++){
                    arr[p]=s;
                    System.out.print(arr[i]+" ");
                }
         }

    }
    
}
