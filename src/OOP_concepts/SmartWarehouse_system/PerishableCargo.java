package OOP_concepts.SmartWarehouse_system;

public class PerishableCargo extends Cargo{
    private int expiryDays;

    public PerishableCargo(String id, String name, double weight, int expiryDays) {
        super(id, name, weight);
        if (expiryDays < 0){
            throw new IllegalArgumentException("The expiry days must be greater than zero.");
        }
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    @Override
    public double calculateStorageCost() {
        double storageCost = this.getWeight() * 0.5;

        if (this.expiryDays < 3){
            storageCost += 100;
        }
        else storageCost += 20;

        return storageCost;
    }
}
