
/**
 * PrintAMatrixInSnakePattern
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAMatrixInSnakePattern {

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
        ArrayList<Integer> ans = snakePattern(arr);
        System.out.print(ans + " ");
        sc.close();
    }

    public static ArrayList<Integer> snakePattern(int matrix[][]) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {

            if (i == 0 || i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    res.add(matrix[i][j]);
                }
            }

            if (i == 1 || i % 2 == 1) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    res.add(matrix[i][j]);
                }
            }

        }

        return res;
    }

}