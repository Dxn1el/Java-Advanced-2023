package MultidimensionalArrays.EXERCISE;

import java.util.*;

public class MatrixShuffling {
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = scanner.nextLine().split("\\s+");
        }
    }

    private static boolean validator(int rows, int cols, String[] commands) {
        if (!commands[0].equals("swap")) {
            return false;
        }
        if (commands.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(commands[1]);
        int col1 = Integer.parseInt(commands[2]);
        int row2 = Integer.parseInt(commands[3]);
        int col2 = Integer.parseInt(commands[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;
        }

        return true;
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimentions = scanner.nextLine();
        int rows = Integer.parseInt(dimentions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimentions.split("\\s+")[1]);
        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] commands = command.split("\\s+");

            if (validator(rows, cols, commands)) {
                int row1 = Integer.parseInt(commands[1]);
                int col1 = Integer.parseInt(commands[2]);
                int row2 = Integer.parseInt(commands[3]);
                int col2 = Integer.parseInt(commands[4]);
                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];
                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;
                printMatrix(matrix, rows, cols);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}

