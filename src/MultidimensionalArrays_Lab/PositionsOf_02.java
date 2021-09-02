package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[][] matrix = readMatrixAndRowsAndCols(scan);
    int searchingNumber = scan.nextInt();

    boolean found = false;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == searchingNumber) {
                System.out.printf("%d %d%n", i, j);
                found = true;
            }
        }
    }

    if (!found){
        System.out.println("not found");
    }

}


    public static int[][] readMatrixAndRowsAndCols(Scanner scanner) {
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
