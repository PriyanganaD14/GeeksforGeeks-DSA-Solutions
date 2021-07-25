import java.util.Scanner;

public class AnagramSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String txt = sc.next();
        System.out.println("Enter the pattern : ");
        String pat = sc.next();
        boolean ans = fun(txt, pat);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean fun(String txt, String pat) {

        int arr1[] = new int[255];
        int arr2[] = new int[255];

        /*
         * int n = txt.length(); int m = pat.length();
         * 
         * if (m > n) { return false; }
         */
        for (int i = 0; i < pat.length(); i++) {
            arr1[txt.charAt(i)]++;
            arr2[pat.charAt(i)]++;
        }

        for (int i = pat.length(); i < txt.length(); i++) {
            if (areSame(arr1, arr2)) {
                return true;
            }
            //add next element of the string
            arr1[txt.charAt(i)]++;
            // delete 1st element of previous window of the string
            arr1[txt.charAt(i - pat.length())]--;
        }

        return false;

    }

    public static boolean areSame(int arr1[], int arr2[]) {

        for (int i = 0; i < 255; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

}
