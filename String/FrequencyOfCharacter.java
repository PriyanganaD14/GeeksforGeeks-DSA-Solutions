import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.next();

       freqCount(str);
        sc.close();
    }

    public static void freqCount(String str){

        int arr[]=new int[26];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>0){
                System.out.println((char)(i+'a')+" freq is "+arr[i]);
            }
        }
    }
    
}
