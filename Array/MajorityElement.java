import java.util.Scanner;

public class MajorityElement {
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
        int res = fun(arr, n);

        System.out.println("Output : " + res);

        sc.close();
    }

    public static int fun(int arr[], int n) {

        int count = 1, res = 0;

        // Find a candidate who can we majority 
        for (int i = 1; i < n; i++) {

            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                res = i;
            }

        }


        // check if the candidate is actually a majority
        int countMajority = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i]) {
                countMajority++;
            }
        }

        if (countMajority <= n / 2) {
            return -1;
        }
        return arr[res];

    }

}
