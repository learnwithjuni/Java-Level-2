
// Main.java
import java.util.*;

class Main {
  public static void main(String[] args) {
    Dealership ds = new Dealership();

    // Add sample cars
    ds.addCar("VIN123", new Car("Toyota", "Camry", 2023, "Silver", 4, "Gasoline", 100, 4, "Sedan", "2.5L I4"));
    ds.addCar("VIN456", new Car("Ford", "F-150", 2024, "Blue", 4, "Gasoline", 150, 2, "Truck", "3.5L V6"));
    ds.addCar("VIN789", new Car("Honda", "CRV", 2023, "Black", 4, "Gasoline", 200, 4, "SUV", "1.5L Turbo"));

    // Display inventory
    ds.displayInventory();

    // Search and display a car
    System.out.println("Search and display car: ");
    ds.displayCar("VIN456");

    // Search by criteria
    ArrayList<Car> searchResults = ds.searchCar("Ford", null, 0);
    System.out.println("\nSearch Results:");
    for (Car car : searchResults) {
      System.out.println("  - " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
    }
  }
}