package ProgrammingLogic.SortingBelt_system;

public class Package {
    private final int weight;
    private final boolean isFragile;

    public Package(int weight, boolean isFragile) {
        this.weight = weight;
        this.isFragile = isFragile;
    }

    public int getWeight() { return weight; }
    public boolean isFragile() { return isFragile; }
}
