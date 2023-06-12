package SetsAndMapsADVANCED.EXERCISE;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new TreeMap<>();
        String input=scanner.nextLine();
        while(!input.equals("search")){
//John-0888080808
            String[] number=input.split("-");
            phoneBook.put(number[0],number[1]);
            input=scanner.nextLine();
        }
        input=scanner.nextLine();
        while(!input.equals("stop")){
            String person=input;
            if(phoneBook.containsKey(person)){
                System.out.println(person+" -> "+phoneBook.get(person));
            }else{
                System.out.println("Contact "+person+" does not exist.");
            }

            input=scanner.nextLine();
        }

    }
}
