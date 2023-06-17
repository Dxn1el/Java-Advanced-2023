package automotiveRepairShop;

import java.util.*;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String VIN) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(VIN)) {
                vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return vehicles.size();
    }

    public Vehicle getLowestMileage() {
        if (vehicles.isEmpty()) {
            return null;
        }

        Vehicle lowestMileageVehicle = vehicles.get(0);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMileage() < lowestMileageVehicle.getMileage()) {
                lowestMileageVehicle = vehicle;
            }
        }
        return lowestMileageVehicle;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in the repair shop:\n");
        for (Vehicle vehicle : vehicles) {
            sb.append(vehicle.toString()).append("\n");
        }
        return sb.toString();
    }
}
