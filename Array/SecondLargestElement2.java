import java.util.Scanner;

public class SecondLargestElement2 {
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

        sc.close();
        System.out.print("Output : " + fun(arr, n));

    }

    public static int fun(int arr[], int n){

        int largestEle=-1, secondLargeEle=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestEle){
                secondLargeEle=largestEle;
                largestEle=arr[i];
            }

            else if (arr[i]>secondLargeEle && arr[i]<largestEle){
                secondLargeEle=arr[i];
            }
        }

        return secondLargeEle;
    }
}
