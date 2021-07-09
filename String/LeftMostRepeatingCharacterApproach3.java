import java.util.Scanner;

public class LeftMostRepeatingCharacterApproach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        char ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }


    public static char fun(String s){

        boolean arr[]=new boolean[256];

        char res='#';
        for(int i=s.length()-1;i>=0;i--){
            if(arr[s.charAt(i)]){
                //arr[s.charAt(i)]=true;
                res=s.charAt(i);
            }
            else{
                  arr[s.charAt(i)]=true;
            }
        }
        
        return res;


    }
    
}
