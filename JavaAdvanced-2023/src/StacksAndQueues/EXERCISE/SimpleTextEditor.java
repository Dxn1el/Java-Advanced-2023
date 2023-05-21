package StacksAndQueues.EXERCISE;

import java.util.*;

public class SimpleTextEditor {
    public static void handleAppending(String toAppend, StringBuilder sb) {
        sb.append(toAppend);
    }

    public static void handleErasing(int countOfElements, StringBuilder sb) {
        int startFrom = sb.length() - countOfElements;
        sb.delete(startFrom, sb.length());
    }

    public static void handleReturning(int indexToReturn, StringBuilder sb) {
        System.out.println(sb.charAt(indexToReturn - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);
            switch (command) {
                case 1:
                    //"1 {string}" - appends [string] to the end of the text.
                    stack.push(sb.toString());
                    handleAppending(input[1], sb);
                    break;
                case 2:
                    //"2 {count}" - erases the last [count] elements from the text.
                    stack.push(sb.toString());
                    int countOfElements = Integer.parseInt(input[1]);
                    handleErasing(countOfElements, sb);
                    break;
                case 3:
                    //"3 {index}" - returns the element at position [index] from the text.
                    int indexToReturn = Integer.parseInt(input[1]);
                    handleReturning(indexToReturn, sb);
                    break;
                case 4:
                    //"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
                    sb = new StringBuilder(stack.pop());
                    break;
            }



        }
    }
}
