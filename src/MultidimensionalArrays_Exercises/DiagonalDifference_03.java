package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[][] matrix = fillMatrix(scan, size);

        int sumOfPrimaryDiagonal = getSumOfPrimaryDiagonal(matrix);
        int sumOfSecondaryDiagonal = getSumOfSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumOfPrimaryDiagonal-sumOfSecondaryDiagonal));

    }

    private static int getSumOfPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
        }
        return sum;
    }

    private static int getSumOfSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == (matrix.length - 1))
                    sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int[][] fillMatrix(Scanner scan, int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
}
