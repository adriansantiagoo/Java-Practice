package OOP_concepts.CityTransit_system;

public class ElectricTrain extends Vehicle implements FareCollectable{
    public ElectricTrain(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void processTicket(double fare) {
        System.out.println("Train scans an " + fare);
    }

    @Override
    public void move() {
        System.out.printf("ElectricTrain %s is gliding silently on the electric rails.", this.getLicensePlate());
    }
}
