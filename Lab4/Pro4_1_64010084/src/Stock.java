public class Stock {
    
    public String symbol; 
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public double priceChange;
    
    public Stock (String symbol, String name, double previousClosingPrice, double currentPrice) {

        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePrecent() {

        priceChange = ((currentPrice * 100) / previousClosingPrice ) - 100;
        return priceChange;
    }
}
