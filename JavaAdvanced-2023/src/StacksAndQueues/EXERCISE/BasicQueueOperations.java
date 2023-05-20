package StacksAndQueues.EXERCISE;
import java.util.*;
public class BasicQueueOperations {
Scanner scanner = new Scanner(System.in);
        public static void handleElementsPopping(ArrayDeque<Integer> stack, int s) {
            for (int i = 0; i < s; i++) {
                stack.poll();
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
            ArrayDeque<Integer> queue = new ArrayDeque<>();

            int n = scanner.nextInt(); //number of adds
            int s = scanner.nextInt();//how many elements to pop
            int x = scanner.nextInt();// check if its present in the queue

            for (int i = 0; i < n; i++) {
                queue.offer(scanner.nextInt());
            }

            handleElementsPopping(queue, s);
            if(handlePresentChecking(queue,x)){
                System.out.println("true");
            }else{
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(Collections.min(queue));
                }

            }
        }
    }


