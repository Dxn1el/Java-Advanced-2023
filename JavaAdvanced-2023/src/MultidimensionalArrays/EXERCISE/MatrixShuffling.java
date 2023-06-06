package MultidimensionalArrays.EXERCISE;
import java.util.*;
public class MatrixShuffling {
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i <matrix.length ; i++) {

            matrix[i]=scanner.nextLine().split("\\s+");
        }
    }

    private static boolean validator(String [] commands){
        return false;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        String[][]matrix=new String[rows][cols];
        fillMatrix(matrix,scanner);

        String command=scanner.nextLine();
        while(!command.equals("end")){
            String[] commands=command.split("\\s+");
            int row1=Integer.parseInt(commands[0]);
            int col1=Integer.parseInt(commands[1]);
            int row2=Integer.parseInt(commands[2]);
            int col2=Integer.parseInt(commands[3]);
            command=scanner.nextLine();
        }
    }

   }

