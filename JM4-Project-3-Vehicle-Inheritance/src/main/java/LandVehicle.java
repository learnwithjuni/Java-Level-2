class LandVehicle extends Vehicle {
    private int numberOfWheels;
    private String fuelType;
    private double miles;

    public LandVehicle(String make, String model, int year, String color, int numberOfWheels, String fuelType,
            double miles) {
        super(make, model, year, color);
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.miles = miles;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getMiles() {
        return miles;
    }

    public void increaseMiles(double milesDriven) {
        if (milesDriven > 0) {
            this.miles += milesDriven;
        } else {
            System.out.println("Miles driven must be a positive value.");
        }
    }

    
    public void displayDetails() {
        super.displayDetails();// Call the superclass method to print common details
        System.out.println("  Wheels: " + getNumberOfWheels());
        System.out.println("  Fuel Type: " + getFuelType());
        System.out.println("  Miles Driven: " + getMiles());
    }
}