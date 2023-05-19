package StacksAndQueues.LAB;
import java.util.*;
public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal=Integer.parseInt(scanner.nextLine());
        if(decimal==0){
            System.out.print(0);
            return;
        }
        ArrayDeque<String> binary=new ArrayDeque<>();
        while(decimal!=0){
            binary.push(String.valueOf(decimal%2));
            decimal/=2;
        }
        for (String s : binary) {
            System.out.printf(s);
        }

    }
}
