package OOP_concepts.ECommerceWarehouse_system;

public class Stock {
    private int totalItems;

    public Stock(int totalItems){
        if (totalItems < 0){
            throw new IllegalArgumentException("The total items cannot be less than zero.");
        }
        this.totalItems = totalItems;
    }

    public int dropItems (int itemsWanted){
        if (this.totalItems < itemsWanted){
            int currentTotalItems = this.totalItems;
            this.totalItems = 0;
            return currentTotalItems;
        }
        this.totalItems -= itemsWanted;
        return itemsWanted;
    }

    public int getTotalItems() {
        return totalItems;
    }
}
