import java.util.Scanner;

public class LeftRotateAnArrayByOne {
    public static void main(String args[]) {

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

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

    public static void fun(int arr[], int n) {

        int temp = arr[0];

        for (int i = 0; i <n-1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp;
    }

}
