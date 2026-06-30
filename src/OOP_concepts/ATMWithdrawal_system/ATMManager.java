package OOP_concepts.ATMWithdrawal_system;

public class ATMManager{

    private double limit;
    public ATMManager(double limit){
        this.limit = limit;
    }

    public double getLimit(){
        return limit;
    }

    public boolean processWithdrawal(Account account, double withdraw){
        if (withdraw > this.limit){
            System.out.println("The amount cannot be greater than $" + this.limit);
            return false;
        }
        return account.deduct(withdraw);
    }
}
