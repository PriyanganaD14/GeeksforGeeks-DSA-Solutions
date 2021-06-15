import java.util.Scanner;

public class InseartionAtEnd {
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
        fun(arr, capacity, n, s);
        sc.close();

    }

    public static void fun(int arr[], int capacity, int n, int s) {
        if (capacity == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
        } else {
            for (int i = 0; i <= n; i++) {
                arr[n] = s;
                System.out.print(arr[i] + " ");
            }
        }

    }

}
