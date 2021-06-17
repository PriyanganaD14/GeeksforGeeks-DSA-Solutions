import java.util.Arrays;
import java.util.Scanner;

public class MeanAndMedian {
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

        System.out.println("Output : ");
        
        int meadian=median(arr, n);
        System.out.println("Median : "+meadian);

        int mean=mean(arr, n);
        System.out.println("Mean : "+mean);

        sc.close();
    }

    public static int median(int arr[], int n) {

        Arrays.sort(arr);

        int resMedian = 0;

        if (n % 2 != 0) {

            resMedian = arr[n / 2];

        } else {
            resMedian =(arr[n / 2] + arr[(n / 2) - 1]) / 2;
        }

        return resMedian;

    }

    public static int mean(int arr[], int n) {

        int sum = 0, resMean = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            resMean = sum / n;

        }

        return resMean;

    }

}
