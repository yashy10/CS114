public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    //Constructor method
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        }

    //Accessor Methods
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    //mutator medthods
    public void previousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public void currentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double changePercent() {
        if (previousClosingPrice != 0) {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        } else {
            return 0;
        }
    }
    }
