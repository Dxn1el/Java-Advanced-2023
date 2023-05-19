package StacksAndQueues.EXERCISE;

import java.util.*;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] inputArr=scanner.nextLine().split("\\s+");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
