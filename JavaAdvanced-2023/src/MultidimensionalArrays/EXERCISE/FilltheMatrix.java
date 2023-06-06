package MultidimensionalArrays.EXERCISE;

import java.util.*;

public class FilltheMatrix {
    private static void handleFillingA(int[][] matrix) {
        int counter = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = counter;
                counter++;
            }
        }
        handlePrinting(matrix);
    }

    private static void handleFillingB(int[][] matrix) {
        int counter = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            if (cols % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols] = counter;
                    counter++;
                }
            } else {
                for (int rows = matrix.length-1; rows >= 0; rows--) {
                    matrix[rows][cols] = counter;
                    counter++;
                }
            }
        }
        handlePrinting(matrix);
    }

    public static void handlePrinting(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String type = input[1];
        int[][] matrix = new int[n][n];
        if (type.equals("A")) {
            handleFillingA(matrix);
        } else {
            handleFillingB(matrix);
        }
    }
}
