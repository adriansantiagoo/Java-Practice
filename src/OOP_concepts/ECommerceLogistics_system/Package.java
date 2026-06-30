package OOP_concepts.ECommerceLogistics_system;

public class Package {
    private String name;
    private int quantity;

    public Package(String name, int quantity){
        if (quantity <= 0){
            throw new IllegalArgumentException("The quantity needs to be greater than zero.");
        }
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
