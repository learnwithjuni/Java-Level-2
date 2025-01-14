import java.util.*;

class Main {
  public static void main(String[] args) {
    // Create two cars using both of your constructors.
    Car c1 = new Car("sedan", "red");
    Car c2 = new Car("sports car", "blue", 60000);

    // Print out the color and type of one of your cars using the getter methods. 
    System.out.println(c1.getColor());
    System.out.println(c1.getCarType());

    // Test the drive method.
    System.out.println(c1.getMileage());
    c1.drive(20000);
    System.out.println(c1.getMileage());

    // User your toString method to print out one of your Car objects.
    System.out.println(c2);
    
    // Call the static getter method.
    System.out.println("Number of cars: " + Car.getNumCars());

    // Create a third Car object, put all three of your Car objects into an array, sort the array, and finally, print each Car in the array.
    Car c3 = new Car("coupe", "yellow", 1500);
    System.out.println("\nUnsorted cars: ");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println();
    
    System.out.println("Sorted cars:");
    Car[] arr = {c1,c2,c3};
    Arrays.sort(arr);
    for (Car c : arr) {
      System.out.println(c);
    }
  }
}