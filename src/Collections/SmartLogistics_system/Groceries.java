package Collections.SmartLogistics_system;

public class Groceries extends Cargo{
    private int expirationDays;

    public Groceries(String trackingId, double weight, int expirationDays) {
        super(trackingId, weight);
        this.expirationDays = expirationDays;
    }

    public int getExpirationDays() {
        return expirationDays;
    }
}
