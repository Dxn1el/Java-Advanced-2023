package SetsAndMapsADVANCED;
import java.util.*;
public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars= new LinkedHashSet<>();
        String input=scanner.nextLine();
        while (!input.equals("END")){
            String[]commands=input.split(", ");
            if(commands[0].equals("IN")){
                cars.add(commands[1]);
            }else if(commands[0].equals("OUT")){
                cars.remove(commands[1]);
            }
            input=scanner.nextLine();
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
