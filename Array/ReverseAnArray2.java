import java.util.Scanner;

public class ReverseAnArray2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the length of the array : ");
            int n = sc.nextInt();
            System.out.println("Enter the array elements : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x;
            }
         

            fun(arr, n);

        }

        sc.close();

    }

    public static void fun(int arr[], int n) {

        int low = 0, high = n - 1, temp;

        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }


        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println(" ");
    }

}
