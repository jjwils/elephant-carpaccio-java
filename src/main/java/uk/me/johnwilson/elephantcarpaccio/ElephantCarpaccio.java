package uk.me.johnwilson.elephantcarpaccio;

public class ElephantCarpaccio {

    Integer numberOfItems;
    Double pricePerItem;
    private String taxRate;


    public int getOrderValueDiscount(double orderValue) {
        if (orderValue >= 50000){
            return 15;
        }

         if (orderValue >= 10000){
            return 10;
        }

        if (orderValue >= 7000){
            return 7;
        }

        if (orderValue >= 5000){
            return 5;
        }

        if (orderValue >= 1000){
            return 3;
        }

        return 0;
    }

    public void setNumberofItems(int i) {
        numberOfItems = i;


    }

    public void setPricePerItem(double v) {
        pricePerItem = v;

    }

    public String getFinalValue() {
        double price = pricePerItem;
        double total = price * numberOfItems;
        double discount = getOrderValueDiscount(total)/100D;
        total-= total * discount;
        total += total * getTaxRate()/100d;
        return String.format("%.2f", total);
    }

    public void setTaxRate(String ut) {
        taxRate = ut;
    }

    public double getTaxRate() {
        if (taxRate == null) return 0;

        if (taxRate.equals("UT")){
            return 6.85;
        }

        if (taxRate.equals("NV")){
            return 8.00;
        }

        if (taxRate.equals("TX")){
            return 6.25;
        }

        if (taxRate.equals("AL")){
            return 4.00;
        }

        if (taxRate.equals("CA")){
            return 8.25;
        }

        return 0;
    }
}
