import java.util.Scanner;

/**
 * CountOccurancesOfAnagram
 */
public class CountOccurancesOfAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String txt = sc.next();
        System.out.println("Enter the pattern : ");
        String pat = sc.next();
        int ans = fun(txt, pat);
        System.out.println("Output : " + ans);

        sc.close();
    }

    public static int fun(String txt, String pat) {

        int arr1[] = new int[255];
        int arr2[] = new int[255];

        for (int i = 0; i < pat.length(); i++) {
            arr1[txt.charAt(i)]++;
            arr2[pat.charAt(i)]++;
        }

        int count = 0;
        for (int i = pat.length(); i <=txt.length(); i++) {

            if (areSame(arr1, arr2)) {
                count++;

            }

            // to avoid length out of bound
            if(txt.length()!=i){
            arr1[txt.charAt(i)]++;
            arr1[txt.charAt(i - pat.length())]--;
            }
        }

        return count;
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