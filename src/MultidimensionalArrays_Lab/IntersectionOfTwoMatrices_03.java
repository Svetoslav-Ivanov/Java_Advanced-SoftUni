package MultidimensionalArrays_Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int rows = scan.nextInt();
    int cols = scan.nextInt();
    scan.nextLine();

    char[][] firstMatrix = readCharMatrix(scan, rows, cols);
    char[][] secondMatrix = readCharMatrix(scan, rows, cols);


    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (firstMatrix[i][j] != secondMatrix[i][j]){
                firstMatrix[i][j] = '*';
            }
        }
    }

    printMatrix(firstMatrix);

}

    //TODO Read a char Matrix
    public static char[][] readCharMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] line = scanner.nextLine().split("\\s+");
            for (String s : line) {
                stringBuilder.append(s);
            }
            matrix[i] = stringBuilder.toString().toCharArray();

        }
        return matrix;
    }

    //TODO Print Matrix
    public static void printMatrix (char[][] matrix){
        for (char[] array : matrix) {
            for (char character : array) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }

}
