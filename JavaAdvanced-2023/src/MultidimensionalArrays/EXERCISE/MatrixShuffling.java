package MultidimensionalArrays.EXERCISE;
import java.util.*;
public class MatrixShuffling {
    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i <matrix.length ; i++) {
            int[]fillRow=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=fillRow;
        }
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int[][]matrix=new int[rows][cols];

        fillMatrix(matrix,scanner);
    }

   }

