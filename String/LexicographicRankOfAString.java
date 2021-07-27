// all test cases are not passed.

// count Lexicographically smaller string +1

import java.util.Scanner;

public class LexicographicRankOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        int ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static int fun(String str) {

        // strore +1
        int res = 1;
        int n = str.length();
        int mod=10000007;

        // create calculate factorial function
        int mul = fact(n);

        // create count arr
        int count[] = new int[255];

        // count the freq
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

          
        // check for repeating elements
        for(int i=0;i<255;i++){
            if(count[i]>1){
                return 0;
            }
        }

        // calculate how many string elements are smaller than every string
        for (int i = 1; i < 255; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n - 1; i++) {

            // calculate the permutation
            mul = mul / (n - i);
            res += (count[str.charAt(i) - 1] * mul)%mod;

            // to remove one by one element to calculate exact how many no of elements
            // smaller
            for (int j = str.charAt(i); j < 255; j++) {

                count[j]--;

            }
        }

        return res%mod;
    }

    public static int fact(int n) {

        int f = 1;
        int mod=10000007;

        while (n > 0) {
            f = (f * n)%mod;
            n = n - 1;

        }

        return f;
    }

}
