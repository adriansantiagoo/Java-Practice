package OOP_concepts.EcoRide_system;

public abstract class Vehicle {
    private final String name;
    private final String id;
    private final double baseRentalRate;

    public Vehicle(String name, String id, double baseRentalRate){
        if (baseRentalRate <= 0){
            throw new IllegalArgumentException("The base rental rate must be greater than zero.");
        }
        this.name = name;
        this.id = id;
        this.baseRentalRate = baseRentalRate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    @Override
    public String toString(){
        return this.name + " [ID: " + this.id + "]";
    }

    public double calculatePrice(int hours){
        return baseRentalRate * hours;
    }

    public abstract boolean canRent(); // I need to do this for force every class that extends Vehicle to override that method.
}
