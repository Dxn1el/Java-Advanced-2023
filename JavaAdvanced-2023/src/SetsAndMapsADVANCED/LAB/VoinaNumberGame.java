package SetsAndMapsADVANCED.LAB;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> deck1 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> deck2 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        for (int round = 0; round < 50; round++) {

            if (deck1.isEmpty()) {
                System.out.println("Second player win!");
                return;
            } else if (deck2.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            int firstCard = deck1.iterator().next();
            int secondCard = deck2.iterator().next();
            deck1.remove(firstCard);
            deck2.remove(secondCard);

            if (firstCard > secondCard) {
                deck1.add(firstCard);
                deck1.add(secondCard);
            } else if (secondCard > firstCard) {
                deck2.add(firstCard);
                deck2.add(secondCard);
            } else {
                deck1.add(firstCard);
                deck2.add(secondCard);
            }


        }
        if (deck1.size() > deck2.size()) {
            System.out.println("First player win!");
        } else if (deck2.size() > deck1.size()) {

            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }
}

