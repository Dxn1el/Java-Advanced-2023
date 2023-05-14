package LAB;

import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> tokens = new ArrayDeque<>();
        String input = scanner.nextLine();
        String currentURL = "";


        while (!input.equals("Home")) {
            if (input.equals("back")) {

                if (tokens.size() > 1) {
                    tokens.pop();
                    currentURL = tokens.peek();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                tokens.push(input);
                currentURL = tokens.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }

    }
}
