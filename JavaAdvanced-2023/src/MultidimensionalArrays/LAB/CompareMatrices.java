package MultidimensionalArrays.LAB;

import java.util.*;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rowsOfFirstMatrix = Integer.parseInt(input[0]);
        int colsOfSecondMatrix = Integer.parseInt(input[1]);
        int firstMatrix[][] = new int[rowsOfFirstMatrix][colsOfSecondMatrix];
        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = rowOfMatrix;
            System.out.println();
        }
    }
}
