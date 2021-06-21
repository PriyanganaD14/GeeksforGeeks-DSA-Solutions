
import java.util.Scanner;

public class FrequenciesOfASortedArray {

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

        fun(arr, n);

        sc.close();
    }

    public static void fun(int arr[], int n) {

        
        int count = 1;
        

        if(arr.length==1){
            System.out.print(arr[0]+" freq is 1");
        }

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;

                if(i==arr.length-1){
                    System.out.print(arr[i]+" freq is "+count);
                }

             
            }

            else {
                System.out.println(arr[i - 1] + " freq is "+count);

                count = 1;

                if(i==arr.length-1){
                    System.out.print(arr[i]+" freq is "+count);
                }

            }
        }

    }
}
