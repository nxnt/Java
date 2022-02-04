public class Main {
    
    public static void main(String[] args) {
        
        Stock object = new Stock("ORCL", "Oracle Corporation");
        object.getChangePrecent();
        System.out.println("Symbol: " + object.symbol);
        System.out.println("Name: " + object.name);
        System.out.println("Previous Closing Price: " + object.previousClosingPrice);
        System.out.println("Current Price: " + object.currentPrice);
        System.out.println("Price Change: " + object.priceChange + "%");
    }
}