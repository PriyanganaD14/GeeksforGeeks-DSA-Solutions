//test cases failure
import java.util.Scanner;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        int ans=fun(str);
        System.out.println("Output : "+ans);
        sc.close();
    }

    public static int fun(String s){

        int c=256;

        int arr[]=new int[c];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }

        for(int i=0;i<c;i++){
            if(arr[s.charAt(i)]>1){
                return i;
            }
        }

        return -1;

    }
    
}
