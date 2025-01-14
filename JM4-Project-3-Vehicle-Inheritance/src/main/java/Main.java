public class Main {
  public static void main(String[] args) {
    Motorcycle m1 = new Motorcycle(
      "Harley-Davidson",  // make
      "Sportster",        // model
      2020,               // year
      "Black",            // color
      2,                  // number of wheels
      "Gasoline",         // fuel type
      15000.5,            // miles
      "V-Twin",           // engine type
      "Cruiser",          // bike type
      false               // has sidecar
    );

    // Second motorcycle (m2)
    Motorcycle m2 = new Motorcycle(
      "Yamaha",           // make
      "MT-09",            // model
      2022,               // year
      "Blue",             // color
      2,                  // number of wheels
      "Gasoline",         // fuel type
      5000.75,            // miles
      "Inline-3",         // engine type
      "Naked",            // bike type
      false               // has sidecar
    );

    // Output the motorcycle data
    m1.displayDetails();
    System.out.println();
    m2.displayDetails();


    // First car (c1)
    Car c1 = new Car(
        "Toyota",           // make
        "Camry",            // model
        2019,               // year
        "White",            // color
        4,                  // number of wheels
        "Gasoline",         // fuel type
        30000.0,            // miles
        4,                  // number of doors
        "Sedan",            // body style
        "V6"                // engine type
    );

    // Second car (c2)
    Car c2 = new Car(
        "Tesla",            // make
        "Model S",          // model
        2021,               // year
        "Red",              // color
        4,                  // number of wheels
        "Electric",         // fuel type
        15000.5,            // miles
        4,                  // number of doors
        "Hatchback",        // body style
        "Electric"          // engine type
    );

    // Output the car data
    c1.displayDetails();
    System.out.println();
    c2.displayDetails();


  }
}