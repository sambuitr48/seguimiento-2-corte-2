package co.cue.edu.shoestore.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceUtilsTest {

    public double applyDiscount(double price, double discountPercentage) {
        return price - (price * discountPercentage / 100); // Aplica descuento simple
    }

    @Test
    void shouldApplyDiscountCorrectly() {
        double discounted = applyDiscount(100.0, 20.0);
        assertEquals(80.0, discounted); // Espera que el resultado sea 80.0
    }

}
