import java.util.Scanner;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        char ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static char fun(String s){

        //create an int array 
        int arr[]=new int[256];
    

        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)]++;

        }

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }

        return '$';
    }
    
}
