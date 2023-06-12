package SetsAndMapsADVANCED.EXERCISE;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> handsMap = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            //"{personName}: {PT, PT, PT,… PT}"
            String personName = input.split(": ")[0];
            String personHnd = input.split(": ")[1];


            input = scanner.nextLine();
        }
    }
}
