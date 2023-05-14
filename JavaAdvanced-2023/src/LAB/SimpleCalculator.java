package LAB;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, input);
        int result = 0;
        while (tokens.size() > 1) {

            int firstNum = Integer.parseInt(tokens.pop());
            String sign = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());
            if (sign.equals("-")) {
                result = firstNum - secondNum;
            } else {
                result = firstNum + secondNum;

            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.pop());
    }
}
