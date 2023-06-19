package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";
        Scanner in = new Scanner(new FileReader(inputPath));
        PrintWriter out = new PrintWriter(outputPath);
    int counter=1;
    String line=in.nextLine();
        while(in.hasNextLine()){
            if(counter%3==0){
                out.println(line);
            }
            counter++;
        line=in.nextLine();
    }
        out.close();

    }
}
