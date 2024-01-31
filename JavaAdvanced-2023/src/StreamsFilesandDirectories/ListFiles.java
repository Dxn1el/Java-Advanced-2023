package StreamsFilesandDirectories;

import java.io.File;
import java.util.*;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                   if(!file1.isDirectory()){
                       System.out.printf("%s: [%s]%n",file1.getName(),file1.length());
                   }
                }

            }
        }
    }
}
