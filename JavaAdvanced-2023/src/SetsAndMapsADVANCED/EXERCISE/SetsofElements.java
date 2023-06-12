package SetsAndMapsADVANCED.EXERCISE;
import java.util.*;
public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input=scanner.nextLine().split(" ");
        int n= Integer.parseInt(input[0]);
        int m= Integer.parseInt(input[1]);
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();

        for (int i = 0; i <n ; i++) {
            set1.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i <m ; i++) {
           set2.add(Integer.parseInt(scanner.nextLine()));
        }

        set1.retainAll(set2);
        set1.forEach(el->System.out.print(el+" "));

    }
}
