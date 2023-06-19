package StreamsFilesandDirectories;

import java.io.*;
import java.util.*;

public class WriteFile {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        Set<Character> set = new HashSet<>();
        set.add('!');
        set.add('?');
        set.add(',');
        set.add('.');
        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                char byteAsChar = (char) oneByte;
                if (!set.contains(byteAsChar)) {
                    out.write(oneByte);
                }
                oneByte = in.read();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
