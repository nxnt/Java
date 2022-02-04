public class Stock {
    
    public String symbol; 
    public String name;
    public double previousClosingPrice = 34.5;
    public double currentPrice = 34.35;
    public double priceChange;
    
    public Stock (String symbol, String name) {

        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePrecent() {

        priceChange = ((currentPrice * 100) / previousClosingPrice ) - 100;
        return priceChange;
    }
}
