// Time Complexity : O(n).
// Aux Space Complexity : O(n).

import java.util.Scanner;

public class CheckIfStringsAreRotations {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String s1=sc.next();
        System.out.println("Enter the 2nd string : ");
        String s2=sc.next();
        boolean ans=fun(s1,s2);
        System.out.println("Output : "+ans);
        sc.close();


    }

    public static boolean fun(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        
        String str=s1.concat(s1);

        if(str.indexOf(s2)>=0){
            return true;
        }
        return false;
        
       // return ((s1+s1).indexOf(s2)>=0);
    }
    
}
