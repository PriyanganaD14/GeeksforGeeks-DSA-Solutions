// Problem in Driver Code but functional code is fully perfect.

import java.util.Scanner;
import java.util.ArrayList;

//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)

public class StockBuyAndSellGFGPractice {

    

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
        int p = 0;
        for (int i = 0; i < n - 1; i++) {
            p += Math.max(0, arr[i + 1] - arr[i]);
        }
         
        BuySell obj = new BuySell();

        ArrayList<ArrayList<Integer>> res = obj.stockBuySell(arr, n);
        if (res.size() == 0) {
            System.out.print("No Profit");
        } else {
            int c = 0;
            for (int i = 0; i < res.size(); i++) {
                c += arr[res.get(i).get(1) - arr[res.get(i).get(0)]];
            }

            if (c == p) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            System.out.println();
        }

        sc.close();
    }

}





class BuySell{

    ArrayList<ArrayList<Integer>> stockBuySell(int[] arr, int n) {

        // create final returned ArrayList
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        // check array has one element or not
        if (n == 1) {
            return ans;
        }

        // create internal ArrayList
        ArrayList<Interval> sol = new ArrayList<Interval>();

        int i = 0, count = 0; // count -> used to count no of transactions

        // travers whole the array
        while (i < n - 1) { // n-1 is used to avoid index out of bound becoz, we check present array element
                            // with the next array element for the case of buy stock.

            // to find localMinima for buy the stock
            while (i < n - 1 && arr[i] >= arr[i + 1]) {
                i++;
            }

            // when buy is not possible.
            if (i == n - 1) {
                break; // to break travering of the array
            }

            // to add stock buy date

            Interval e = new Interval();
            e.buy = i;
            i++; // increament the i value for further traversing to find localMaxima for stocl
                 // sell

            // to find localMaxima for sell the stock
            while (i < n && arr[i] >= arr[i - 1]) {
                i++;
            }

            // to add stock sell date

            e.sell = i - 1;

            // add one transaction to the sol arrayList.
            sol.add(e);

            count++; // increment the count value becoz one transaction is done.

        }

        // if no transaction has happend after whole array traversing.
        if (count == 0) {
            return ans;
        }

        // when one or more than one transaction has happend
        else {
            // storing buy, sell pairs in the final returned list.
            for (int j = 0; j < sol.size(); j++) {
                ans.add(new ArrayList<Integer>());
                ans.get(j).add(0, sol.get(j).buy);
                ans.get(j).add(1, sol.get(j).sell);
            }
        }

        return ans;

    }
}

class Interval {
    int buy;
    int sell;
}
