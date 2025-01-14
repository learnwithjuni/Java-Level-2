/* ------------------------- */
// CLASSES AND OBJECTS
/* ------------------------- */

// What is a Class? What is an Object? Can you give an example of both?
// Ans: An Object is a way to represent a real-world entity in our code. A Class is the blueprint from which all Objects of that type are made. Any number of real-world template/creation examples work here (blueprint -> building, Jango Fett -> Clonetroopers, etc.)
// Also acceptable example would be String is a Class, and any variable we make of the String type is a String object 

// Define a Car class with private instance variables for the car type (example: truck, jeep, etc.), color, and number of miles driven by the car.

// implements Comparable<Car> is not added until the Comparable Objects section
public class Car implements Comparable<Car> {
  private String carType;
  private String color;
  private int milesDriven;

  private static int numCars; // This is not added until the Static Variables and Methods section

  // Create a constructor for the Car class that takes in an argument for each instance variable.
  public Car(String t, String c, int md) {
    carType = t;
    color = c;
    milesDriven = md;
    numCars++; // This is not added until the Static Variables and Methods section
  }

  // Create an overloaded constructor that takes in the car type and color and sets the miles driven to 0.
  public Car(String t, String c) {
    carType = t;
    color = c;
    milesDriven = 0;
    numCars++; // This is not added until the Static Variables and Methods section
  }

  //  In your main method, create two cars using both of your constructors. (See Main)


  /* ------------------------- */
  // CLASS METHODS
  /* ------------------------- */

  // Add getter (accessor) methods for all of the instance variables. Then in your main method, print out the color and model of one of your cars using the getter methods. (See Main)
  public String getCarType() {
    return carType;
  }
  public String getColor() {
    return color;
  }
  public int getMileage() {
    return milesDriven;
  }

  // Add a drive method that increases the milesDriven by a given amount. Then in your main method, test the drive method. (See Main)
  public void drive(int m) {
    if (m >= 0) {
      milesDriven += m;
    }
    else {
      System.out.println("Miles driven must be positive!");
    }
  }

  // Add a toString method that returns a sentence in the form: “A red Camry that has driven 1500 miles.” In your main method, use your toString method to print out one of your car objects. (See Main)
  public String toString() {
    return "A " + color + " " + carType + " that has driven " + milesDriven + " miles.";
  }

  // Write a method called sameMileage that takes in another Car object and returns true if both Cars have driven the same distance and false if they have driven different distances.
  public boolean sameMileage(Car other) {
    return getMileage() == other.getMileage();
  }


  /* ---------------------------- */
  // STATIC VARIABLES AND METHODS
  /* ---------------------------- */

  // What is a static variable? How is a static variable different from an instance variable?
  // Ans: a static variable belongs to the class, not a single instance. An instance variable is specific to a particular object, while a static variable is shared among all instances of the class.

  // Create a static variable to keep track of the total number of Cars. Make sure that each time a new Car is created, the variable gets increased. (See variables and constructors at the top of the Car definition)

  // Create a static method that returns the number of Cars. Then, in your main method, call the static getter method you just created. (See Main)
  public static int getNumCars() {
    return numCars;
  }

  
  /* ---------------------------- */
  // COMPARABLE OBJECTS
  /* ---------------------------- */
  
  //  If we want to sort a list of our Car objects, what do we need to add to the Car class?
  // Ans: we need "implements Comparable<Car>" to the Class header

  // Add the code to the class header to make this a comparable class. (See Class header)

  // What method do we need to define to be able to compare Car objects? Define the compareTo method.
  public int compareTo(Car other) {
    if (getMileage() < other.getMileage()) {
      return -1;
    }
    else if (getMileage() > other.getMileage()) {
      return 1;
    }
    else {
      return 0;
    }
  }

  // What values does the compareTo method return? How do we choose which value to return?
  // Ans: compareTo return 0 if the two objects are the same, a negative number (usually just -1) if the object calling the method should come in sorted order before the object that was passed into the method, and a positive number (usually just 1) if the object calling the method should come in sorted order after the object that was passed into the method.

  // In your main method, create three Cars, put them into an array, sort the array, and finally, print each Car in the array. (See Main)
}