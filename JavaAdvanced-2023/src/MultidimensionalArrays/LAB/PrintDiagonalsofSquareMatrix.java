package MultidimensionalArrays.LAB;

import java.util.*;

public class PrintDiagonalsofSquareMatrix {
    public static void handlePrinting(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf(matrix[n - 1 - i][i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] fillRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = fillRow;
        }
        handlePrinting(matrix, n);
    }
}
