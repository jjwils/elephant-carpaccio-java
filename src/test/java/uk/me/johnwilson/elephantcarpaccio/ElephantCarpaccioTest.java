package uk.me.johnwilson.elephantcarpaccio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElephantCarpaccioTest {

    @Test
    void calculateTotalValue(){
        ElephantCarpaccio elephantCarpaccio = new ElephantCarpaccio();
        elephantCarpaccio.setNumberofItems(3);
        elephantCarpaccio.setPricePerItem(3555.45);
        assertEquals("9599.71",elephantCarpaccio.getFinalValue());

//tax rate
        elephantCarpaccio.setNumberofItems(3);
        elephantCarpaccio.setPricePerItem(3555.45);
        elephantCarpaccio.setTaxRate("AL");
        assertEquals("9983.70",elephantCarpaccio.getFinalValue());





    }

    @Test
    void calculateDiscountValue(){
        ElephantCarpaccio elephantCarpaccio = new ElephantCarpaccio();

        assertEquals(3, elephantCarpaccio.getOrderValueDiscount(1000));
        assertEquals(5, elephantCarpaccio.getOrderValueDiscount(5000));
        assertEquals(7, elephantCarpaccio.getOrderValueDiscount(7000));
        assertEquals(10, elephantCarpaccio.getOrderValueDiscount(10000));
        assertEquals(15, elephantCarpaccio.getOrderValueDiscount(50000));

    }

    @Test
    void getTaxRate(){
        ElephantCarpaccio elephantCarpaccio = new ElephantCarpaccio();
        elephantCarpaccio.setTaxRate("UT");
        assertEquals(6.85, elephantCarpaccio.getTaxRate());

        elephantCarpaccio.setTaxRate("NV");
        assertEquals(8, elephantCarpaccio.getTaxRate());

        elephantCarpaccio.setTaxRate("TX");
        assertEquals(6.25, elephantCarpaccio.getTaxRate());

        elephantCarpaccio.setTaxRate("AL");
        assertEquals(4.00, elephantCarpaccio.getTaxRate());

        elephantCarpaccio.setTaxRate("CA");
        assertEquals(8.25, elephantCarpaccio.getTaxRate());
    }
}
