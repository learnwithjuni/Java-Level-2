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

    public void displayDetails() {
        // Insert Missing Code Below

    }
}