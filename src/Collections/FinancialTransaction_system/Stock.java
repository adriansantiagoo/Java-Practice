package Collections.FinancialTransaction_system;

public class Stock extends Transaction{
    private String tickerSymbol;

    public Stock(String id, double amount, String tickerSymbol) {
        super(id, amount);
        this.tickerSymbol = tickerSymbol;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }
}
