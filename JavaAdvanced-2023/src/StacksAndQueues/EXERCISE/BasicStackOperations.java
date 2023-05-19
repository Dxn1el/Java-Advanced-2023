package StacksAndQueues.EXERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void handleElementsPopping(ArrayDeque<Integer> stack, int s) {
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
    }
    public static boolean handlePresentChecking(ArrayDeque<Integer> stack, int x){

            if (stack.contains(x)){
                return true;
            }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = scanner.nextInt(); //number of adds
        int s = scanner.nextInt();//how many elements to pop
        int x = scanner.nextInt();// check if its present in the stack

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        handleElementsPopping(stack, s);
        if(handlePresentChecking(stack,x)){
            System.out.println("true");
        }else{
           if(stack.isEmpty()){
               System.out.println(0);
           }else{
               System.out.println(Collections.min(stack));
               }

           }
        }
    }
