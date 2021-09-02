package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int rows = scan.nextInt();
    int cols = scan.nextInt();
    scan.nextLine();
    int[][] firstMatrix = readMatrix(scan, rows, cols);

    rows = scan.nextInt();
    cols = scan.nextInt();
    scan.nextLine();
    int[][] secondMatrix = readMatrix(scan, rows, cols);

    System.out.println(compareMatrices(firstMatrix,secondMatrix)
            ? "equal"
            : "not equal");
}

    public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    public static boolean compareMatrices (int[][] firstMatrix, int[][] secondMatrix){

        if (firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length){
                return false;
            }
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
