package OOP_concepts.WarehouseInventory_system;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Smartphone", 800);

        String info1 = product1.getProductDetails();
        String info2 = product2.getProductDetails();
        String inventoryReport = Product.getInventoryReport();
        double tax1 = Product.calculateTax(product1.price);
        double tax2 = Product.calculateTax(product2.price);

        System.out.println(info1);
        System.out.println(info2);

        System.out.println(inventoryReport);

        System.out.printf("The tax of the %s is $%.2f\n", product1.name, tax1);
        System.out.printf("The tax of the %s is $%.2f\n", product2.name, tax2);
    }
}
