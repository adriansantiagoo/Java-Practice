package OOP_concepts.SmartWarehouse_system;

public abstract class Cargo {
    private String id;
    private String name;
    private double weight;

    public Cargo(String id, String name, double weight){
        if (weight < 0){
            throw new IllegalArgumentException("The weight cannot be less than 0");
        }
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public abstract double calculateStorageCost();

    @Override
    public String toString() {
        return "ID: " + this.id + " | Name: " + this.name + " | Weight: " + this.weight;
    }
}
