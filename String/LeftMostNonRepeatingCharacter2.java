import java.util.Arrays;
import java.util.Scanner;

public class LeftMostNonRepeatingCharacter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        char ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static char fun(String s){

        // careate an int array 
        int arr[]=new int[256];

        // fills it with -1.
        Arrays.fill(arr, -1);

        for(int i=0;i<s.length();i++){

            // never appeared element
            if(arr[s.charAt(i)]==-1){
                // store index no 
                arr[s.charAt(i)]=i;

            }
            // atlest one time appeared
            else{
                  arr[s.charAt(i)]=-2;
            }

            // elements with are not present in the array are remain -1.
        }

        int res=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){

            // one the appeared
            if(arr[i]>=0){
                // return lower index
                 res=Math.min(res, arr[i]);
            }

        }

        if(res==Integer.MAX_VALUE){
            return '$';
        }
        return s.charAt(res);
    }
    
}
