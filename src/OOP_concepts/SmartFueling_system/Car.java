package OOP_concepts.SmartFueling_system;

public class Car {
    private double capacity;
    private double currentFuelLevel;

    public Car(double capacity, double currentFuelLevel){
        if (capacity < 0){
            throw new IllegalArgumentException("The capacity cannot be less than zero.");
        }
        if (currentFuelLevel < 0){
            throw new IllegalArgumentException("The current fuel level cannot be less than zero.");
        }
        if (currentFuelLevel > capacity){
            // I need this to prevent invalid values in my code
            throw new IllegalArgumentException("The current fuel level cannot be greater than the capacity.");
        }
        this.capacity = capacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double fillTank(double offeredFuel){
        if (this.capacity <= this.currentFuelLevel){
            return 0;
        }

        double fuelNeeded = this.capacity - this.currentFuelLevel;

        if (fuelNeeded >= offeredFuel){
            this.currentFuelLevel += offeredFuel;
            return offeredFuel;
        }

        this.currentFuelLevel += fuelNeeded;
        return fuelNeeded;
    }
}
