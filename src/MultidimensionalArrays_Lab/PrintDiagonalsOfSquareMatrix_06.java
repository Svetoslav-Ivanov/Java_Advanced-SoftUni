package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int rowsAndCols = Integer.parseInt(scan.nextLine());
    int [][] matrix = readMatrix(scan,rowsAndCols);

    int[][] diagonals = getDiagonalsOfMatrix(matrix);

    printMatrix(diagonals);

}


    //TODO Read a int Matrix (Scanner scanner, int rowsAndCols)
    public static int[][] readMatrix(Scanner scanner, int rowsAndCols) {
        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        for (int i = 0; i < rowsAndCols; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    public static int[][] getDiagonalsOfMatrix(int[][] matrix) {
        int[][] finalMatrix = new int[2][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            finalMatrix[0][i] = matrix[i][i];
        }

        for (int roll = matrix.length - 1, index = 0; roll >= 0; roll--, index++) {
            finalMatrix[1][index] = matrix[roll][index];
        }
        return finalMatrix;
    }

    //TODO Print int Matrix
    public static void printMatrix (int [][] matrix){
        for (int[] array : matrix) {
            for (int integer : array) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
