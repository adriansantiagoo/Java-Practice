package Collections.FinancialTransaction_system;

public abstract class Transaction {
    private String id;
    private double amount;

    public Transaction(String id, double amount){
        if (amount < 0){
            throw new IllegalArgumentException("The amount cannot be less than zero.");
        }
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
