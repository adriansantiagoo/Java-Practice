package OOP_concepts.CityTransit_system;

public class Bus extends Vehicle implements FareCollectable{
    public Bus(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void processTicket(double fare) {
        System.out.println("Bus scans a " + fare);
    }

    @Override
    public void move() {
        System.out.printf("Bus %s is driving on asphalt routes.", this.getLicensePlate());
    }
}
