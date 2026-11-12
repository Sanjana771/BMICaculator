
package com.example.BMI_Calculator1;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {

        if (!Double.isFinite(weight) || weight <= 0) {
            throw new IllegalArgumentException("Invalid weight");
        }

        if (!Double.isFinite(height) || height <= 0) {
            throw new IllegalArgumentException("Invalid height");
        }

        double bmi = weight / (height * height);

        if (!Double.isFinite(bmi)) {
            throw new IllegalArgumentException("Invalid BMI value");
        }

        return bmi;
    }

    public static String getCategory(double bmi) {

        if (!Double.isFinite(bmi) || bmi <= 0) {
            throw new IllegalArgumentException("Invalid BMI");
        }

        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal weight";
        }
        else if (bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}
