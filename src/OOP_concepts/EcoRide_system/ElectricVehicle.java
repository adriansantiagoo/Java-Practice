package OOP_concepts.EcoRide_system;

public class ElectricVehicle extends Vehicle implements Electric{
    private double batteryPercentage;

    public ElectricVehicle(String name, String id, double baseRentalRate, double batteryPercentage) {
        if (batteryPercentage < 0){
            throw new IllegalArgumentException("THe battery percentage cannot be less than zero.");
        }
        super(name, id, baseRentalRate);
        this.batteryPercentage = batteryPercentage;
    }

    public double getBatteryPercentage(){
        return batteryPercentage;
    }

    @Override
    public void charge() {
        this.batteryPercentage = 100;
    }

    @Override
    public String toString(){
        return getName() + " [ID: " + getId() + ", Battery: " + this.batteryPercentage + "%]";
    }

    @Override
    public boolean canRent(){
        return this.batteryPercentage >= 10;
    }
}

