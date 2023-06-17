package DefiningClasses.EXERCISE;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String personalInfo = scanner.nextLine();
            String name=personalInfo.split("\\s+")[1];
            int age=Integer.parseInt(personalInfo.split("\\s+")[1]);
            if(age>30){
                Person person= new Person(name,age);
                people.add(person);
            }
        }
        people.sort(Comparator.comparing(e->e.getName()));
    }
}
