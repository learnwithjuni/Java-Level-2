import java.util.*;

public class Dealership {
    private Map<String, Car> inventory = new HashMap<>();

    public void addCar(String vin, Car car) {
        inventory.put(vin, car);
    }

    public void removeCar(String vin) {
        inventory.remove(vin);
    }

    public Car searchCar(String vin) {
        return inventory.get(vin);
    }

    public ArrayList<Car> searchCar(String make, String model, int year) {
        ArrayList<Car> results = new ArrayList<>();
        for (Car car : inventory.values()) {
            if ((make == null || car.getMake().equalsIgnoreCase(make)) &&
                    (model == null || car.getModel().equalsIgnoreCase(model)) &&
                    (year == 0 || car.getYear() == year)) {
                results.add(car);
            }
        }
        return results;
    }

    public void displayCar(String vin) {
        Car car = inventory.get(vin);
        car.displayDetails();
    }

    public void displayInventory() {
        System.out.println("\nCar Inventory:");
        for (Map.Entry<String, Car> entry : inventory.entrySet()) {
            inventory.get(entry.getKey()).displayDetails();
            System.out.println();
        }
    }
}