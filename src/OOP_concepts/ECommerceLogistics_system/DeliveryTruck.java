package OOP_concepts.ECommerceLogistics_system;

public class DeliveryTruck {
    private String name;
    private Package[] packages;
    private Engine engine;
    private int packageCount = 0;

    public DeliveryTruck(String name, String engineType, int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("The capacity needs to be greater than zero.");
        }
        this.name = name;
        this.engine = new Engine(engineType);
        this.packages = new Package[capacity];
    }

    public String getName() {
        return name;
    }

    public Package[] getPackages() {
        return packages;
    }

    public Engine getEngine() {
        return engine;
    }

    public void loadPackage(Package p){
        if(this.packageCount == this.packages.length){
            System.out.println("The capacity is full.");
            return;
        }

        this.packages[packageCount] = p;
        this.packageCount++;
    }

    public Package unloadPackage(int index){ // index = position - 1
        if (index < 0 || index >= this.packages.length) {
            throw new IllegalArgumentException("Invalid index boundary.");
        }

        Package packageToUnload = this.packages[index];

        if (packageToUnload != null) {
            this.packages[index] = null;
            this.packageCount--; // Maintain accurate count

            // Optional Step: Shift remaining elements left to close the gap
            for (int i = index; i < this.packages.length - 1; i++) {
                this.packages[i] = this.packages[i + 1];
            }
            this.packages[this.packages.length - 1] = null; // Clear the duplicated last slot
        }

        return packageToUnload;
    }

    public Package[] releaseAllPackages(){
        Package[] packagesToRelease = this.packages;

        for (int i = 0; i < this.packages.length; i++){
            this.packages[i] = null;
        }

        this.packageCount = 0;

        return packagesToRelease;
    }
}
