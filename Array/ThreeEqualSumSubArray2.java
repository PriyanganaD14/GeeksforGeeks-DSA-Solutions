// passed all test cases

import java.util.ArrayList;
import java.util.Scanner;

class ThreeEqualSumSubArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        ArrayList<Integer> res= fun(arr, n);

        for(int j=0;j<res.size();j++){

            System.out.print(res.get(j)+" ");

        }

        sc.close();


    }

    public static ArrayList<Integer> fun(int arr[], int n){


        ArrayList<Integer> ans =new ArrayList<Integer>();

        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];

        }

        if(totalSum%3!=0){
            ans.add(-1);
            return ans;
        }


        int s=totalSum/3,currSum=0,count=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum==s){
                ans.add(i);
                count++;
                currSum=0;
            }

            if(count==2){
                return ans;
            }

            

        }

        return ans;

    }
    
}
