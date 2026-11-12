
package com.example.BMI_Calculator1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    BMICalculator calc = new BMICalculator();

    // Test Case 1: Calculate BMI
  
    public void testBMICalculation() {
        assertEquals(22.86, calc.calculateBMI(70, 1.75), 0.01);
    }

    // Test Case 2: Underweight
    
    public void testUnderweight() {
        assertEquals("Underweight", calc.getCategory(17.0));
    }

    // Test Case 3: Normal Weight
  
    public void testNormalWeight() {
        assertEquals("Normal weight", calc.getCategory(22.0));
    }

    // Test Case 4: Overweight
  
    public void testOverweight() {
        assertEquals("Overweight", calc.getCategory(27.0));
    }

    // Test Case 5: Obese
   
    public void testObese() {
        assertEquals("Obese", calc.getCategory(32.0));
    }
}
