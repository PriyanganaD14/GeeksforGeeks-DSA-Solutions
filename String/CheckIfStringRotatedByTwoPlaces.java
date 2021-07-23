//Expected Time Complexity: O(N).
//Expected Auxilary Complexity: O(N).

import java.util.Scanner;

public class CheckIfStringRotatedByTwoPlaces {
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


        if(n==1){
            if(str1.compareTo(str2)==0){
                return true;
            }
           return false;
        }

        String t1 = rotate(str1, 0, 1);
        System.out.println("t1 : " + t1);
        String t2 = rotate(t1, 2, n - 1);
        System.out.println("t2 : " + t2);
        String t3 = rotate(t2, 0, n - 1);
        System.out.println("t3 : " + t3);

        if (t3.compareTo(str2) == 0) {
            return true;
        }
        else{
            String t4 = rotate(str1, 0, n-3);
        System.out.println("t1 : " + t1);
        String t5 = rotate(t4, n-2, n - 1);
        System.out.println("t2 : " + t2);
        String t6 = rotate(t5, 0, n - 1);
        System.out.println("t3 : " + t3);

        if(t6.compareTo(str2)==0){
            return true;
        }

        }

        return false;
    }

    public static String rotate(String str, int low, int high) {
        char c[] = str.toCharArray();

        char temp;

        while (low <= high) {
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }

        String ans=new String(c);

        return ans;
    }

}
