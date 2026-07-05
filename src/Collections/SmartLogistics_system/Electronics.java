package Collections.SmartLogistics_system;

public class Electronics extends Cargo{
    private boolean isFragile;

    public Electronics(String trackingId, double weight, boolean isFragile) {
        super(trackingId, weight);
        this.isFragile = isFragile;
    }

    public boolean isFragile() {
        return isFragile;
    }
}
