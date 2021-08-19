// Time Complexity : 0(n)
// Aux Space Complexity : O(n)

import java.util.Scanner;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencisOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        printFreq(arr);

        sc.close();


    }

    public static void printFreq(int arr[]){

        LinkedHashMap<Integer, Integer> h = new LinkedHashMap<>();

        

        for(int i=0;i<arr.length;i++){

          if(h.containsKey(arr[i])==true){
              h.put(arr[i], h.get(arr[i])+1);
          }
          else{
              h.put(arr[i], 1);
          }

        }

        for(Map.Entry<Integer, Integer> irc : h.entrySet()){
            System.out.println(irc.getKey()+" "+irc.getValue());
        }
       
    }
    
}
