
package com.example.BMI_Calculator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    private final BMICalculator calc = new BMICalculator();

   
    public void testCalculateBMI() {
        assertEquals(22.86, calc.calculateBMI(70, 1.75), 0.01);
    }

    
    public void testUnderweight() {
        assertEquals("Underweight", calc.getCategory(18.4));
    }

    
    public void testNormalWeight() {
        assertEquals("Normal weight", calc.getCategory(22));
    }

    
    public void testOverweight() {
        assertEquals("Overweight", calc.getCategory(27));
    }

    
    public void testObese() {
        assertEquals("Obese", calc.getCategory(32));
    }

    
    public void testBoundaryValues() {
        assertEquals("Normal weight", calc.getCategory(18.5));
        assertEquals("Overweight", calc.getCategory(25));
        assertEquals("Obese", calc.getCategory(30));
    }

    
    public void testZeroWeight() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(0, 1.75));
    }

    
    public void testNegativeWeight() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(-70, 1.75));
    }

    
    public void testZeroHeight() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, 0));
    }

    
    public void testNegativeHeight() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, -1.75));
    }
    
    public void testExtremeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, 1e-200));
    }
}
