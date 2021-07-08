import java.util.Scanner;

public class AnagramForString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String : ");
        String str1 = sc.next();
        System.out.println("Enter the 2nd String : ");
        String str2 = sc.next();
        int ans = checkAnagram(str1, str2);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static int checkAnagram(String s1, String s2) {

        // create array
        int arr[] = new int[26];

        for (int i = 0; i < s1.length() ; i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i)-'a']--;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += (int)Math.abs(arr[i]);
        }



        return count;
    }

}
