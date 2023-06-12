package SetsAndMapsADVANCED.EXERCISE;

import java.util.*;

public class HandsOfCards {
    private static int getCardPoints(Set<String> cards) {
        int powerOfCard=0;
        Map<Character, Integer> cardsMap = getCardPower();
        for (String card : cards) {
            if(card.startsWith("10")){
                char type=card.charAt(2);
                powerOfCard+=10*cardsMap.get(type);
            }else{
                char cardNumber=card.charAt(0);
                char cardType=card.charAt(1);
                powerOfCard+=cardsMap.get(cardNumber)*cardsMap.get(cardType);
            }
        }
        return powerOfCard;
    }

    private static Map<Character, Integer> getCardPower() {
        Map<Character, Integer> cardPower = new LinkedHashMap<>();
        cardPower.put('2', 2);
        cardPower.put('3', 3);
        cardPower.put('4', 4);
        cardPower.put('5', 5);
        cardPower.put('6', 6);
        cardPower.put('7', 7);
        cardPower.put('8', 8);
        cardPower.put('9', 9);
        cardPower.put('J', 11);
        cardPower.put('Q', 12);
        cardPower.put('K', 13);
        cardPower.put('A', 14);
        cardPower.put('S', 4);
        cardPower.put('H', 3);
        cardPower.put('D', 2);
        cardPower.put('C', 1);

        return cardPower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> handsMap = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            //"{personName}: {PT, PT, PT,… PT}"
            String personName = input.split(": ")[0];
            String personHnd = input.split(": ")[1];
            String[] cardsArr = personHnd.split(",\\s+");

            Set<String> cardsSet = new LinkedHashSet<>();
            cardsSet.addAll(Arrays.asList(cardsArr));

            if (handsMap.containsKey(personName)) {
                handsMap.get(personName).addAll(cardsSet);
            } else {
                handsMap.put(personName, cardsSet);
            }
            input = scanner.nextLine();
        }
        handsMap.entrySet().forEach(e -> {
            String name = e.getKey();
            Set<String> cards = e.getValue();
            int cardPower= getCardPoints(cards);
            System.out.printf("%s: %d%n",name,cardPower);
        });

    }


}
