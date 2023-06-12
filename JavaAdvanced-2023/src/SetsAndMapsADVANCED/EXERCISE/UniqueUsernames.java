package SetsAndMapsADVANCED.EXERCISE;
import java.util.*;
public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set= new LinkedHashSet<>();
        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            set.add(scanner.nextLine());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
