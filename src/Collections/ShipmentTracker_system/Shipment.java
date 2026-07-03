package Collections.ShipmentTracker_system;

public class Shipment {
    private int id;
    private double weight;

    public Shipment(int id, double weight){
        this.weight = weight;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }
}
