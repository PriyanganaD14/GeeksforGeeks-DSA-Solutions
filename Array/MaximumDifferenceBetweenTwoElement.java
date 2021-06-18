import java.util.Scanner;

public class MaximumDifferenceBetweenTwoElement {
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

        int ans = fun(arr, n);

        System.out.println("Output : " + ans);

        sc.close();
    }

    public static int fun(int arr[], int n) {

        int minEle=arr[0];
        int maxEle=arr[0];

        for(int i=1;i<n;i++){
            minEle=Math.min(minEle,arr[i]);
            maxEle=Math.max(maxEle,arr[i]);
        }

        int res= maxEle-minEle;

        return res;

    }

}
