import java.util.Scanner;

public class OrderOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the string array : ");
        int n = sc.nextInt();
        System.out.println("Enter strings : ");
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            str[i] = s;
        }

        // String ans[]=new String[2];
        String ans[] = orderString(str, n);

        System.out.println("Output : ");

        for (int i = 0; i < 2; i++) {
            System.out.println(ans[i] + " ");
        }

        sc.close();
    }

    public static String[] orderString(String str[], int n) {


/*
        Arrays.sort(s);
        
        String ans[]=new String[2];
        ans[0]=s[0];
        ans[1]=s[n-1];
        
        return ans;

        */

        int minIndex = 0, maxIndex = 0;

        String ans[] = new String[2];

        for (int i = 0; i <n; i++) {

            // String s2=str[i];
            // String s1=str[i-1];

            if (str[i].compareTo(str[minIndex]) < 0) {
                minIndex = i;
            }

            if (str[i].compareTo(str[maxIndex]) > 0) {
                maxIndex = i;

            }

           

        }

        ans[0] = str[minIndex];
        ans[1] = str[maxIndex];

        return ans;

    }

}
