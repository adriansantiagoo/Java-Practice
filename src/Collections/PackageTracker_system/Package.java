package Collections.PackageTracker_system;

public class Package {
    private int trackingCode;
    private double weight;
    private String destinationCity;

    public Package(int trackingCode, double weight, String destinationCity) {
        if (trackingCode <= 0){
            throw new IllegalArgumentException("The tracking code need be greater than zero.");
        }
        if (weight < 0){
            throw new IllegalArgumentException("The package weight cannot be less than zero.");
        }
        this.trackingCode = trackingCode;
        this.weight = weight;
        this.destinationCity = destinationCity;
    }

    public int getTrackingCode() { return trackingCode; }
    public double getWeight() { return weight; }
    public String getDestinationCity() { return destinationCity; }

    @Override
    public String toString() {
        return "Package #" + trackingCode + " -> Destination: " + destinationCity + ", Weight: " + weight + "kg";
    }
}
