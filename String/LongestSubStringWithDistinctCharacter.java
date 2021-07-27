// Rank of Permutation.

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubStringWithDistinctCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        int ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static int fun(String str) {

        int n = str.length();

        // create array and fill with -1.
        int prev[] = new int[256];
        Arrays.fill(prev, -1);

        // starting index
        int i = 0;
        int res = 0;
        for (int j = 0; j < n; j++) {
            // calculate staring index
            i = Math.max(i, prev[str.charAt(j)] + 1);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);
            prev[str.charAt(j)] = j;

        }

        return res;
    }

}
