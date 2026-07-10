package Collections.InventoryFilter_system;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { return price; }
    public String getName() { return name; }

    @Override
    public String toString(){
        return "Name: " + name + " | Price: " + price;
    }
}
