import java.util.Scanner;

class MinManupulationToMakeStringAnagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the String : ");
        int n=sc.nextInt();
        System.out.println("Enter the 1st String : ");
        String str1 =sc.next();
        System.out.println("Enter the 2st String : ");
        String str2=sc.next();
        int ans= fun(n,str1,str2);
        System.out.println("Output : "+ans);
        sc.close();
        
        
    }

    public static int fun( int N, String S1, String S2){


        int arr[]=new int[255];
        
        for(int i=0;i<N;i++){
            
            arr[S1.charAt(i)]++;
            arr[S2.charAt(i)]--;
            
        }
        
        
        int sum=0;
        for(int i=0;i<255;i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        
        return sum;
    }

    
}
