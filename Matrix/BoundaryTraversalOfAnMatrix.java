import java.util.ArrayList;
import java.util.Scanner;

public class BoundaryTraversalOfAnMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int m = sc.nextInt();
        System.out.println("Enter colomn : ");
        int n = sc.nextInt();
        System.out.println("Enter matrix : ");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                arr[i][j] = x;
            }
        }
        ArrayList<Integer> ans = boundary(arr, m,n);
        System.out.print(ans + " ");
        sc.close();
    }

    public static ArrayList<Integer> boundary(int matrix[][], int r, int c) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        // corner cases

        // if matrix has only one row

        if (r == 1) {
            for (int i = 0; i < c; i++) {
                res.add(matrix[0][i]);
            }
        }

        // if matrix has only one colomn

        else if (c == 1) {
            for (int i = 0; i < r; i++) {
                res.add(matrix[i][0]);
            }
        }

        else {
            for (int i = 0; i < c; i++) {
                res.add(matrix[0][i]);
            }
            for (int i = 1; i < r; i++) {
                res.add(matrix[i][c - 1]);
            }
            for (int i = c - 2; i >= 0; i--) {
                res.add(matrix[r - 1][i]);
            }
            for (int i = r - 2; i >= 1; i--) {
                res.add(matrix[i][0]);
            }
        }

        return res;
    }

}
