package Algorithms.MergeSort;

public enum UrgencyTier {
    EXPRESS(3),
    STANDARD(2),
    ECONOMY(1);

    private final int weight;

    UrgencyTier(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
