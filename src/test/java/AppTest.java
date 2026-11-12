


import org.junit.jupiter.api.Test;

import com.example.BMI_Calculator1.BMICalculator;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    BMICalculator calc = new BMICalculator();

    // Test Case 1: BMI calculation for known values
    @Test
    public void testBMICalculation() {
        assertEquals(22.86, calc.calculateBMI(70, 1.75), 0.01);
    }

    // Test Case 2: Category classification at boundaries
    @Test
    public void testCategoryBoundaries() {
        assertEquals("Normal weight", calc.getCategory(18.5));
        assertEquals("Overweight", calc.getCategory(25.0));
        assertEquals("Obese", calc.getCategory(30.0));
    }

    // Test Case 3: Zero or negative height/weight
    @Test
    public void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(0, 1.75));

        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, 0));

        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(-70, 1.75));
    }

    // Test Case 4: Invalid or extreme input values
    @Test
    public void testExtremeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(Double.NaN, 1.75));

        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, Double.POSITIVE_INFINITY));

        assertThrows(IllegalArgumentException.class,
                () -> calc.calculateBMI(70, 1e-200));
    }

    // Test Case 5: Intentional failure
    @Test
    public void testIntentionalFailure() {
        assertEquals("Normal weight", calc.getCategory(32.0));
    }
}
