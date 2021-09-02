package MultidimensionalArrays_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class FindTheRealQueen_07 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    char[][] matrix = readCharMatrix(scan, 8, 8);
    ArrayDeque<int[]> queenPositions = findAllQueens(matrix);

    while (queenPositions.size() > 1) {
        int[] currentQueenPosition = queenPositions.poll();
        if (!searchForAMatch(matrix, currentQueenPosition)) {
            System.out.println(currentQueenPosition[0] + " " + currentQueenPosition[1]);
            return;
        }

    }

    System.out.println("Ne bachka da go eba");
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

    public static ArrayDeque<int[]> findAllQueens(char[][] matrix) {
        ArrayDeque<int[]> queens = new ArrayDeque<>();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    queens.offer(new int[]{i, j});
                }
            }
        }
        return queens;
    }

    public static boolean searchForAMatch(char[][] matrix, int[] position) {
        int row = position[0];
        int coll = position[1];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == row && j == coll) {
                    continue;
                }
                if (matrix[i][j] == 'q') {
                    if ((i == row || j == coll)) {
                        return true;
                    }
                }
            }
        }

        for (int i = row - 1, j = coll - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'q' && (i != row || j != coll)) {
                return true;
            }
        }
        for (int i = row - 1, j = coll + 1; i >= 0 && j <= 7; i--, j++) {
            if (matrix[i][j] == 'q' && (i != row || j != coll)) {
                return true;
            }
        }
        for (int i = row + 1, j = coll - 1; i <= 7 && j >= 0; i++, j--) {
            if (matrix[i][j] == 'q' && (i != row || j != coll)) {
                return true;
            }
        }
        for (int i = row + 1, j = coll + 1; i <= 7 && j <= 7; i++, j++) {
            if (matrix[i][j] == 'q' && (i != row || j != coll)) {
                return true;
            }
        }

        return false;
    }
}
