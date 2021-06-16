import java.util.Scanner;

/**
 * CyclicallyRatatedAnArrayByOne
 */
public class CyclicallyRatatedAnArrayByOne {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        long n = sc.nextLong();
        System.out.println("Enter the array elements : ");
        long arr[] = new long[(int) n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        fun(arr, n);

        for (long i = 0; i < n; i++) {
            System.out.print(arr[(int) i] + " ");
        }

        sc.close();

    }

    public static void fun(long arr[], long n) {

        long temp = arr[(int) n - 1];

        for (long i = n - 1; i > 0; i--) {
            arr[(int) i] = arr[(int) i - 1];
        }

        arr[0] = temp;
    }

}