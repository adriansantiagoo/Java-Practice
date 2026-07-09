package Algorithms.MergeSort;

public class Order {
    private final String orderId;
    private final UrgencyTier tier;
    private final long timestamp; // epoch milliseconds (older timestamp = smaller value)

    public Order(String orderId, UrgencyTier tier, long timestamp) {
        this.orderId = orderId;
        this.tier = tier;
        this.timestamp = timestamp;
    }

    public String getOrderId() {
        return orderId;
    }

    public UrgencyTier getTier() {
        return tier;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return String.format("Order{ID='%s', Tier=%s, Time=%d}", orderId, tier, timestamp);
    }
}
