// Time Complexity : O(nlogn)
// Aux Space Complexity : O(n)

import java.util.Scanner;
import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String : ");
        String str1 = sc.next();
        System.out.println("Enter the 2nd String : ");
        String str2 = sc.next();
        boolean ans = isAnagram(str1, str2);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        // create 1st char array
        char a[] = s1.toCharArray();
        // sort 1st char array
        Arrays.sort(a);
        // store sorted contain in 1st string
        s1 = new String(a);

        // create 2nd char array
        char b[] = s2.toCharArray();
        // sort 2nd char array
        Arrays.sort(b);
        // store sorted contain in 2nd string
        s2 = new String(b);
        // if two arrays are identical then return true
        return s1.equals(s2);

    }

}
