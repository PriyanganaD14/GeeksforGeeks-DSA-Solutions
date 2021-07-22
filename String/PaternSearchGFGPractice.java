
// Time Complexity : O(n)
// for Distinct Elements

import java.util.Scanner;

public class PaternSearchGFGPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the txt : ");
        String txt = sc.next();
        System.out.println("Enter the pat : ");
        String pat = sc.next();
        // System.out.println("Output : ");
        boolean ans = fun(txt, pat);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static boolean fun(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        for(int i=0;i<=n-m;){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
                if(j==m-1){
                    return true;
                }
            }
            if(j==0){
                i++;
            }
            else{
                i=i+j;
            }
        }

        return false;
    }
}
