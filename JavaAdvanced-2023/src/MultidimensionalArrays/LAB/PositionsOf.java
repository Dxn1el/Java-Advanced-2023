package MultidimensionalArrays.LAB;

import java.util.*;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2 3
        //1 2 3
        //4 2 2
        //2
        //
        // 0 1
        //1 1
        //1 2
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixRow;
        }
        int findNumber = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != findNumber) {
                    continue;
                } else {
                    flag=false;
                    System.out.println(i + " " + j);
                }
            }
        }
        if(flag){
            System.out.println("not found");
        }

    }
}
