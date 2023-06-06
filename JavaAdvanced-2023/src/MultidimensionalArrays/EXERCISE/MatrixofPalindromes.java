package MultidimensionalArrays.EXERCISE;
import java.util.*;
public class MatrixofPalindromes {
    private static void printMatrix(String[][] matrix,int rows,int cols){
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimentions=scanner.nextLine().split("\\s+");
        
        int rows =Integer.parseInt(dimentions[0]);
        int cols =Integer.parseInt(dimentions[1]);
        String[][]matrix=new String[rows][cols];
        char startLetter='a';

        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                String palindrome=""+startLetter+(char)(startLetter+col)+startLetter;
                        matrix[row][col]=palindrome;
            }
            startLetter=(char) (startLetter+1);
        }
        printMatrix(matrix,rows,cols);
    }
}
