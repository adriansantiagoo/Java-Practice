package Collections.SmartLogistics_system;

public class Main {
    public static void main(String[] args) {
        SmartContainer<Electronics> techBox = new SmartContainer<>(100.0);
        techBox.addItem(new Electronics("E1", 30.0, true));
        techBox.addItem(new Electronics("E2", 55.0, false));

        // this line would cause a compile-time error if uncommented:
        // techBox.addItem(new Groceries("G1", 10.0, 5));

        System.out.println("Heaviest tech item: " + techBox.getHeaviestItem().getTrackingId());
    }
}
