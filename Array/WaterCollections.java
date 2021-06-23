// Time Complexity : 0(n)
// Aux Space Complexity : 0(1).

import java.util.Scanner;

public class WaterCollections {

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

        int res = fun(arr, n);
        System.out.print("Output : " + res);

        sc.close();

    }

    public static int fun(int arr[], int n) {

        if(n==0){
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = n - 1;
        int leftMax = arr[0];
        int rightMax = arr[n - 1];
        int ans = 0;

        // until left index is smaller than right index
        while (leftIndex <= rightIndex) {

            // if left max is larger than right max
            if (leftMax <= rightMax) {

                // check present element is larher than left max
                if (arr[leftIndex] > leftMax) {
                    leftMax = arr[leftIndex]; // so no water is collected and update left max
                } else {
                    ans += leftMax - arr[leftIndex]; // so collected
                }
                leftIndex++; // increament for further traversing

            }

            // if right max is larger than left max
            else {

                // check present element is larger than right max.
                if (arr[rightIndex] > rightMax) {
                    rightMax = arr[rightIndex]; // so no water is collected and update right max
                } else {
                    ans += rightMax - arr[rightIndex]; // so collected
                }
                rightIndex--; // decreament for further traversing
            }

        }
        return ans;
    }

}
