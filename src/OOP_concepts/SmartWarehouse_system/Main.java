package OOP_concepts.SmartWarehouse_system;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Booting LogiFlex Warehouse System ===\n");

        Warehouse logiFlex = new Warehouse();

        Cargo textiles = new StandardCargo("STD-101", "Cotton T-Shirts", 500.0);
        Cargo strawberries = new PerishableCargo("PER-201", "Fresh Strawberries", 150.0, 2);
        Cargo frozenPeas = new PerishableCargo("PER-202", "Frozen Peas", 300.0, 14);
        Cargo chemicals = new HazardousCargo("HAZ-301", "Industrial Bleach", 800.0, 4);

        // 3. Load Cargo into the Warehouse
        System.out.println("--> Loading items into bays...");
        logiFlex.addCargo(textiles);
        logiFlex.addCargo(strawberries);
        logiFlex.addCargo(frozenPeas);
        logiFlex.addCargo(chemicals);
        System.out.println("--> Loading complete.\n");

        // 4. Test Array Reading & toString() Overrides
        System.out.println("=== Current Inventory ===");
        logiFlex.listInventory();

        // 5. Test Static Tracking (Called on the Class itself, not the instance!)
        System.out.println("\n=== Global Metrics ===");
        System.out.println("Total Items Stored: " + Warehouse.getTotalCargo());
        System.out.println("Total Weight in System: " + Warehouse.getTotalWeight() + " kg");

        // 6. Test Polymorphic Math
        System.out.println("\n=== Financial Report ===");
        System.out.println("Total Daily Storage Value: $" + logiFlex.calculateTotalValue());

        // 7. Test Interface Isolation
        System.out.println("\n=== Shipping Operations ===");
        // We want to ship the chemicals, but the reference type is 'Cargo'.
        // We must check if it signed the 'Shippable' contract first.
        if (chemicals instanceof Shippable) {
            System.out.println(chemicals.getName() + " is approved for shipping logistics.");
            // Cast it to the interface to unlock the ship() method
            ((Shippable) chemicals).ship();
        }
        else {
            System.out.println("ERROR: " + chemicals.getName() + " cannot be shipped.");
        }
    }
}
