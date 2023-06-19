package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class CopyBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\User\\Documents\\GitHub\\JavaAdvanced-2023\\JavaAdvanced-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

      try(FileInputStream in =new FileInputStream(path);
          FileOutputStream  out= new FileOutputStream(output)){

          int oneByte=in.read();
       while(oneByte>=0){
           if(oneByte==10){
               out.write(oneByte);
           }else if(oneByte==32){
               out.write(oneByte);
           }else{
               char[] arr=String.valueOf(oneByte).toCharArray();
               for (char c : arr) {
                   out.write(c);
               }

           }
           oneByte=in.read();
       }


        } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
