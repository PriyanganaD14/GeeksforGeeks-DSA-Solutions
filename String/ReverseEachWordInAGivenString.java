import java.util.Scanner;

public class ReverseEachWordInAGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String res = reverseEachWord(str);
        System.out.println("Output : " + res);
        sc.close();
    }

    public static String reverseEachWord(String str) {

        // remove white spaces from begining and ending
        str = str.trim();
        // remove all extra spaces between two words.
        str = str.replaceAll("( )+", " ");
        char ch[] = str.toCharArray();
        int n = ch.length;

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (ch[end] == '.') {
                reverse(ch, start, end - 1); // reverse each word
                start = end + 1;
            }

        }

        // reverse last word
       String res= reverse(ch, start, n - 1);
       return res;
    }

    public static String reverse(char c[], int low, int high) {

        char temp;

        while (low <= high) {
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }

        String ans = new String (c);
        return ans;
    }

}
