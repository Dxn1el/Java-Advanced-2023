package MultidimensionalArrays.LAB;

import java.util.*;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rowsOfFirstMatrix = Integer.parseInt(input[0]);
        int colsOfFirstMatrix = Integer.parseInt(input[1]);
        int firstMatrix[][] = new int[rowsOfFirstMatrix][colsOfFirstMatrix];

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = rowOfMatrix;
        }
        String[] inputForSecondMatrix = scanner.nextLine().split("\\s+");
        int rowOfSecondMatrix = Integer.parseInt(inputForSecondMatrix[0]);
        int colsOfSecondMatrix = Integer.parseInt(inputForSecondMatrix[1]);


        if(rowsOfFirstMatrix!=rowOfSecondMatrix||colsOfFirstMatrix!=colsOfSecondMatrix){
            System.out.println("not equal");
            return;
        }

        int[][] secondMatrix=new int[rowOfSecondMatrix][colsOfSecondMatrix];
        //comparing the matrices
        for (int i = 0; i <rowsOfFirstMatrix ; i++) {
           int[]rowOfMatrix=Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
           secondMatrix[i]=rowOfMatrix;
        }

        for (int i = 0; i <rowsOfFirstMatrix ; i++) {
            for (int j = 0; j <colsOfFirstMatrix ; j++) {
                if(firstMatrix[i][j]!=secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
