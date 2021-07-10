import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        String ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static String fun(String s) {

        // string must be convert into a char array .
        char c[] = s.toCharArray();

        int low = 0, high = s.length() - 1;

        while (low <= high) {
            char temp;
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }

        // char array convert into String

        String res = new String(c);
        return res;

    }

}
