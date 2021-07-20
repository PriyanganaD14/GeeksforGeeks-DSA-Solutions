//Time Complexity: O(N*M).

import java.util.Scanner;

public class NaivePatternSearchingPractice {
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

        int m=pat.length();
        int n=txt.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
                if(j==m-1){
                    return true;
                }
            }
        }

        return false;
    }
    
}
