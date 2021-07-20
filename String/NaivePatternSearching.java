// Time Complexity : O((n+m-1)*m)

import java.util.Scanner;

public class NaivePatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String txt = sc.next();
        System.out.println("Enter the pattern : ");
        String pat = sc.next();
        System.out.println("Output : ");
        fun(txt, pat);
        sc.close();

    }

    public static void fun(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {

                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }

                if (j == m - 1) {
                    System.out.print(i + " ");
                }

            }
        }
    }

}
