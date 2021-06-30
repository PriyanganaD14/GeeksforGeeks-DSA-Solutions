// Based Upon Kadane's algo.

// Time Complexity : 0(n)
// aux Space Complexity : 0(1)



import java.util.Scanner;

public class LongestEvenOddSubarray2 {
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

        System.out.println("Output : ");
        int ans = fun(arr, n);
        System.out.println(ans);

        sc.close();

    }

    public static int fun(int arr[], int n ){

        int count=1, maxCount=1;

        for(int i=1;i<n;i++){
            if(arr[i]%2==0 && arr[i-1]%2==1 || arr[i]%2==1 && arr[i-1]%2==0){
              count++;
              maxCount=Math.max(count, maxCount);
            }
            else{
                count=1;
            }
        }

        return maxCount;
    }
}
