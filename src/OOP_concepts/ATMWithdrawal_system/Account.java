package OOP_concepts.ATMWithdrawal_system;

public class Account {
    private double balance;

    public Account(double balance){
        if (balance < 0){
            throw new IllegalArgumentException("The balance cannot be less than zero.");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deduct(double withdraw){
        if (withdraw > this.balance){
            System.out.println("The amount cannot be greater than the current balance.");
            return false;
        }
        this.balance -= withdraw;
        return true;
    }
}
