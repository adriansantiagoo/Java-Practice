package OOP_concepts.ECommerceWarehouse_system;

public class Main {
    public static void main(String[] args){
        Stock stock = new Stock(0);
        Order order = new Order(10, "PENDING");

        order.fulfill(stock);

        System.out.println(stock.getTotalItems());
        System.out.println(order.getStatus());
    }
}
