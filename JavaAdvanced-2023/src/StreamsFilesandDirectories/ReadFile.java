package StreamsFilesandDirectories;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path="C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try(FileInputStream in =new FileInputStream(path);
            ){

            int oneByte=in.read();
            while(oneByte>=0){
                System.out.printf("%S ",Integer.toBinaryString(oneByte));
                oneByte= in.read();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
