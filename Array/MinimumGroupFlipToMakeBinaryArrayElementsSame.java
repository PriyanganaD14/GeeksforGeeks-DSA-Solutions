import java.util.Scanner;

/**
 * MinimumGroupFlipToMakeBinaryArrayElementsSame
 */
public class MinimumGroupFlipToMakeBinaryArrayElementsSame {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        fun(arr, n);

        sc.close();
    }

    public static void fun(int arr[], int n) {

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.print(i - 1);
                    System.out.println("");
                }
            }

        }

        
        if (arr[n - 1] != arr[0]) {
            System.out.print(n - 1);
            System.out.println("");
        }
        
    }

}