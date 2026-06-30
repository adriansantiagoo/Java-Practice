package OOP_concepts.WarehouseInventory_system;

public class Product {
    static int totalProducts;
    int sn; // serial number
    String name;
    double price;
    static double totalValue;

    static double calculateTax(double amount){
        return 0.07 * amount;
    }

    Product(String name, double price){
        totalProducts++;
        this.name = name;
        this.price = price;
        sn = 999 + totalProducts;
        totalValue += price;
    }

    String getProductDetails(){
        return "Serial number: " + sn + " | Product: " + name + " | Price: $" + price;
    }

    static String getInventoryReport(){
        return "Total Products: " + totalProducts + " | Total Warehouse Value: $" + totalValue;
    }
}
