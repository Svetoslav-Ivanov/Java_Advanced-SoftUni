package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int rows = Integer.parseInt(scan.nextLine());

    int[][] matrix = readMatrix(scan, rows);

    int wrongNumber = matrix[scan.nextInt()][scan.nextInt()];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == wrongNumber) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    int[][] finalMatrix = new int[matrix.length][matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == Integer.MIN_VALUE) {
                if (i > 0) {
                    if (matrix[i - 1][j] != Integer.MIN_VALUE) {
                        finalMatrix[i][j] = finalMatrix[i][j] + matrix[i - 1][j];
                    }
                }
                if (j < matrix[i].length - 1) {
                    if (matrix[i][j + 1] != Integer.MIN_VALUE) {
                        finalMatrix[i][j] = finalMatrix[i][j] + matrix[i][j + 1];
                    }
                }
                if (j > 0) {
                    if (matrix[i][j - 1] != Integer.MIN_VALUE) {
                        finalMatrix[i][j] = finalMatrix[i][j] + matrix[i][j - 1];
                    }
                }
                if (i < matrix.length - 1) {
                    if (matrix[i + 1][j] != Integer.MIN_VALUE) {
                        finalMatrix[i][j] = finalMatrix[i][j] + matrix[i+1][j];
                    }
                }
                continue;
            }
            finalMatrix[i][j] = matrix[i][j];

        }
    }

    for (int[] array : finalMatrix) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

    //TODO Read a int Matrix (Scanner scanner, int rowsAndCols)
    public static int[][] readMatrix(Scanner scanner, int rowsAndCols) {
        int[][] matrix = new int[rowsAndCols][];

        for (int i = 0; i < rowsAndCols; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

}
