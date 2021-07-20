//Time Complexity: O(N*M).

import java.util.Scanner;

public class NaivePatternSearchingPractice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the text : ");
        String txt=sc.next();
        System.out.println("Enter the pattern : ");
        String pat=sc.next();
        boolean ans=fun(txt,pat);
        System.out.println("Output : "+ans);
        sc.close();
        
    }

    public static boolean fun(String txt, String pat){

        int n=txt.length();
        int m=pat.length();

        if(m>n){
            return false;
        }
        if(txt.contains(pat)){
            return true;
        }

        return false;
    }
    
}
