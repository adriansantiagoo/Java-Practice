package Collections.SmartLogistics_system;

public abstract class Cargo {
    private String trackingId;
    private double weight;

    public Cargo(String trackingId, double weight){
        if (weight < 0){
            throw new IllegalArgumentException("The cargo weight cannot be less than zero.");
        }
        this.trackingId = trackingId;
        this.weight = weight;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }
}
