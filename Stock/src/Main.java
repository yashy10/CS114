public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock("GOOG", "Google Inc");
        Stock stock2 = new Stock("META", "Meta Platforms Inc");
        Stock stock3 = new Stock("AMZ","Amazon");

        stock.previousClosingPrice(1000.00);
        stock.currentPrice(2000.00);

        stock2.previousClosingPrice(593.28);
        stock2.currentPrice(591.80);

        stock3.previousClosingPrice(190.83);
        stock3.currentPrice(192.73);

        double changePerecent = stock.changePercent();
        System.out.println("Google change price: " + changePerecent);
        double changePercent2 = stock2.changePercent();
        System.out.println("Facebook change price: " + changePercent2);
        double changePercent3 = stock3.changePercent();
        System.out.println("Amazon change price: " + changePercent3);


    }
}