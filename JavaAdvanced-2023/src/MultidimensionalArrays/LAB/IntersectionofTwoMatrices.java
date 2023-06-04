package MultidimensionalArrays.LAB;

import java.util.*;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] input= scanner.nextLine().split("\\s+");
            for (int j = 0; j <cols; j++) {
                firstMatrix[i][j]=input[j].charAt(0);
            }
        }
        for (int i = 0; i < rows; i++) {
            String[] input= scanner.nextLine().split("\\s+");
            for (int j = 0; j <cols; j++) {
                secondMatrix[i][j]=input[j].charAt(0);
            }
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(firstMatrix[i][j]==secondMatrix[i][j]){
                    System.out.print(firstMatrix[i][j]+" ");
                }else {
                    System.out.print('*'+" ");
                }
            }
            System.out.println();
        }
    }


}
