import java.util.Scanner;

public class ImplementStrStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text : ");
        String txt=sc.next();
        System.out.println("Enter the pattern : ");
        String pat=sc.next();
        int ans=fun(txt,pat);
        System.out.println("Output : "+ans);
        sc.close();
     
    }

    public static int fun(String s, String x){

        int n=s.length();
        int m=x.length();
        
        for(int i=0;i<=n-m;i++){
            int j;
            
            for(j=0;j<m;j++){
                if(s.charAt(i+j)!=x.charAt(j)){
                    break;
                
                }
                
                if(j==m-1){
                    return i;
                }
            }
            
        }
        
        return -1;
    }
    
}
