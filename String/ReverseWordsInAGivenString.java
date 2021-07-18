import java.util.Scanner;

/**
 * ReverseWordsInAGivenString
 */
public class ReverseWordsInAGivenString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String res=reverseWords(str);
        System.out.println("Output : " + res);
        sc.close();

    }

    public static String reverseWords(String ss) {

         char s[]=ss.toCharArray();

        int start = 0;
        int n = s.length;

        for (int end = 0; end < n; end++) {

            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }

        }

        reverse(s, start, n - 1);
        String s3 = reverse(s, 0, n - 1);
       // System.out.println(s3);
        return s3;

    }

    public static String reverse(char ch[], int low, int high) {
       // char ch[] = s.toCharArray();

        while (low <= high) {

            char temp;
            temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }

        String ans = new String(ch);

        return ans;
    }
}