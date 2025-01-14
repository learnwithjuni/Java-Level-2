class Car extends LandVehicle {
    private int numberOfDoors;
    private String bodyStyle;
    private String engineType;

    public Car(String make, String model, int year, String color, int numberOfWheels, String fuelType, double miles,
            int numberOfDoors, String bodyStyle, String engineType) {
        super(make, model, year, color, numberOfWheels, fuelType, miles);
        this.numberOfDoors = numberOfDoors;
        this.bodyStyle = bodyStyle;
        this.engineType = engineType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method to print common details
        System.out.println("  Doors: " + getNumberOfDoors());
        System.out.println("  Body Style: " + getBodyStyle());
        System.out.println("  Engine: " + getEngineType());
    }
}