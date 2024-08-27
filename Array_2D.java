
import java.util.Scanner;

public class Array_2D {

    public static void printMatrix(int matrix[][]) {
        System.out.println("Matrix : ");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] randomMatrix(int n, int m) {
        int randomMatrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //This is common way to write the {Math.random*(max-min+1)+ min} ;
                randomMatrix[i][j] = (int) (Math.random() * (9 - 1 + 1)) + 1;
                // randomMatrix[i][j] = 1;
            }
        }
        return randomMatrix;
    }

    public static void DiagonalSum(int matrix[][]) {
        try {
            int sum = 0;
            int i, j;
            int n = matrix.length;
            int m = matrix[0].length;
            for (i = 0, j = 0; i < n && j < m; j++, i++) {
                sum += matrix[i][j];
            }

            for (i = 0, j = m - 1; i < n && j >= 0; j--, i++) {
                if (i == j) {
                    continue;
                }
                sum += matrix[i][j];
            }
            System.out.println("The sum is : " + sum + "\n");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The sum is : -1");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int mat[] = {0};
            System.out.println(mat.length);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int matrix[][] = randomMatrix(n, n);
            printMatrix(matrix);
            DiagonalSum(matrix);
        }
    }
}
