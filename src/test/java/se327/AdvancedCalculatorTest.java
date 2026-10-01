package se327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdvancedCalculatorTest {
    @Test
     void testPower() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        assertEquals(4.0, advancedCalculator.power(2, 2), 0.01);
    }

    @Test
     void testSquareRoot() {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        assertEquals(2.0, advancedCalculator.sqrt(4), 0.01);
        assertThrows(IllegalArgumentException.class, () -> advancedCalculator.sqrt(-1));
    }
}
