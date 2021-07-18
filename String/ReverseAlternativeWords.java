import java.util.Scanner;

public class ReverseAlternativeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String res = reverseAlternative(str);
        System.out.println("Output : " + res);
        sc.close();
    }

    public static String reverseAlternative(String str) {

        // remove trimimg white spaces
        str = str.trim();
        // remove all extra white spaces in between words
        str = str.replaceAll("( )+", " ");

        char c[] = str.toCharArray();
        int n = c.length;

        int start = 0, count = 0;
        String res = " ";

        for (int end = 0; end < n; end++) {

            if (c[end] == ' ') {
                count++;
                if (count == 1 || count % 2 == 1) {
                    res = same(c, start, end - 1);
                    start = end + 1;
                }
                if (count % 2 == 0) {
                    res = reverse(c, start, end - 1);
                    start = end + 1;
                }
            }
        }

        // condition will be change, becoz last space is not count.
        if (count % 2 == 1) {
            res = reverse(c, start, n - 1);
        }

        // if only one string contained in the whole line.
        if(res==" "){
            res=str;
        }
        
        return res;
    }

    public static String reverse(char[] ch, int low, int high) {

        char temp;

        while (low <= high) {

            temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            high--;
            low++;

        }

        String ans = new String(ch);
        return ans;
    }

    public static String same(char[] ch, int low, int high) {
        String ans = new String(ch);
        return ans;
    }

}
