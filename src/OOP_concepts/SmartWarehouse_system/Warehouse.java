package OOP_concepts.SmartWarehouse_system;

public class Warehouse {
    private Cargo[] inventory = new Cargo[10];
    private int itemCount;
    private static int totalCargo;
    private static double totalWeight;

    public static int getTotalCargo() {
        return totalCargo;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public void addCargo(Cargo item){
        if (itemCount == inventory.length){
            System.out.println("Error: Warehouse is full!");
            return;
        }

        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] == null){
                inventory[i] = item;
                totalCargo++;
                totalWeight += item.getWeight();
                itemCount++;
                break;
            }
        }
    }

    public void listInventory(){
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] != null) {
                System.out.println("Cargo " + (i + 1) + ": " + inventory[i]);
            }
        }
    }

    public double calculateTotalValue(){
        double totalValue = 0;

        for (Cargo item : inventory) {
            if (item != null) {
                totalValue += item.calculateStorageCost();
            }
        }

        return totalValue;
    }
}
