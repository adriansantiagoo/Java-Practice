package OOP_concepts.ECommerceWarehouse_system;

public class Order {
    private int itemsWanted;
    private String status;

    public Order(int itemsWanted, String status){
        if (itemsWanted <= 0){
            throw new IllegalArgumentException("The items wanted cannot be less than zero.");
        }
        if (!status.equals("PENDING")){
            throw new IllegalArgumentException("Invalid status");
        }
        this.itemsWanted = itemsWanted;
        this.status = status;
    }

    public void fulfill(Stock stock){
        int itemsReceived = stock.dropItems(this.itemsWanted);
        if (itemsReceived == itemsWanted){
            this.status = "FULFILLED";
        }
        else if (itemsReceived == 0){
            this.status = "PENDING";
        }
        else this.status = "PARTIALLY_FULFILLED";
    }

    public int getItemsWanted() {
        return itemsWanted;
    }

    public String getStatus() {
        return status;
    }
}
