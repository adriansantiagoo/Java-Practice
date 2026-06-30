package OOP_concepts.SmartWarehouse_system;

public class HazardousCargo extends Cargo implements Shippable{
    private int dangerLevel;

    public HazardousCargo(String id, String name, double weight, int dangerLevel) {
        super(id, name, weight);
        if (dangerLevel > 5 || dangerLevel < 1){
            throw new IllegalArgumentException("The danger level needs to be between 1 and 5.");
        }
        this.dangerLevel = dangerLevel;
    }

    @Override
    public double calculateStorageCost() {
        return this.getWeight() * 1.2 + this.dangerLevel * 50;
    }

    @Override
    public void ship() {

    }

    public int getDangerLevel() {
        return dangerLevel;
    }
}
