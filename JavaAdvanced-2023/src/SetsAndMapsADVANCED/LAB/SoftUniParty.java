package SetsAndMapsADVANCED.LAB;

import com.sun.source.tree.Tree;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> guests = new TreeSet<>();
        TreeSet<String> VIPguest = new TreeSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                VIPguest.add(input);
            } else {
                guests.add(input);
            }
            input = scanner.nextLine();
        }
        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                VIPguest.remove(input);
            } else {
                guests.remove(input);
            }
            input = scanner.nextLine();
        }
        System.out.println(guests.size() + VIPguest.size());
        VIPguest.forEach(System.out::println);
        guests.forEach(System.out::println);
    }

}
