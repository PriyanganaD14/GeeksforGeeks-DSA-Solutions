import java.util.Scanner;

public class LeftRotateAnArrayByD2 {
    public static void main (String[] args) {
	    
	    Scanner sc =new Scanner(System.in);
	    
	    //no of test cases
        System.out.println("Enter the number of test cases : ");
	    int T=sc.nextInt();
	    
	    while(T-->0){
	        
	        //no of array length
            System.out.println("Enter the length : and D :");
	        int N=sc.nextInt();
	        int D=sc.nextInt();
	        
	        //array :
	        int arr[]=new int[N];
            System.out.println("Enter the array elements : ");
	        for(int i=0;i<N;i++){
	            int X=sc.nextInt();
	            arr[i]=X;
	        }
	        
	        fun(arr,D);
	        
	        //print output array:
            System.out.println("Output : ");
	        for(int i=0;i<N;i++){
	            System.out.print(arr[i]+" ");
	        }
	        
	        System.out.println("");
	    }
	    
	    sc.close();
	    
		//code
	}
	
    	 public static void fun(int arr[], int d){
	    
	    int n= arr.length;
	    
	    reverse(arr,0,d-1);
	    reverse(arr,d,n-1);
	    reverse(arr,0,n-1);
	    
	}
	
	 public static int[] reverse(int arr[], int x, int y){
	    
	     while(x<y){
	         int temp=arr[x];
	         arr[x]=arr[y];
	         arr[y]=temp;
	         x++;
	         y--;
	       
	     }
	     
	     return arr;
	}
    
}
