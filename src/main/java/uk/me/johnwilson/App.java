package uk.me.johnwilson;

import uk.me.johnwilson.elephantcarpaccio.ElephantCarpaccio;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ElephantCarpaccio elephantCarpaccio = new ElephantCarpaccio();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items?");

        int quantity = scanner.nextInt();
        System.out.println("What is a price per item?");


        double price = scanner.nextDouble(); //children please dont use double for recording money


        System.out.println("Where r u?");
        String state = scanner.next().toUpperCase(Locale.ROOT);
        double total = price * quantity;
        double discount = elephantCarpaccio.getOrderValueDiscount(total)/100D;
        elephantCarpaccio.setTaxRate(state);


        elephantCarpaccio.setPricePerItem(price);
        elephantCarpaccio.setNumberofItems(quantity);


        System.out.println("Total------"+ elephantCarpaccio.getFinalValue());
    }
}
