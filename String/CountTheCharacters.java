// all test cases are not passed, becoz this problem is based on String and Hashing.

import java.util.Scanner;

class CountTheCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println("Enter N : ");
        int n = sc.nextInt();

        int ans = getCount(str, n);
        System.out.println("Output : " + ans);

        sc.close();
    }

    public static int getCount(String s, int n) {

        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==n){
               count++;
            }

        }

        return count;

    }
}