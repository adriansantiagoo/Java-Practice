package Collections.SmartLogistics_system;

import java.util.ArrayList;

public class SmartContainer <T extends Cargo>{
    private ArrayList<T> list = new ArrayList<>();
    private double maxWeightCapacity;

    public SmartContainer(double maxWeightCapacity){
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public double getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public boolean addItem(T item){
        if (getTotalWeight() + item.getWeight() > maxWeightCapacity) {
            return false;
        }
        list.add(item);
        return true;
    }

    public double getTotalWeight(){
        double totalWeight = 0;

        for (T item : list){
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public T getHeaviestItem(){
        if (list.isEmpty()) {
            return null;
        }
        T heaviestItem = list.getFirst();
        for (T item : list) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
