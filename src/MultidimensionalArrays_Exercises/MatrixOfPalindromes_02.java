package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();


        String[][] matrix = fillMatrix(rows, cols);
        printMatrix (matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        int firstLetter = 97;

        for (int i = 0; i < matrix.length; i++, firstLetter++) {
            int secondLetter = 97+i;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) firstLetter
                        + String.valueOf((char) secondLetter++)
                        + (char) firstLetter;
            }
        }
        return matrix;
    }
}
