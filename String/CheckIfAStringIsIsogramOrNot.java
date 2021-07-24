import java.util.Scanner;

public class CheckIfAStringIsIsogramOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        boolean ans=fun(str);
        System.out.println("Output : "+ans);
        sc.close();
    }

    public static boolean fun (String data){

        int arr[]=new int[255];
        

        for(int i=0;i<data.length();i++){
            arr[data.charAt(i)]++;
        }

        for(int i=0;i<255;i++){
            if(arr[i]>1){
                return false;
            }
        }
        return true;
    }
    
}
