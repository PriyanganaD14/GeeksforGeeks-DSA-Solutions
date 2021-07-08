import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        int ans = isPal(str);
        System.out.println("Output : " + ans);
        sc.close();

    }

    public static int isPal(String str) {

        int begin = 0;
        int end = str.length() - 1;

        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return 0;
            }
            begin++;
            end--;
        }

        return 1;

    }

}
