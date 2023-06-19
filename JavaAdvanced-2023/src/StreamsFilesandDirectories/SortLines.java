package StreamsFilesandDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String pathIN = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOUT = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";

        Path input = Paths.get(pathIN);
        Path output = Paths.get(pathOUT);
        List<String> lines= Files.readAllLines(input);
        Collections.sort(lines);
        Files.write(output,lines);


    }
}
