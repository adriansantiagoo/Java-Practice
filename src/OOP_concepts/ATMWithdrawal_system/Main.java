package OOP_concepts.ATMWithdrawal_system;

public class Main {
    public static void main(String[] args){
        Account account = new Account(600);

        ATMManager atmManager = new ATMManager(500);

        boolean successfulOperation1 = atmManager.processWithdrawal(account, 450);

        if (successfulOperation1){
            System.out.println("Success!");
        }

        boolean successfulOperation2 = atmManager.processWithdrawal(account, 450);

        System.out.println(successfulOperation2);
    }
}
