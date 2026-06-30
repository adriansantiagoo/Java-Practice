package OOP_concepts.SmartWarehouse_system;

public class StandardCargo extends Cargo{
    public StandardCargo(String id, String name, double weight) {
        super(id, name, weight);
    }

    @Override
    public double calculateStorageCost() {
        return this.getWeight() * 0.5;
    }
}
