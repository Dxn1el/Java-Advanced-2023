package StacksAndQueues.EXERCISE;
import java.util.*;
public class BalancedParentheses {
    public static boolean lenghtChecker(int checker) {
        if (checker % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean handleBracketsValidation(char lastOpenBracket, char firstOpenBracket) {
        if (lastOpenBracket == '(' && firstOpenBracket == ')') {
            return true;
        } else if (lastOpenBracket == '{' && firstOpenBracket == '}') {
            return true;
        } else if (lastOpenBracket == '[' && firstOpenBracket == ']') {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();
        String input = scanner.nextLine();

        if (!lenghtChecker(input.length())) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                bracketsStack.push(currentBracket);
            } else {
                if (bracketsStack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    if (handleBracketsValidation(bracketsStack.pop(), currentBracket)) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}