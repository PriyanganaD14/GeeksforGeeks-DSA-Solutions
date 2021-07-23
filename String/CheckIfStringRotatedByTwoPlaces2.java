//Expected Time Complexity: O(N).
//Expected Auxilary Complexity: O(N).

import java.util.Scanner;

public class CheckIfStringRotatedByTwoPlaces2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String txt = sc.next();
        System.out.println("Enter the String 2 : ");
        String pat = sc.next();
        boolean ans = fun(txt, pat);
        System.out.println("Output : " + ans);
        sc.close();

    }

    public static boolean fun(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        // if two length are different
        if (n != m) {
            return false;
        }

        // if single character
        if (n < 2) {
            if (str1.equals(str2)) {
                return true;
            } else {
                return false;
            }
        }

        String temp1 = "";
        String temp2 = "";

        // right rotation
        temp1 = temp1.concat(str1.substring(2, n));
      //  System.out.println(temp1);
        temp1 = temp1.concat(str1.substring(0, 2));
        //System.out.println(temp1);

        // left rotation

        temp2 = temp2.concat(str1.substring(n - 2, n));
    //    System.out.println(temp2);
        temp2 = temp2.concat(str1.substring(0, n - 2));
      //  System.out.println(temp2);

        if (temp1.equals(str2) || temp2.equals(str2)) {
            return true;
        }

        return false;

    }
}
