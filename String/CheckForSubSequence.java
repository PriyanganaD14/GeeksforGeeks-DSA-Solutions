import java.util.Scanner;

public class CheckForSubSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the small String : ");
        String str1 = sc.next();
        System.out.println("Enter the main String : ");
        String str2 = sc.next();
        boolean ans = isSubSequence(str1, str2);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean isSubSequence(String s1, String s2) {

        int i = 0, j = 0;
        int l1=s1.length()-1,l2=s2.length()-1;


        while (i <= l1 && j <= l2) {

            if (i == l1) {
                return true;
            }

            if (j == l2 && i < l1) {
                return false;
            }

            if (s1.charAt(i) != s2.charAt(j)) {
                j++;
            } else if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            }
        }

        return false;

    }
}
