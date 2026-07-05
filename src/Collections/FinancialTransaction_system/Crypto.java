package Collections.FinancialTransaction_system;

public class Crypto extends Transaction{
    private String blockchainAddress;

    public Crypto(String id, double amount, String blockchainAddress) {
        super(id, amount);
        this.blockchainAddress = blockchainAddress;
    }

    public String getBlockchainAddress() {
        return blockchainAddress;
    }
}
