package automotiveRepairShop;
import java.util.*;
public class Vehicle {
    private String VIN;
    private int mileage;
    private String damage;

    public Vehicle(String VIN, int mileage, String damage) {
        this.VIN = VIN;
        this.mileage = mileage;
        this.damage = damage;
    }

    public String getVIN() {
        return VIN;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Damage: " + damage + ", Vehicle: " + VIN + " (" + mileage + " km)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicle vehicle = (Vehicle) obj;
        return VIN.equals(vehicle.VIN);
    }

    @Override
    public int hashCode() {
        return VIN.hashCode();
    }
}
