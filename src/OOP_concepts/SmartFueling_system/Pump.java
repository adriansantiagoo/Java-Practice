package OOP_concepts.SmartFueling_system;

public class Pump {
    private double fuelReservoir;

    public Pump(double fuelReservoir){
        if (fuelReservoir < 0){
            // I need this to prevent invalid values in my code
            throw new IllegalArgumentException("The fuel reservoir cannot be less than zero.");
        }
        this.fuelReservoir = fuelReservoir;
    }

    public double getFuelReservoir() {
        return fuelReservoir;
    }

    public void refuelingProcess(Car car){
        double fuelRemoved = car.fillTank(this.fuelReservoir);

        fuelReservoir -= fuelRemoved;
    }
}
