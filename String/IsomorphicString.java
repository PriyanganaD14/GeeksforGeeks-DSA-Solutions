import java.util.Scanner;

/**
 * IsomorphicString
 */
public class IsomorphicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String : ");
        String str1 = sc.next();
        System.out.println("Enter 2nd String : ");
        String str2 = sc.next();
        boolean ans = fun(str1, str2);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean fun(String str1, String str2) {

        int arr1[]=new int[255];
        int arr2[]=new int[255];

        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){

            arr1[str1.charAt(i)]++;
            arr2[str2.charAt(i)]++;

            if(arr1[str1.charAt(i)]!=arr2[str2.charAt(i)]){
                return false;
            }
        }

        return true;
    }
}