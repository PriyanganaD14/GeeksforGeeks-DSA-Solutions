// something wrong in delete function.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ImplementOfChaing
 */
public class ImplementOfChaing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hash Size : ");
        int hs = sc.nextInt();
        MyHash mh = new MyHash(hs);

        System.out.println("Enter how many numbers you want to insert : ");
        int insno=sc.nextInt();
        System.out.println("Enter the numbers : ");
        //int arr[]=new int[insno];
        for(int i=0;i<insno;i++){
            int x=sc.nextInt();
            boolean insans=mh.insert(x);
            System.out.println("is element successfully inserted : "+insans);
        }


    


        System.out.println("Enter the deleting element : ");
        int del=sc.nextInt();
        boolean delans=mh.delete(del);
        System.out.println("successfully deleted : "+delans);


        
        System.out.println("Enter the searching element : ");
        int sr=sc.nextInt();
       boolean searans= mh.search(sr);
       System.out.println("is element present : "+searans);

       sc.close();
    }     
    
}

class MyHash {

    int b;
    ArrayList<LinkedList<Integer>> table;

    public MyHash(int bucket) {
        b=bucket;
        table = new ArrayList<LinkedList<Integer>>();

        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }

        
    }


    public boolean search(int ele){

        int i=ele%b;
        boolean ans=table.get(i).contains(ele);
        return ans;

    }



    public boolean insert(int ele) {
        int i=ele%b;
        table.get(i).add(ele);
        boolean ans=table.get(i).contains(ele);
        return ans;
    }


    public boolean delete (int ele){
        int i=ele%b;
      //  int ans=table.get(i).remove(ele);
      boolean ans=table.get(i).add((Integer)i);
        return ans;
    }


   
}