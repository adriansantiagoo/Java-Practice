package OOP_concepts.CityTransit_system;

public abstract class Vehicle {
    private String licensePlate;
    private Driver driver;

    public Vehicle(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void assignDriver(Driver d){
        this.driver = d;
    }

    public abstract void move();

    public Driver getDriver() {
        return driver;
    }
}
