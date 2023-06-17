package REGULAREXAM1;
import java.util.*;
import java.util.stream.Collectors;

public class problem2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ArrayDeque<Integer> toolsQueue = new ArrayDeque<>();
            ArrayDeque<Integer> substancesStack = new ArrayDeque<>();

            addElementsToQueue(scan, toolsQueue);
            addElementsToStack(scan, substancesStack);

            List<Integer> challenges = Arrays
                    .stream(scan.nextLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            boolean challengeCompleted = false;

            while (!toolsQueue.isEmpty() && !substancesStack.isEmpty()) {
                int firstTool = toolsQueue.poll();
                int lastSubstance = substancesStack.pop();
                int sum = firstTool * lastSubstance;

                for (Iterator<Integer> iterator = challenges.iterator(); iterator.hasNext(); ) {
                    Integer challenge = iterator.next();
                    if (challenge.equals(sum)) {
                        iterator.remove();
                        challengeCompleted = true;
                        break;
                    }
                }

                if (!challengeCompleted) {
                    toolsQueue.offer(firstTool + 1);
                    if (lastSubstance - 1 > 0) {
                        substancesStack.push(lastSubstance - 1);
                    }
                }

                challengeCompleted = false;
            }

            if (!challenges.isEmpty()) {
                System.out.println("Harry is lost in the temple. Oblivion awaits him.");
            } else {
                System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
            }

            if (!toolsQueue.isEmpty()) {
                String remainingTools = toolsQueue.isEmpty() ? "none"
                        : toolsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
                System.out.println("Tools: " + remainingTools);
            }

            if (!substancesStack.isEmpty()) {
                printRemainingSubstances(substancesStack);
            }

            if (!challenges.isEmpty()) {
                System.out.print("Challenges: ");
                String challengesString = challenges.stream().map(String::valueOf).collect(Collectors.joining(", "));
                System.out.println(challengesString);
            }
        }

        private static void addElementsToQueue(Scanner scan, ArrayDeque<Integer> queue) {
            Arrays.stream(scan.nextLine().split(" ")).forEach(e -> queue.offer(Integer.valueOf(e)));
        }

        private static void addElementsToStack(Scanner scan, ArrayDeque<Integer> stack) {
            Arrays.stream(scan.nextLine().split(" ")).forEach(e -> stack.push(Integer.valueOf(e)));
        }

        private static void printRemainingSubstances(ArrayDeque<Integer> stack) {
            String substancesString = stack.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Substances: " + substancesString);
        }
    }



