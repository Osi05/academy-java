package com.bptn.course.bigCoding._02_week._03_stock_class;

public class Stock {

    // Create instance variables 
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    // Constructor 
    public Stock (String tickerSymbol, String companyName, int price, int totalShares) {
      this.tickerSymbol = tickerSymbol.toUpperCase();
      this.companyName = companyName;
      this.price = price;
      this.totalShares = totalShares;
      
      // Default value for percentChange is 0
      this.percentChange = 0.0;

      // Calculate initial marketCap
      this.marketCap = (long) price * totalShares;
    }
    
    // Create the methods
    public void adjustPrice(int change){
    	
    	// Store the previous price
        int oldPrice = this.price;
        
      // Calculate the new price by adding the change
       this.price += change;

        // Calculate the percentChange based on the price change
        if (oldPrice != 0) {
            this.percentChange = ((double) change / oldPrice) * 100;
        }

        
      // Recalculate the marketCap
        this.marketCap = (long) this.price * this.totalShares;
    } 

    public String toString(){
      return "Ticker Symbol: " + tickerSymbol + "\n" +
              "Company: " + companyName + "\n" +
              "Current Price: $" + price + " " + "(" + percentChange + "%)" + "\n" +
              "Market Cap: $" + marketCap;
    }
    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
