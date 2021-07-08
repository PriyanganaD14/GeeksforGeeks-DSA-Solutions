import java.util.Scanner;

public class Anagram {
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

        // create an array of 26 length
        int arr[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {


            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;

        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;

    }

}
