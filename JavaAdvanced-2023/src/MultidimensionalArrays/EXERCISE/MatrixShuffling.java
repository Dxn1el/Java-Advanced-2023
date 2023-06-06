package MultidimensionalArrays.EXERCISE;
import java.util.*;
public class MatrixShuffling {
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i <matrix.length ; i++) {

            matrix[i]=scanner.nextLine().split("\\s+");
        }
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        String[][]matrix=new String[rows][cols];

        fillMatrix(matrix,scanner);
    }

   }

