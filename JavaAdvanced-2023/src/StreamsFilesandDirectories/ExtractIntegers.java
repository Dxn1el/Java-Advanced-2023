package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";
        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(outputPath);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int myNumber = scanner.nextInt();
                System.out.println(myNumber);
                out.println(myNumber);
            }
            scanner.next();
        }
        out.close();

    }
}
