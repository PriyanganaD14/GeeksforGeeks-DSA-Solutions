
import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and colomn : ");
        int m = sc.nextInt();
       // System.out.println("Enter colomn : ");
      //  int n = sc.nextInt();
        System.out.println("Enter matrix : ");
        int arr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                arr[i][j] = x;
            }
        }
       // ArrayList<Integer> ans = snakePattern(arr, m,n);
       // System.out.print(ans + " ");
       System.out.println("Output : ");
       traverse(arr,m);
        sc.close();
    }

    public static void traverse(int mat[][], int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }

    
}
