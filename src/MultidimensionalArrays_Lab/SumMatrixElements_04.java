package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] rowsAndCols = Arrays.stream(scan.nextLine().split(",\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
    System.out.println(rowsAndCols[0]);
    System.out.println(rowsAndCols[1]);

    int[][] matrix = readMatrix(scan, rowsAndCols[0], rowsAndCols[1]);

    System.out.println(getSumOfElements(matrix));

}

    //TODO Read a int Matrix
    public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    public static int getSumOfElements(int[][] matrix) {
        int sum = 0;

        for (int[] array : matrix)
            for (int integer : array) {
                sum += integer;
            }
        return sum;
    }
}
