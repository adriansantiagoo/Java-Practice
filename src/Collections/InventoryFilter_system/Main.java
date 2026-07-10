package Collections.InventoryFilter_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electronics> techDevices = new ArrayList<>();
        techDevices.add(new Electronics("Laptop", 1200));
        techDevices.add(new Electronics("Phone", 500));

        InventoryFilter.printInventory(techDevices);

        ArrayList<Product> expensiveItems = InventoryFilter.filterByPriceAbove(techDevices, 600);

        System.out.println(expensiveItems);
    }
}
