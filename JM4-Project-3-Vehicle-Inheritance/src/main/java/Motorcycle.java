class Motorcycle extends LandVehicle {
    private String engineType;
    private String bikeType; // e.g., Sport, Cruiser, Touring
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String color, int numberOfWheels, String fuelType,
            double miles, String engineType, String bikeType, boolean hasSidecar) {
        super(make, model, year, color, numberOfWheels, fuelType, miles);
        this.engineType = engineType;
        this.bikeType = bikeType;
        this.hasSidecar = hasSidecar;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

   
    public void displayDetails() {
        System.out.println("  Vehicle: Motorcycle");
        super.displayDetails(); // Call the superclass method to print common details
        System.out.println("  Engine: " + getEngineType());
        System.out.println("  Bike Type: " + getBikeType());
        System.out.println("  Has Sidecar: " + isHasSidecar());
    }
}