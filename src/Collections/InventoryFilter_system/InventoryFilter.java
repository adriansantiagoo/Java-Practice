package Collections.InventoryFilter_system;

import java.util.ArrayList;

public class InventoryFilter {

    private InventoryFilter() {}

    public static ArrayList<Product> filterByPriceAbove(ArrayList<? extends Product> list, double minPrice){
        ArrayList<Product> newList = new ArrayList<>();

        for (Product p : list){
            if (p.getPrice() > minPrice){
                newList.add(p);
            }
        }

        return newList;
    }

    public static void printInventory(ArrayList<? extends Product> list){
        for (Product p : list){
            System.out.println(p.toString());
        }
    }
}
