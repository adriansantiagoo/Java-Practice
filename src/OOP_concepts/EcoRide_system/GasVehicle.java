package OOP_concepts.EcoRide_system;

public class GasVehicle extends Vehicle{
    public GasVehicle(String name, String id, double baseRentalRate) {
        super(name, id, baseRentalRate);
    }

    @Override
    public boolean canRent() {
        return true;
    }
}
