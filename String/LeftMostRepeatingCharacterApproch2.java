import java.util.Arrays;
import java.util.Scanner;

public class LeftMostRepeatingCharacterApproch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        int ans = fun(str);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static int fun(String s) {

        int arr[] = new int[256];

        Arrays.fill(arr, -1);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int fi = arr[s.charAt(i)];

            if (fi == -1) {
                arr[s.charAt(i)] = i;
            } else {
                res = Math.min(res, fi);
            }
        }

        if (res == Integer.MAX_VALUE) {
            return -1;
        }

        return res;
    }

}
