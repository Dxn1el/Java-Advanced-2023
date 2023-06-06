package MultidimensionalArrays.EXERCISE;
import java.util.*;
public class DiagonalDifference {

    public static int sumOfDiagonals(int[][] matrix) {
        int sum=0;
        for (int rows = 0; rows <matrix.length ; rows++) {
                sum+=matrix[rows][rows];
        }
        for (int i = 0; i <matrix.length ; i++) {
            sum-=matrix[matrix.length-1-i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            int[] fillTheRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = fillTheRow;
        }
        
        int sum= sumOfDiagonals(matrix);
        System.out.println(Math.abs(sum));
    }
}

