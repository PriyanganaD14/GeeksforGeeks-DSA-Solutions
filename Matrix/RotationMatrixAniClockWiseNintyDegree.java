import java.util.Scanner;

public class RotationMatrixAniClockWiseNintyDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and colomn : ");
        int m = sc.nextInt();
        // System.out.println("Enter colomn : ");
        // int n = sc.nextInt();
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
        rotateByNinty(arr, m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void rotateByNinty(int mat[][], int n) {

        // transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                swap(mat, i, j);

            }
        }

        // rotate by column

        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;

            while (low <= high) {
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;

            }
        }
    }

    public static void swap(int mat[][], int i, int j) {

        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

}
