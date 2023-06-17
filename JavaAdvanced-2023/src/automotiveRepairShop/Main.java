package automotiveRepairShop;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        RepairShop repairShop = new RepairShop(3);

        Vehicle vehicle1 = new Vehicle("ABC123", 10000, "Scratch");
        Vehicle vehicle2 = new Vehicle("DEF456", 5000, "Dent");
        Vehicle vehicle3 = new Vehicle("GHI789", 8000, "Broken Mirror");

        repairShop.addVehicle(vehicle1);
        repairShop.addVehicle(vehicle2);
        repairShop.addVehicle(vehicle3);

        System.out.println("Count: " + repairShop.getCount());

        Vehicle lowestMileageVehicle = repairShop.getLowestMileage();
        if (lowestMileageVehicle != null) {
            System.out.println("Lowest Mileage Vehicle: " + lowestMileageVehicle.toString());
        }

        System.out.println("Removing vehicle DEF456: " + repairShop.removeVehicle("DEF456"));

        System.out.println(repairShop.report());
    }
}
