
package com.example.BMI_Calculator1;

import java.util.Scanner;

public class BMIApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in metres: ");
            double height = sc.nextDouble();

            double bmi = BMICalculator.calculateBMI(weight, height);

            String category = BMICalculator.getCategory(bmi);

            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("BMI Category: " + category);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }

        sc.close();
    }
}
